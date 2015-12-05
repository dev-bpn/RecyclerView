package mobotech.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        DataModel dataModel0 = new DataModel("MahText000" , R.mipmap.ic_launcher);
        DataModel dataModel1 = new DataModel("MahText111" , R.mipmap.ic_launcher);
        DataModel dataModel2 = new DataModel("MahText222" , R.mipmap.ic_launcher);
        DataModel dataModel3 = new DataModel("MahText333" , R.mipmap.ic_launcher);
        DataModel dataModel4 = new DataModel("MahText444" , R.mipmap.ic_launcher);
        DataModel dataModel5 = new DataModel("MahText555" , R.mipmap.ic_launcher);

        List<DataModel> dataModelList = new ArrayList<>();
        dataModelList.add(dataModel0);
        dataModelList.add(dataModel1);
        dataModelList.add(dataModel2);
        dataModelList.add(dataModel3);

        adapter.updateList(dataModelList);

        adapter.addItem(4, dataModel4);
        adapter.addItem(5 , dataModel5);

        adapter.removeItem(2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
