package com.example.coffeeshopfinal;

import static com.example.coffeeshopfinal.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class CoffeeitemActivity extends AppCompatActivity {
    private double price;
    private TextView orderSummary;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_coffeeitem);

        price = 0.0;
        orderSummary = findViewById(id.orderSummary);
        radioGroup = findViewById(id.radioGroup);

        Button buttonBlackCoffee = findViewById(id.button_black_coffee);
        Button placeOrder = findViewById(id.placeOrder);

        buttonBlackCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = 2.50; // Set the price for Black Coffee
                updateOrderSummary();
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == id.radio_small) {
                    price *= 1.0;
                } else if (checkedId == id.radio_medium) {
                    price *= 1.5;
                } else if (checkedId == id.radio_large) {
                    price *= 2.0;
                }
                updateOrderSummary();
            }
        });

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the order placement, e.g., send it to a server or display a confirmation message
                String orderMessage = "Total Order: $" + price;
                orderSummary.setText(orderMessage);
            }
        });
    }

    private void updateOrderSummary() {
        String orderMessage = "Total Order: $" + price;
        orderSummary.setText(orderMessage);
    }
}
