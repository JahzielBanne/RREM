package com.example.rrem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class UsersFragment extends Fragment {

    Button NewUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        View view = inflater.inflate(R.layout.fragment_users, container, false);

        Toast.makeText(getActivity(), "Users Module", Toast.LENGTH_SHORT).show();

        // Initialize ArrayList and add items
        ArrayList<String> UsersList = new ArrayList<>();
        UsersList.add("Gregor Tumbook");
        UsersList.add("Nonoy Ukoy");
        UsersList.add("Staren Dimagiba");
        UsersList.add("WatHapenBella");
        UsersList.add("Rey Soriano");

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, UsersList);

        // Get the ListView and set the adapter
        ListView releaselistView = view.findViewById(R.id.UserList);
        releaselistView.setAdapter(adapter);

        return view;

    }

}