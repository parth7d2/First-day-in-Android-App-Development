package com.example.project_5c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        if (quantity == 100) {
            Toast.makeText(this, "You can't have more then 100 items", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    // When we click minus button
    public void decrement(View view) {
        if (quantity == 0) {
            Toast.makeText(this, "You can't have less then 1 item", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    private int calculatePrice(boolean addTea, boolean addCoffee) {
        int baseprice = 5;
        if (addTea) {
            baseprice += 2;
        }
        if (addCoffee) {
            baseprice += 1;
        }
        return quantity * baseprice;
    }

    // When we click order button
    public void submitOrder(View view) {
//        // name edittext;
//        EditText nameEditText = (EditText) findViewById(R.id.name_edit_view);
//        String name = nameEditText.getText().toString();
//        // tea checkbox;
//        CheckBox teaCheckBox = (CheckBox) findViewById(R.id.tea_checkbox_view);
//        boolean hasTea = teaCheckBox.isChecked();
//
//        // coffee checkbox;
//        CheckBox coffeeCheckBox = (CheckBox) findViewById(R.id.coffee_checkbox_view);
//        boolean hasCoffee = coffeeCheckBox.isChecked();
//
//        int price = calculatePrice(hasTea, hasCoffee);
//        displayMessage(createOrderSummary(name, price, hasTea, hasCoffee));
        Intent itnt = new Intent(Intent.ACTION_VIEW);
        itnt.setData(Uri.parse("geo :47.6, -123.3"));
        if(itnt.resolveActivity(getPackageManager())!=null)
        {
            startActivity(itnt);
        }
    }

    private String createOrderSummary(String name, int price, boolean addTea, boolean hasCoffee) {
        String priceMessage = "Name : " + name;
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