package com.bcutlerywala.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Create the random number
    Random rand = new Random();
    int number = rand.nextInt(20) + 1;

    public void gottaGuess(View view){

        EditText guessEditText = (EditText) findViewById(R.id.guessText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (userNumber < guessInt){
            Toast.makeText(MainActivity.this, "Lower", Toast.LENGTH_SHORT);

        }else if (number > guessInt){
            Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT);

        }else {

            Toast.makeText(MainActivity.this, "You got it! Try another time! ", Toast.LENGTH_SHORT);

            Random newRand = new Random();
            number = newRand.nextInt(20) + 1;
        }
        Toast.makeText(MainActivity.this, String.valueOf(number), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
