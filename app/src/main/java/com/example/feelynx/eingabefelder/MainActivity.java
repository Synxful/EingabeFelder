package com.example.feelynx.eingabefelder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    EditText editPw;
    EditText editMail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.editName);
        editPw = (EditText) findViewById(R.id.editPw);
        editMail = (EditText) findViewById(R.id.editMail);

        ArrayList<String> liste = new ArrayList<>();
        liste.add("Hallo");
    }
}
