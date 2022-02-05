package com.example.project_3c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));
    }

    private String createOrderSummary(int price) {
        String priceMessage = "Name : Parth7D2";
        priceMessage += "\nQuantity : " + quantity;
        priceMessage += "\nTotal : $" + price;
        priceMessage += "\nThank You";
        return priceMessage;
    }

    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_value_view);
        priceTextView.setText(message);
    }

    private void displayQuantity(int numbers) {
        // Finding the quantity initial value
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value_view);

        // Setting new value to the quantity text view
        quantityTextView.setText(" " + numbers);
    }
}