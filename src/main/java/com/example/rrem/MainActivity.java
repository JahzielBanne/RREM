package com.example.rrem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity{

    Button btn, btn2, btn3, btn4;
    ListView dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dashboard = findViewById(R.id.listView);
        btn = findViewById(R.id.btnClick);
        btn2 = findViewById(R.id.btnClick2);
        btn3 = findViewById(R.id.btnClick3);
        btn4 = findViewById(R.id.btnClick4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideButtons();
                hideListView();
                Fragment fragment = new UsersFragment();

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.commit();


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideButtons();
                hideListView();
                Fragment fragment = new ProductsFragment();

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideButtons();
                hideListView();
                Fragment fragment = new ReceiveFragment();

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.commit();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideButtons();
                hideListView();
                Fragment fragment = new ReleaseFragment();

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.commit();

            }
        });

        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Cement");
        itemList.add("Sand");
        itemList.add("Nails");
        itemList.add("White Rocks");
        itemList.add("Bamboo");
        itemList.add("Hardiflex");
        itemList.add("Gravel");
        itemList.add("Purlin");
        itemList.add("Pipe");
        itemList.add("Rebar");
        itemList.add("Glass");
        itemList.add("Switch");
        itemList.add("Circuit Breaker");

        CustomAdapter adapter = new CustomAdapter(this, itemList);
        dashboard.setAdapter(adapter);
    }

    public class CustomAdapter extends ArrayAdapter<String> {

        private final Context context;
        private final ArrayList<String> values;

        public CustomAdapter(Context context, ArrayList<String> values) {
            super(context, android.R.layout.simple_list_item_1, values);
            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            TextView textView = rowView.findViewById(android.R.id.text1);
            textView.setText(values.get(position));
            return rowView;
        }
    }


    private void hideListView() {
        dashboard.setVisibility(View.GONE);
    }

    private void showListView() {
        dashboard.setVisibility(View.VISIBLE);
    }

    private void hideButtons() {
        btn.setVisibility(View.GONE);
        btn2.setVisibility(View.GONE);
        btn3.setVisibility(View.GONE);
        btn4.setVisibility(View.GONE);

    }
    private void showProductsFragment() {
        Fragment fragment = new ProductsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }



}