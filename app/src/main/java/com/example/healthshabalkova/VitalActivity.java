package com.example.healthshabalkova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class VitalActivity extends AppCompatActivity {
    final String TAG = "MHeath, VitalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vital);
        Log.d(TAG, "onCreate");
        final EditText entWeight = findViewById(R.id.weight_value);
        final EditText entSteps = findViewById(R.id.steps_value);
        Button save = findViewById(R.id.buttonSaveVital);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick save");
                String weightstr = entWeight.getText().toString();
                String stepsstr = entSteps.getText().toString();

                try{
                    Double weight = Double.parseDouble(weightstr);
                    int steps = Integer.parseInt(stepsstr);
                    Vitals vitals = new Vitals (weight, steps);
                    Toast.makeText(VitalActivity.this,"Успешно", Toast.LENGTH_LONG).show();
                }
                catch (NumberFormatException ex) {
                    Log.e(TAG, "Буква вместо числа в поле возраст", ex);
                    entWeight.getText().clear();
                    entSteps.getText().clear();
                    Toast.makeText(VitalActivity.this, "Введите числа в поля веся и шагов", Toast.LENGTH_LONG).show();
                }
            }
        });


        ImageButton back = findViewById(R.id.backVital);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick back");
                Intent intent = new Intent (VitalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}