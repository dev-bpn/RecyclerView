package mobotech.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dell on 12/7/2015.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;

    Header header;
    List<SingleRowItem> listItems;

    public MyRecyclerAdapter(Header header, List<SingleRowItem> listItems)
    {
        this.header = header;
        this.listItems = listItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_HEADER)
        {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_item, parent, false);
            return  new VHHeader(v);
        }
        else if(viewType == TYPE_ITEM)
        {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_view, parent, false);
            return new VHItem(v);
        }
        throw new RuntimeException("there is no type that matches the type " + viewType + " + make sure your using types correctly");
    }

    private SingleRowItem getItem(int position)
    {
        return listItems.get(position);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof VHHeader)
        {
            VHHeader VHheader = (VHHeader)holder;
            VHheader.txtTitle.setText(header.getHeader());
        }
        else if(holder instanceof VHItem)
        {
            SingleRowItem currentItem = getItem(position-1);
            VHItem VHitem = (VHItem)holder;
            VHitem.txtName.setText(currentItem.getName());
            VHitem.iv.setBackgroundResource(currentItem.getId());
        }
    }

    //    need to override this method
    @Override
    public int getItemViewType(int position) {
        if(isPositionHeader(position))
            return TYPE_HEADER;
        return TYPE_ITEM;
    }

    private boolean isPositionHeader(int position)
    {
        return position == 0;
    }

    //increasing getItemcount to 1. This will be the row of header.
    @Override
    public int getItemCount() {
        return listItems.size()+1;
    }

    class VHHeader extends RecyclerView.ViewHolder{
        TextView txtTitle;
        public VHHeader(View itemView) {
            super(itemView);
            this.txtTitle = (TextView)itemView.findViewById(R.id.textViewHeader);
        }
    }

    class VHItem extends RecyclerView.ViewHolder{
        TextView txtName;
        ImageView iv;
        public VHItem(View itemView) {
            super(itemView);
            this.txtName = (TextView)itemView.findViewById(R.id.textViewName);
            this.iv = (ImageView)itemView.findViewById(R.id.imageViewIcon);
        }
    }
}
