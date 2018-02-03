package hska.michaelbosch.com.bonus.pojo;

/**
 * Created by Michael on 18.01.2018.
 */

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Offer")
public class Offer extends Model {

    @Column(name = "Image")
    private int image;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private OfferCategory offerCategory;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "room")
    private String room;

    @Column(name = "refToTime")
    private OffersForTime refToTime;


    public Offer() {
        super();
    }

    public Offer(int image, String category, OfferCategory color, String teacher, String room) {
        super();
        this.image = image;
        this.name = category;
        this.offerCategory = color;
        this.teacher = teacher;
        this.room = room;
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

    public void setRefToTime(OffersForTime refToTime) {
        this.refToTime = refToTime;
    }

    public OffersForTime getRefToTime() {
        return refToTime;
    }
}
