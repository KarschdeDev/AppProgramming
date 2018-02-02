package hska.michaelbosch.com.bonus.pojo;

import android.graphics.Color;

/**
 * Created by Michael on 19.01.2018.
 */

public enum OfferCategory {

    Think("Denken", Color.MAGENTA),
    Crafts("Handwerk", Color.GRAY),
    Music("Musik", Color.BLUE),
    Social_Sciences("Sozialwissenschaften", Color.GREEN),
    Fitness("Sport_Tanzen", Color.CYAN),
    Languages("Sprachen", Color.DKGRAY),
    Sciences("Wissenschaften", Color.RED),
    Others("Sonstiges", Color.YELLOW);

    private int color;
    private String name;

    OfferCategory(String name, int color) {
        this.color = color;
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
