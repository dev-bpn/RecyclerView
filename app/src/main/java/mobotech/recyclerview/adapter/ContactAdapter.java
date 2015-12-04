package mobotech.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mobotech.recyclerview.R;
import mobotech.recyclerview.model.ContactInfo;
import mobotech.recyclerview.view_holder.ContactViewHolder;

/**
 * Created by Dell on 12/4/2015.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<ContactInfo> contactList ;

    public ContactAdapter(List<ContactInfo> contactList){
        this.contactList = contactList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row , parent , false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        ContactInfo contactInfo = contactList.get(position);
        holder.vName.setText(contactInfo.name);
        holder.vSurname.setText(contactInfo.surname);
        holder.vEmail.setText(contactInfo.email);
        holder.vTitle.setText(contactInfo.name + " " + contactInfo.surname);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
