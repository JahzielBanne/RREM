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

public class ProductsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products, container, false);

        Toast.makeText(getActivity(), "Products Module", Toast.LENGTH_SHORT).show();
        ;

        // Initialize ArrayList and add items
        ArrayList<String> productItems = new ArrayList<>();
        productItems.add("Cement");
        productItems.add("Sand");
        productItems.add("Nails");
        productItems.add("White Rocks");
        productItems.add("Bamboo");
        productItems.add("Hardiflex");
        productItems.add("Gravel");
        productItems.add("Purlin");
        productItems.add("Pipe");
        productItems.add("Rebar");
        productItems.add("Glass");
        productItems.add("Switch");
        productItems.add("Circuit Breaker");

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, productItems);

        // Get the ListView and set the adapter
        ListView listView = view.findViewById(R.id.ViewProducts);
        listView.setAdapter(adapter);

        return view;

    }

}
