package hska.michaelbosch.com.bonus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

import hska.michaelbosch.com.bonus.pojo.Offer;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.details_activity);

        Bundle extras = getIntent().getExtras();
        Offer offer = null;
        if (extras != null) {
            offer= new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().fromJson(extras.getString("data"), Offer.class);
        }



        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);
        TextView tvCategory = (TextView) findViewById(R.id.tvCategorie);
        TextView tvTeacher = (TextView) findViewById(R.id.tvTeacher);
        TextView tvRoom = (TextView) findViewById(R.id.tvRoom);
        TextView tvDate = (TextView) findViewById(R.id.tvDate);

        ImageView image = (ImageView) findViewById(R.id.image);

        if (offer != null) {
            tvTitle.setText(offer.getName());
            tvCategory.setText(offer.getOfferCategory().getName());
            tvTeacher.setText(offer.getTeacher());
            tvRoom.setText(offer.getRoom());
            tvDate.setText(offer.getRefToTime().getTime());

            image.setImageResource(offer.getImage());
        }

    }
}
