package mobotech.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataObjectModel> dataSet = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DataObjectModel dataObjectModel;

        dataObjectModel = new DataObjectModel("Title 1" , "Desc 1");
        dataSet.add(dataObjectModel);
        dataObjectModel = new DataObjectModel("Title 2" , "Desc 2");
        dataSet.add(dataObjectModel);
        dataObjectModel = new DataObjectModel("Title 3" , "Desc 3");
        dataSet.add(dataObjectModel);
        dataObjectModel = new DataObjectModel("Title 4" , "Desc 4");
        dataSet.add(dataObjectModel);

        recyclerView.setAdapter(new MyRecyclerViewAdapter(dataSet));
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
