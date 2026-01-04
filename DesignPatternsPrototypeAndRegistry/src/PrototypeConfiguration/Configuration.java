package PrototypeConfiguration;

public class Configuration implements ClonableObject<Configuration> {
    private String themeColor;
    private Boolean autoSave;
    private String langauge;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public Configuration(String themeColor, Boolean autoSave, String langauge, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.langauge = langauge;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public void setAutoSave(Boolean autoSave) {
        this.autoSave = autoSave;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(Boolean darkMode) {
        this.darkMode = darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    public void setType(ConfigurationType type) {
        this.type = type;
    }

    @Override
    public Configuration cloneObject() {
        return new Configuration(this.themeColor, this.autoSave, this.langauge, this.darkMode, this.fontSize, this.fontFamily, this.type);
    }
}
