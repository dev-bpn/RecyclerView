package mobotech.recyclerview;

import java.util.ArrayList;
import java.util.List;

import mobotech.recyclerview.model.Person;

/**
 * Created by Dell on 12/5/2015.
 */
public class MyDataList {

    private static List<Person> personList = new ArrayList<>();

    public static List<Person> getPersonData(){

        personList.add(new Person("Bipin" , "23" , R.drawable.bpn));
        personList.add(new Person("Dipin" , "18" , R.drawable.dpn));
        personList.add(new Person("Arun" , "23" , R.drawable.arun));
        personList.add(new Person("Dad" , "23" , R.drawable.dpn));
        personList.add(new Person("Mum" , "23" , R.drawable.bpn));

        return personList;
    }
}
