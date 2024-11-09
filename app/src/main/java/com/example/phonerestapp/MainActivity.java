package com.example.phonerestapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dishesButton = findViewById(R.id.dishesButton);
        Button reservationButton = findViewById(R.id.reservationButton);
        Button ingredientsButton = findViewById(R.id.ingredientsButton);
        Button staffButton = findViewById(R.id.staffButton);

        // Переход к экрану "Блюда"
        dishesButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DishesActivity.class)));

        // Переход к экрану "Резервация"
        reservationButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ReservationActivity.class)));

        // Переход к экрану "Остатки ингредиентов"
        ingredientsButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, IngredientsActivity.class)));

        // Переход к экрану "Персонал"
        staffButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, StaffActivity.class)));
    }
}
