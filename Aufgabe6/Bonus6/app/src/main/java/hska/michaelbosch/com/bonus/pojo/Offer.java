package hska.michaelbosch.com.bonus.pojo;

/**
 * Created by Michael on 18.01.2018.
 */

import android.provider.BaseColumns;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

@Table(name = "Offer", id = BaseColumns._ID)
public class Offer extends Model {

    @Expose
    @Column(name = "Image")
    private int image;

    @Expose
    @Column(name = "name")
    private String name;

    @Expose
    @Column(name = "category")
    private OfferCategory offerCategory;

    @Expose
    @Column(name = "teacher")
    private String teacher;

    @Expose
    @Column(name = "room")
    private String room;

    @Expose
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
