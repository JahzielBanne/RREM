package com.example.rrem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;
import java.util.ArrayList;


public class ReceiveFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receive, container, false);

        Toast.makeText(getActivity(), "Receive Module", Toast.LENGTH_SHORT).show();

        // Initialize ArrayList and add items
        ArrayList<String> ReceiveList = new ArrayList<>();
        ReceiveList.add("#100302");
        ReceiveList.add("#021403");
        ReceiveList.add("#092855");
        ReceiveList.add("#080863");
        ReceiveList.add("#122510");

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, ReceiveList);

        // Get the ListView and set the adapter
        ListView receivelistView = view.findViewById(R.id.ReceivingList);
        receivelistView.setAdapter(adapter);

        return view;

    }
}