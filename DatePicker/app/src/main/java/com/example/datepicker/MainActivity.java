package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=findViewById(R.id.date_Edittxt);

                datePicker.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Calendar calendar = Calendar.getInstance();
                        int year=Calendar.YEAR;
                        int month=Calendar.DAY_OF_MONTH;
                        int day=Calendar.DAY_OF_MONTH;

                        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,(view, selectedYear, selectedMonth, selectedDay) ->{

                            datePicker.setText(selectedDay+"/"+(selectedMonth+1)+"/"+selectedYear);



                             },year,month,day
                        ); datePickerDialog.show();

                    }
                });
    }
}