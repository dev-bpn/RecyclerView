package mobotech.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 12/7/2015.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    ArrayList<String> dataSet;

    public MyRecyclerViewAdapter(ArrayList<String> dataSet){
        this.dataSet = dataSet;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_view , parent , false);
        return (new ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.header.setText("Header: "+dataSet.get(position));
        holder.header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = dataSet.get(position);
                remove(string);
            }
        });
        holder.footer.setText("Footer: " + dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public void add(int position, String item) {
        dataSet.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = dataSet.indexOf(item);
        dataSet.remove(position);
        notifyItemRemoved(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView header;
        TextView footer;

        public ViewHolder(View itemView) {
            super(itemView);
            header = (TextView) itemView.findViewById(R.id.firstLine);
            footer = (TextView) itemView.findViewById(R.id.secondLine);
        }
    }
}
