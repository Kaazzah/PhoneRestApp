package com.example.phonerestapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class DishesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);

        ListView dishesListView = findViewById(R.id.dishesListView);

        ArrayList<String> dishes = new ArrayList<>();
        dishes.add("Пицца - Сырная, Цена: 500 руб.");
        dishes.add("Бургер - Классический, Цена: 300 руб.");
        dishes.add("Паста - Карбонара, Цена: 400 руб.");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        dishesListView.setAdapter(adapter);
    }
}

