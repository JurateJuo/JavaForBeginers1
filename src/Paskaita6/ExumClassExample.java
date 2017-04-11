package Paskaita6;

/**
 * Created by acmenukas on 2017-04-11.
 */
public class ExumClassExample {
    public static void main(String[] args) {
        System.out.println(Country.EE);
        System.out.println(Country.LT.getId());
        System.out.println(Country.LV.getLanguage());
    }

}

enum Country{
    LT(1, "lt"), LV(2, "lv"), EE(3, "ee");
    private int id;
    private String language;

    Country(int id, String language) {
        this.id = id;
        this.language= language;
    }

    public int getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }
}