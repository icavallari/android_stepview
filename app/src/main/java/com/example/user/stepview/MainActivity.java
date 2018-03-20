package com.example.user.stepview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anton46.stepsview.StepsView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StepsView stepsView = findViewById(R.id.stepsView);

        stepsView.setLabels(new String[]{"","","","","",""})
                .setBarColorIndicator(Color.GRAY)
                .setProgressColorIndicator(Color.GREEN)
                .setLabelColorIndicator(Color.GREEN)
                .setCompletedPosition(4)
                .drawView();
    }
}
