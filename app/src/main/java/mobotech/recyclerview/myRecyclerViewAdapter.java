package mobotech.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 12/7/2015.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    ArrayList<NatureItemModel> dataSet = new ArrayList<>();

    public MyRecyclerViewAdapter(){

        NatureItemModel natureItemModel = new NatureItemModel("Nature Item 1" ,
                "Blahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh Blahh"
                , R.drawable.a);
        dataSet.add(natureItemModel);

        natureItemModel = new NatureItemModel("Nature Item 2" ,
                "Blahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh Blahh"
                , R.drawable.b);
        dataSet.add(natureItemModel);

        natureItemModel = new NatureItemModel("Nature Item 3" ,
                "Blahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh Blahh"
                , R.drawable.c);
        dataSet.add(natureItemModel);

        natureItemModel = new NatureItemModel("Nature Item 4" ,
                "Blahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh Blahh"
                , R.drawable.d);
        dataSet.add(natureItemModel);

        natureItemModel = new NatureItemModel("Nature Item 5" ,
                "Blahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh BlahhBlahh vlahh Blahh"
                , R.drawable.e);
        dataSet.add(natureItemModel);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_view , parent , false);
        return (new ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.title.setText(dataSet.get(position).getName());
        holder.desc.setText(dataSet.get(position).getDes());
        holder.imageView.setImageResource(dataSet.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title , desc;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_nature);
            desc = (TextView) itemView.findViewById(R.id.tv_des_nature);
            imageView = (ImageView) itemView.findViewById(R.id.img_thumbnail);
        }
    }
}
