package hska.michaelbosch.com.bonus.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Michael on 18.01.2018.
 */

@Table(name = "OffersForTime")
public class OffersForTime extends Model{

    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    @Column(name="date")
    private Date date;

    public OffersForTime() {
        super();
    }

    public OffersForTime(String time) throws ParseException {
        setTime(time);
    }

    public void add(Offer offer){
        if (offer.getRefToTime() != null) {
            offer = new Offer(offer.getImage(),offer.getName(), offer.getOfferCategory(), offer.getTeacher(), offer.getRoom());
        }
        offer.setRefToTime(this);
        offer.save();
    }

    public List<Offer> getOffers() {
        return getMany(Offer.class, "refToTime");
    }

    public String getTime() {
        return sdf.format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setTime(String timeAsText) throws ParseException {
        this.date = sdf.parse(timeAsText);
    }
}
