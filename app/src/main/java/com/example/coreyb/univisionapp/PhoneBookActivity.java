package com.example.coreyb.univisionapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;


public class PhoneBookActivity extends ActionBarActivity {

    private EditText mContactText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_book);


        // List of items
        String[] contacts = {
                "Alex Fleig    x151", "Amanda Towsley    x100", "Brandon Frey    x260", "Chelsea Lang    x156",
                "Corey Batiuk    x252", "Dan Banks    x256", "Danny Williams    x257",
                "Eddie Inglis    x254", "Jason Lindsay    x261", "Jim Green    x150", "Korey McKinley    x262",
                "Mike Nelson    x259", "Mike Prosa    x253", "Sean Langley    x255", "Shari Fristo    x103",
                "Will Tanner    x266", "Lat Bailey    x251", "Brandon DelAgostino    x265", "Clay Nelson    x264"
        };
// Create an array adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts);

// Create a ListView object
        ListView listView = (ListView) findViewById(R.id.employeeListView);
// set the adapter to the view
        listView.setAdapter(adapter);


    }











    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_address_book, menu);
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
