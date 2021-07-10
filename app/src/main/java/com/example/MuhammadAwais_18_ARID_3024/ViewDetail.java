package com.example.MuhammadAwais_18_ARID_3024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_detail);
        TextView textView11, textView2;
        Button button;

        button= findViewById(R.id.Change);

        textView11=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);


        String data = getIntent().getExtras().getString("text1");
        textView11.setText(data);
        textView2.setText(data);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ViewDetail.this, resetpasss.class);
        startActivity(intent);

    }
});

    }
}