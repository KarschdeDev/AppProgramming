package hska.michaelbosch.com.bonus.pojo;

/**
 * Created by Michael on 18.01.2018.
 */
public class Offer {

    private int image;
    private String name;
    private OfferCategory offerCategory;
    private String teacher;
    private String room;
    private String time;

    public Offer(int image, String category, OfferCategory color, String teacher, String room) {
        this.image = image;
        this.name = category;
        this.offerCategory = color;
        this.teacher = teacher;
        this.room = room;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OfferCategory getOfferCategory() {
        return offerCategory;
    }

    public void setOfferCategory(OfferCategory offerCategory) {
        this.offerCategory = offerCategory;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
