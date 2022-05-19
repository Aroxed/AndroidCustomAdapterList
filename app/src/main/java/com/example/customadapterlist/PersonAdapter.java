package com.example.customadapterlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {
    private static final String TAG = PersonAdapter.class.getSimpleName();

    List<Person> personList;

    public PersonAdapter(Context context, int resource, List<Person> objects) {
        super(context, resource, objects);

        personList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        Person currentPerson = personList.get(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.person_list_item, parent, false);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPerson.getName());

        TextView ageTextView = (TextView) listItemView.findViewById(R.id.age_text_view);
        ageTextView.setText(currentPerson.getAge());


        return listItemView;
    }
}