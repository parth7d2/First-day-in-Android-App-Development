package com.example.project_4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // When we click plus button
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    // When we click minus button
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    private int calculatePrice() {
        return quantity * 5;
    }

    // When we click order button
    public void submitOrder(View view) {
        // tea checkbox;
        CheckBox teaCheckBox = (CheckBox) findViewById(R.id.tea_checkbox_view);
        boolean hasTea = teaCheckBox.isChecked();

        // coffee checkbox;
        CheckBox coffeeCheckBox = (CheckBox) findViewById(R.id.coffee_checkbox_view);
        boolean hasCoffee = coffeeCheckBox.isChecked();

        int price = calculatePrice();
        displayMessage(createOrderSummary(price, hasTea, hasCoffee));
    }

    private String createOrderSummary(int price, boolean addTea, boolean hasCoffee) {
        String priceMessage = "Name : Parth7D2";
        priceMessage += "\nAdd tea? " + addTea;
        priceMessage += "\nAdd coffee? " + hasCoffee;
        priceMessage += "\nQuantity : " + quantity;
        priceMessage += "\nTotal : $" + price;
        priceMessage += "\nThank You";
        return priceMessage;
    }

    public void displayMessage(String message) {
        TextView orderSummaryView = (TextView) findViewById(R.id.order_summary_value_view);
        orderSummaryView.setText(message);
    }

    private void displayQuantity(int numbers) {
        // Finding the quantity initial value
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value_view);

        // Setting new value to the quantity text view
        quantityTextView.setText(" " + numbers);
    }

}