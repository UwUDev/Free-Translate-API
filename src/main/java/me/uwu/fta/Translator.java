package me.uwu.fta;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Translator {

    public Translator(){}

    public String translate(String text, EnumLang from, EnumLang to) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + from.toString() +"&tl=" + to.toString() + "&dt=t&q=" + text)
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        String result = response.body().string();
        System.out.println(result);

        result = result.split("\n")[0];
        result = result.replace("\"", "").replace("[", "").replace("]", "");
        String[] filter = result.split(",");
        if(to.hasSyntax()) { //some languages doesn't have ","
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < (filter.length - 4) / 2; i++)
                sb.append(filter[i]).append(",");

            result = sb.substring(0, sb.toString().length() - 1);
        } else {
            result = filter[0];
        }

        client.dispatcher().cancelAll();// Idk why bu somtimes that stay on :/
        return result;
    }
}
