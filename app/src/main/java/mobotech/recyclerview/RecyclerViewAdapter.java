package mobotech.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mobotech.recyclerview.model.Person;

/**
 * Created by Dell on 12/5/2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PersonViewHolder> {

    private List<Person> personList;
    public RecyclerViewAdapter(List<Person> personList){
        this.personList = personList;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_view , parent , false);
        return (new PersonViewHolder(view));
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.personName.setText(personList.get(position).name);
        holder.personAge.setText(personList.get(position).age);
        holder.personPhoto.setImageResource(personList.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        public PersonViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);

        }
    }
}
