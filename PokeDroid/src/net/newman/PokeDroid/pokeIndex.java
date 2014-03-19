package net.newman.PokeDroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class pokeIndex extends Activity {
    ListView contacts;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        contacts = (ListView) findViewById(R.id.contactList); //Link between the DOM XML and Java


    }
}
