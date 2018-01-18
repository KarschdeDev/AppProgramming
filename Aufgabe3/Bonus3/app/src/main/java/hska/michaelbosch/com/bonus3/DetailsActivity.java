package hska.michaelbosch.com.bonus3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.details_activity);


        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);
        TextView tvCategory = (TextView) findViewById(R.id.tvCategorie);
        TextView tvTeacher = (TextView) findViewById(R.id.tvTeacher);
        TextView tvRoom = (TextView) findViewById(R.id.tvRoom);
        TextView tvDate = (TextView) findViewById(R.id.tvDate);

        ImageView image = (ImageView) findViewById(R.id.image);

        tvTitle.setText("Informatik");
        tvCategory.setText("Musik");
        tvTeacher.setText("Pape");
        tvRoom.setText("201");
        tvDate.setText("12.12.2017");

        image.setImageResource(R.mipmap.ic_launcher);
    }
}
