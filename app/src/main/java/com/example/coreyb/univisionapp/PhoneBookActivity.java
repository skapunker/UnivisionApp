package com.example.coreyb.univisionapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class PhoneBookActivity extends ActionBarActivity {

    private EditText mContactText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_book);

/*
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
*/

        ArrayList<Contacts> contacts = new ArrayList<Contacts>();
        contacts.add( new Contacts("Corey Batiuk", "x252") );
        contacts.add( new Contacts("Name 2", "8888888888") );
        contacts.add( new Contacts("Name 3", "7777777777") );
        contacts.add( new Contacts("Name 4", "6666666666") );
        contacts.add( new Contacts("Name 5", "5555555555") );
        contacts.add( new Contacts("Name 6", "4444444444") );
        contacts.add( new Contacts("Name 7", "3333333333") );
        contacts.add( new Contacts("Name 8", "2222222222") );
        contacts.add( new Contacts("Name 9", "1111111111") );
        contacts.add(new Contacts("Name 10", "0000000000"));

        CustomAdapter adapter = new CustomAdapter(this, contacts);

        ListView listView = (ListView)findViewById(R.id.employeeListView);
        listView.setAdapter(adapter);

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + 4062414894));
                startActivity(callIntent);
            }
        });



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
