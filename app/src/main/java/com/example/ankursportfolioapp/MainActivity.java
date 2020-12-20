package com.example.ankursportfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        Project[] projects = {
                new Project("Ankur's Bucket List", "An app that shows my bucket list that, indeed, contains the things i want to do and the places i want to visit", R.drawable.things),
                new Project("The Hungry Bitch", "An app that shows the restaurant menu(Starters, Main Course, Desserts)", R.drawable.hungry_developer),
                new Project("BMI Calculator", "An app that calculates BMI by taking various information", R.drawable.calculator),
                new Project("Inches To Meter Convertor", "An app that converts inches to meters", R.drawable.tape),
                new Project("Quote", "An app that shows an amazing quote with a wonderful background", R.drawable.quote),
        };

        ProjectAdapter pA = new ProjectAdapter(projects);
        recyclerView.setAdapter(pA);
    }
}