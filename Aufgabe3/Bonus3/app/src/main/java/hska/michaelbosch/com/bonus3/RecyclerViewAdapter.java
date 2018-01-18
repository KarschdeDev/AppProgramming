package hska.michaelbosch.com.bonus3;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import hska.michaelbosch.com.bonus3.pojo.Offer;

/**
 * Created by Michael on 18.01.2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {

    private ArrayList<Offer> offers;
    private RecyclerView.LayoutManager layoutManager;
    private Context context;

    public RecyclerViewAdapter(ArrayList<Offer> offers, Context context) {
        this.offers = offers;
        this.context = context;
        layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LinearLayout layout = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);

        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Offer offer = offers.get(position);
        holder.tvCategory.setText(offer.getCategory());
        holder.cardView.setBackgroundColor(offer.getColor());
        holder.imageView.setImageResource(offer.getImage());
    }

    @Override
    public int getItemCount() {
        return offers.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCategory;
        private CardView cardView;
        private ImageView imageView;
        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.image_view_cat);
            tvCategory = (TextView) view.findViewById(R.id.tvCategorie);
            cardView = (CardView) view.findViewById(R.id.card_view);
        }
    }


}
