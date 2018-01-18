package hska.michaelbosch.com.bonus3.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Michael on 18.01.2018.
 */

public class OffersForTime {

    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    private ArrayList<Offer> offers;
    private Date date;

    public OffersForTime(String time) throws ParseException {
        this.offers = new ArrayList<>();
        setTime(time);
    }

    public void add(Offer offer){
        offers.add(offer);
    }

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<Offer> offers) {
        this.offers = offers;
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
