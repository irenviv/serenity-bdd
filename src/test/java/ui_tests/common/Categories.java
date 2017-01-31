package ui_tests.common;

/**
 * Created by Iryna_Minchekova on 1/31/2017.
 */
public enum Categories {

    ALL_CATEGORIES ("All Categories");

    private String item;

    Categories(String item) {
        this.item = item;
    }

    public String getValue(){
        return this.item;
    }
}
