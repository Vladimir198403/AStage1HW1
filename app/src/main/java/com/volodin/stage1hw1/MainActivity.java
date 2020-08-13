package com.volodin.stage1hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //шапка приложения
        TextView chRegion = findViewById(R.id.chRegion);
        TextView chSity = findViewById(R.id.chSity);
        TextView chPeriod = findViewById(R.id.chPeriod);
        TextView DataAndTime = findViewById(R.id.DataAndTime);

        //Основное поле отображени информации
        TextView infoField = findViewById(R.id.infoField);

        //Поле меню
        Spinner arRegion = findViewById(R.id.arRegion);
        Button selRegion = findViewById(R.id.selRegion);
        Spinner arPeriod = findViewById(R.id.arPeriod);
        Button selPeriod = findViewById(R.id.selPeriod);
        Spinner arMode = findViewById(R.id.arMode);
        Button selMode = findViewById(R.id.selMode);


    }
}