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



public class ReleaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_release, container, false);

        Toast.makeText(getActivity(), "Release Module", Toast.LENGTH_SHORT).show();

        // Initialize ArrayList and add items
        ArrayList<String> ReleaseList = new ArrayList<>();
        ReleaseList.add("#100302");
        ReleaseList.add("#021403");
        ReleaseList.add("#092855");
        ReleaseList.add("#080863");
        ReleaseList.add("#122510");

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, ReleaseList);

        // Get the ListView and set the adapter
        ListView releaselistView = view.findViewById(R.id.ReleasingList);
        releaselistView.setAdapter(adapter);

        return view;



    }
}