package com.example.androidstringfunctions;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editString1, editString2;
    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void addStrings_click(View view) {
        editString1  = (EditText) findViewById(R.id.editTextString1);
        editString2  = (EditText) findViewById(R.id.editTextString2);
        textOutput  = (TextView) findViewById(R.id.textViewOutput);

        textOutput.setText(editString1.getText() + " " + editString2.getText());
    }

    public void compareStrings_click(View view) {
        editString1  = (EditText) findViewById(R.id.editTextString1);
        editString2  = (EditText) findViewById(R.id.editTextString2);
        textOutput  = (TextView) findViewById(R.id.textViewOutput);

        String output = "Not Matching";

        String str1 = editString1.getText().toString();
        String str2 = editString2.getText().toString();

        if (str1.equals(str2))
            output = "Matching";

        textOutput.setText(output);
    }

    public void countVowels_click(View view) {
        editString1  = (EditText) findViewById(R.id.editTextString1);
        editString2  = (EditText) findViewById(R.id.editTextString2);
        textOutput  = (TextView) findViewById(R.id.textViewOutput);

        Integer result = 0;

        char[] str1 = editString1.getText().toString().toCharArray();
        char[] str2 = editString2.getText().toString().toCharArray();

        for (int i=0; i<str1.length; i++) {
            char current = str1[i];

            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u')
                result++;
        }

        for (int i=0; i<str2.length; i++) {
            char current = str2[i];

            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u')
                result++;
        }

        textOutput.setText(result.toString());
    }
}