package hska.michaelbosch.com.bonus3.pojo;

/**
 * Created by Michael on 18.01.2018.
 */

public class Offer {

    private int image;
    private String category;
    private int color;

    public Offer(int image, String category, int color) {
        this.image = image;
        this.category = category;
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
