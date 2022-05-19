package com.example.customadapterlist;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> personList;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personList = new ArrayList<>();
        personList.add(new Person("Paul", "25"));
        personList.add(new Person("John", "42"));
        personList.add(new Person("Mike", "30"));
        personList.add(new Person("Tom", "47"));

        personAdapter = new PersonAdapter(this, 0, personList);

        ListView listView = (ListView) findViewById(R.id.names_list_view);
        listView.setAdapter(personAdapter);
    }
}