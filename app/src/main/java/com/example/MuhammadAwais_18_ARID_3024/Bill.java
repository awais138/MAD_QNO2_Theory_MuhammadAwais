package com.example.MuhammadAwais_18_ARID_3024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        TextView text1,text2,text3,text4,text5,text6;
        Button button1;


        text1= findViewById(R.id.editTextTextPersonName1);
        text2= findViewById(R.id.editTextTextPersonName2);
        text3= findViewById(R.id.editTextTextPersonName3);
        text4= findViewById(R.id.editTextTextPersonName4);
        text5= findViewById(R.id.editTextTextPersonName5);
        text6= findViewById(R.id.editTextTextPersonName6);
        button1= findViewById(R.id.ShowBTN);

        String text11,text22,text33,text44,text55,text66;

      text11=text1.getText().toString();
      text22=text2.getText().toString();
      text33=text3.getText().toString();
      text44=text4.getText().toString();
      text55=text5.getText().toString();
      text66=text6.getText().toString();
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Bill.this, ViewDetail.class);
        intent.putExtra("text1", text11);
        startActivity(intent);
    }
});



    }


    }
