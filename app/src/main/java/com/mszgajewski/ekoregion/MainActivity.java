package com.mszgajewski.ekoregion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

   private AutoCompleteTextView  autoCompleteTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] lokalizacja = getResources().getStringArray(R.array.Lokalicacja);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.dropdown_item, lokalizacja);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(arrayAdapter);

        autoCompleteTextView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                autoCompleteTextView.setSelection(0);

                switch (position) {
                    case 1:
                        Toast.makeText( MainActivity.this, "Wybrałeś: Majków Duży", Toast.LENGTH_SHORT ).show();
                        break;
                    case 2:
                        Toast.makeText( getApplicationContext(), "Wybrałeś: Bujny", Toast.LENGTH_SHORT ).show();
                        break;
                    case 3:
                        Toast.makeText( getApplicationContext(), "Wybrałeś: Mzurki", Toast.LENGTH_SHORT ).show();
                        break;

                    default:
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "nothing ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

}

