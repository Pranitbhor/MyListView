package mytestproject.com.mylistview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);


        final String[] values = new String[]{
                "hello my list view",
                "asdsad",
                "I love this",
                "Hello Friends",
                "Android is great!",
                "@pranit",
                "Hello Friends",
                "Android is great!",

                "Android is great!"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,android.R.id.text1,
                values);

        //assign the adapter to listview
        listView.setAdapter(adapter);

        //set onClick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int intPosition = position;
                String clickedValue = listView.getItemAtPosition(intPosition).toString();

                Toast.makeText(getApplicationContext(), clickedValue, Toast.LENGTH_LONG).show();


            }
        });



    }



















}
