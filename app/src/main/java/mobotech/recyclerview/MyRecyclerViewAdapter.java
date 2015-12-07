package mobotech.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Dell on 12/7/2015.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    ArrayList<DataObjectModel> dataSet = new ArrayList<>();

    public MyRecyclerViewAdapter(ArrayList<DataObjectModel> dataSet){
        this.dataSet = dataSet;
    }

    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_view , parent , false);
        return (new ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.textView1.setText(dataSet.get(position).getmText1());
        holder.textView2.setText(dataSet.get(position).getmText2());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public void addItem(DataObjectModel dataObj, int index) {
        dataSet.add(dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        dataSet.remove(index);
        notifyItemRemoved(index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView1;
        TextView textView2;

        public ViewHolder(View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.textView);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            Toast.makeText(view.getContext() , "Clicked" , Toast.LENGTH_SHORT).show();

        }
    }
}
