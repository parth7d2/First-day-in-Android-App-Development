package com.example.project_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // When we click plus button
    public void increment(View view) {
        num = num + 1;
        display(num);
    }
    // When we click minus button
    public void decrement(View view) {
        num = num - 1;
        display(num);
    }
    // When we click order button
    public void submitOrder(View view) {
        displayPrice(num * 5);
    }

    private void display(int numbers) {
        // Finding the quantity initial value
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value_view);

        // Setting new value to the quantity text view
        quantityTextView.setText(" " + numbers);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_value_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
