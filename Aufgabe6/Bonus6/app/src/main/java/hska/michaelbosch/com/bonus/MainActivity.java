package hska.michaelbosch.com.bonus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hska.michaelbosch.com.bonus.pojo.OfferCategory;
import hska.michaelbosch.com.bonus.pojo.Offer;
import hska.michaelbosch.com.bonus.pojo.OffersForTime;
import com.activeandroid.ActiveAndroid;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActiveAndroid.initialize(this);

        setContentView(R.layout.main_activity);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        List<OffersForTime> offersForTimes = DatabaseModel.INSTANCE.getData();

        if (offersForTimes == null || offersForTimes.size() == 0){
            DatabaseModel.INSTANCE.initData();
            offersForTimes = DatabaseModel.INSTANCE.getData();
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
