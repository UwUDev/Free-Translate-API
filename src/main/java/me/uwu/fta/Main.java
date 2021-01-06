package me.uwu.fta;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Translator translator = new Translator();

        /*for (EnumLang lang : EnumLang.values()){ TODO: NEVER do this, you will be blacklisted :/
            if (lang != EnumLang.FRENCH)
                System.out.println(lang.toString() + ": " + translator.translate("Salut, vas bien ?", EnumLang.FRENCH, lang));
        }*/
        System.out.println(translator.translate("Salut, vas bien ?", EnumLang.FRENCH, EnumLang.ENGLISH));
    }
}
