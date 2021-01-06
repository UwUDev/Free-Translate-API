package me.uwu.fta;

public enum EnumLang {
    ARABIC("ar_dz", false),
    CHINESE("zh_Hant", false),
    CHINESE_SIMPLE("zh_Hans", false),
    ENGLISH("en_en", true),
    ENGLISH_US("en_us", true),
    FRENCH("fr_fr", true),
    FRENCH_CANADA("fr_ca", true),
    GERMAN("de_de", true),
    GREEK("el_gr", true),
    HAWAIIAN("haw", true),
    HEBREW("he", true),
    HINDI("hi_in", true),
    HUNGARIAN("hu_hu", true),
    ICELANDIC("is", true),
    IGBO("ig", true),
    INDIAN("bn_in", true),
    IRISH("ga", true),
    ITALIAN("it_it", true),
    JAPANESE("ja_jp", false),
    LATIN("az_latn", true),
    LITHUANIAN("lt_lt", true),
    MACEDONIAN("mk_mk", true),
    MALAGASY("mg_mg", true),
    MALAYAN("ms", true),
    NEPALI("ne_np", true),
    PERSIAN("fa", false),
    POLISH("pl_pl", true),
    PORTUGUESE("pt_pt", true),
    ROMANIAN("ro_ro", true),
    RUSSIAN("ru", true),
    SERBIAN("sr", true),
    SOMALIAN("so", true),
    SPANISH("es_es", false),
    SWEDISH("sv", true),
    THAI("th_th", false),
    TURKISH("tr_tr", true),
    UKRAINIAN("uk_ua", true),
    URDU("ur", false),
    VIETNAMESE("vi_vn", true),
    ZULU("zu_za", true)
    ;

    private final String text;
    private final boolean syntax;

    /**
     * @param text
     * @param syntax
     */
    EnumLang(final String text, final boolean syntax) {
        this.text = text;
        this.syntax = syntax;
    }

    @Override
    public String toString() {
        return text;
    }

    public boolean hasSyntax() {
        return this.syntax;
    }
}
