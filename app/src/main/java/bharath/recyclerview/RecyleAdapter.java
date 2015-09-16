package bharath.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bharath on 16-Sep-15.
 */
public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.EventViewHolder> {

    List<MainActivity.Events> events;



    RecyleAdapter(List<MainActivity.Events> events){

        this.events = events;
    }



    public static class EventViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView eventName;
        TextView eventId;



        EventViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            eventName = (TextView) itemView.findViewById(R.id.event_name);
            eventId = (TextView) itemView.findViewById(R.id.event_id);

        }


    }
    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler, viewGroup, false);
        EventViewHolder pvh = new EventViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {
        eventViewHolder.eventName.setText(events.get(i).name);
        eventViewHolder.eventId.setText(events.get(i).id);


    }

    @Override
    public int getItemCount() {
        return events.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}



