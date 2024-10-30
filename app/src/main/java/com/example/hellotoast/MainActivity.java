package com.example.hellotoast;

import static android.widget.TextView.*;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    

     @Override
     protected void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

     }

    public void ShowToast(View view) {
        Toast.makeText(this, "hello Toast", Toast.LENGTH_SHORT).show();
        TextView v = findViewById(R.id.textView);
        v.setText("0");

    }

    public void incrementValue(View view) {
         TextView v = findViewById(R.id.textView);
         int i =Integer.parseInt(v.getText().toString());
         i++;
         v.setText(i+"");
    }

}