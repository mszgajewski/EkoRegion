package com.mszgajewski.ekoregion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Połaczenie z firebase udane",
                Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }
    
     public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.lokalizacja:
                LOCATION_SERVICE(info.id);
                return true;
            case R.id.Ustawienia:
                SEARCH_SERVICE(info.id);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    private void SEARCH_SERVICE(long id) {
    }

    private void LOCATION_SERVICE(long id) {
    }
}
