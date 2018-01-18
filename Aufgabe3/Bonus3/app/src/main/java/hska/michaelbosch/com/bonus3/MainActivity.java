package hska.michaelbosch.com.bonus3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import hska.michaelbosch.com.bonus3.pojo.Offer;
import hska.michaelbosch.com.bonus3.pojo.OffersForTime;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<OffersForTime> offersForTimes = new ArrayList<>();
        try {
            OffersForTime dataSet8 = new OffersForTime("08:00");
            dataSet8.add(new Offer(R.mipmap.ic_launcher_round,"Morgenkreis", Color.GRAY));
            dataSet8.add(new Offer(R.mipmap.ic_launcher_round,"Mathematik 3", Color.GREEN));

            OffersForTime dataSet9 = new OffersForTime("09:00");
            dataSet9.add(new Offer(R.mipmap.ic_launcher_round,"Deutsch Werke", Color.MAGENTA));
            dataSet9.add(new Offer(R.mipmap.ic_launcher_round,"Geschichte", Color.YELLOW));

            OffersForTime dataSet93 = new OffersForTime("09:30");
            dataSet93.add(new Offer(R.mipmap.ic_launcher_round,"Geschichte", Color.YELLOW));

            OffersForTime dataSet10 = new OffersForTime("10:00");
            dataSet10.add(new Offer(R.mipmap.ic_launcher_round,"Rechnen", Color.GREEN));
            dataSet10.add(new Offer(R.mipmap.ic_launcher_round,"Sport", Color.RED));

            OffersForTime dataSet11 = new OffersForTime("11:00");
            dataSet11.add(new Offer(R.mipmap.ic_launcher_round,"Deutsch Werke", Color.MAGENTA));
            dataSet11.add(new Offer(R.mipmap.ic_launcher_round,"Geschichte", Color.YELLOW));

            offersForTimes.add(dataSet9);
            offersForTimes.add(dataSet93);
            offersForTimes.add(dataSet10);
            offersForTimes.add(dataSet11);
            offersForTimes.add(dataSet8);

        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error while parsing data",Toast.LENGTH_LONG).show();
        }

        Collections.sort(offersForTimes, new Comparator<OffersForTime>() {
            @Override
            public int compare(OffersForTime o1, OffersForTime o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });

        adapter = new RecyclerViewContainerAdapter(offersForTimes, this);
        recyclerView.setAdapter(adapter);

    }


}
