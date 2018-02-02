package hska.michaelbosch.com.bonus;

import android.widget.Toast;

import java.text.ParseException;
import java.util.List;

import hska.michaelbosch.com.bonus.pojo.Offer;
import hska.michaelbosch.com.bonus.pojo.OfferCategory;
import hska.michaelbosch.com.bonus.pojo.OffersForTime;

import com.activeandroid.query.Select;

/**
 * Created by Michael on 02.02.2018.
 */

public enum DatabaseModel {

    INSTANCE;


    public List<OffersForTime> getData(){
        List<OffersForTime> items = new Select().from(OffersForTime.class).orderBy("date desc").execute();

        return items;
    }


    public void initData(){
        try {

            Offer morgen  = new Offer(R.mipmap.ic_launcher_round, "Morgenkreis", OfferCategory.Others, "Pape", "203");
            Offer mathe3  = new Offer(R.mipmap.ic_launcher_round, "Mathematik 3", OfferCategory.Sciences, "Laubenheimer", "203");
            Offer german  = new Offer(R.mipmap.ic_launcher_round, "Deutsch Werke", OfferCategory.Languages, "Laubenheimer", "203");
            Offer history = new Offer(R.mipmap.ic_launcher_round, "Geschichte", OfferCategory.Sciences, "Pape", "203");
            Offer fitness = new Offer(R.mipmap.ic_launcher_round, "Sport", OfferCategory.Fitness, "Körner", "304");
            Offer calc    = new Offer(R.mipmap.ic_launcher_round, "Rechnen", OfferCategory.Think, "Laubenheimer", "203");

            morgen.save();
            mathe3.save();
            german.save();
            history.save();
            fitness.save();
            calc.save();

            OffersForTime dataSet8 = new OffersForTime("08:00");
            dataSet8.save();
            dataSet8.add(morgen);
            dataSet8.add(mathe3);

            OffersForTime dataSet9 = new OffersForTime("09:00");
            dataSet9.save();
            dataSet9.add(german);
            dataSet9.add(history);
            dataSet9.add(fitness);
            dataSet9.add(mathe3);

            OffersForTime dataSet93 = new OffersForTime("09:30");
            dataSet93.save();
            dataSet93.add(history);

            OffersForTime dataSet10 = new OffersForTime("10:00");
            dataSet10.save();
            dataSet10.add(calc);
            dataSet10.add(fitness);

            OffersForTime dataSet11 = new OffersForTime("11:00");
            dataSet11.save();
            dataSet11.add(german);
            dataSet11.add(history);



        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
