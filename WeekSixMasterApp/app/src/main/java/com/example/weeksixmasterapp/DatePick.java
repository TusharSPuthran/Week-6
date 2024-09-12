package com.example.weeksixmasterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePick extends AppCompatActivity {

    TextView txtView;
    DatePicker dPicker;
    Button dispDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepick);

        txtView=(TextView) findViewById(R.id.textView);
        dPicker =(DatePicker) findViewById(R.id.datePicker);
        dispDate=(Button) findViewById(R.id.button);

        dispDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.setText("Selected Date is: "+getCurrentDate());
            }
        });
    }

    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();
        builder.append((dPicker.getMonth()+1)+"/");
        builder.append(dPicker.getDayOfMonth()+"/");
        builder.append(dPicker.getYear());
        return builder.toString();
    }
}