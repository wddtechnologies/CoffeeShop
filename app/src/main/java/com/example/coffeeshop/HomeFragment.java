package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



import android.widget.TextView;



public class HomeFragment extends Fragment {
    Button button;
    TextView order_coffee;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        button = view.findViewById(R.id.phone_call);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the PhoneCall activity
                Intent intent = new Intent(requireContext(), PhoneCall.class);
                startActivity(intent);
            }
        });

        // Find the TextView with id coffee_items in your layout
        order_coffee = view.findViewById(R.id.coffee_items);

        order_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), Coffeeitems.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

