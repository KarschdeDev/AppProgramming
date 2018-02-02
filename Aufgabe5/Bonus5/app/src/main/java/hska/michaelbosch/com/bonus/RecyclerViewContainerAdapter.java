package hska.michaelbosch.com.bonus;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import hska.michaelbosch.com.bonus.pojo.OffersForTime;

/**
 * Created by Michael on 18.01.2018.
 */

public class RecyclerViewContainerAdapter extends RecyclerView.Adapter<RecyclerViewContainerAdapter.ViewHolder>  {

    private List<OffersForTime> offers;
    private RecyclerView.LayoutManager layoutManager;
    private Context context;

    public RecyclerViewContainerAdapter(List<OffersForTime> offers, Context context) {
        this.offers = offers;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LinearLayout layout = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_container, parent, false);

        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.buttonTime.setText(""+offers.get(position).getTime());
        layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        holder.recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(offers.get(position).getOffers(), context);
        holder.recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return offers.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        private Button buttonTime;

        public ViewHolder(View view) {
            super(view);
            buttonTime = (Button) view.findViewById(R.id.button_time);
            recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_container);

            recyclerView.setHasFixedSize(true);
        }
    }


}
