package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffes=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage="Thank you for your order \nTotal:$"+(numberOfCoffes*5);
        displayMessage(priceMessage);
    }

    /**
     * This is the INCR_BUT
     */
    public void incr_but(View view){
        numberOfCoffes=numberOfCoffes+1;
        display(numberOfCoffes);
        displayPrice(numberOfCoffes*5);
    }

    /**
     * This is the DECR_BUT
     */
    public void decr_but(View view){
        numberOfCoffes=numberOfCoffes-1;
        numberOfCoffes = numberOfCoffes < 0? 0 : numberOfCoffes;
        display(numberOfCoffes);
        displayPrice(numberOfCoffes*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}
