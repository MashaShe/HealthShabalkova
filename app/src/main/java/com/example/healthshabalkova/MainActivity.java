package com.example.healthshabalkova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MHeath, MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        final Set<User> usersSet = new HashSet<>();
        final EditText entName = findViewById(R.id.textEnterName);
        final EditText entAge = findViewById(R.id.textEnterAge);
        Button save = findViewById(R.id.buttonSave);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick save");
                String name = entName.getText().toString();
                String ageStr = entAge.getText().toString();
                try {
                    int age = Integer.parseInt(ageStr);
                    User user = new User (name, age);
                    usersSet.add(user);
                    Toast.makeText(MainActivity.this,"Успешно", Toast.LENGTH_LONG).show();
                }
                catch (NumberFormatException ex){
                    Log.e(TAG,"Буква вместо числа в поле возраст",ex);
                    entAge.getText().clear();
                    Toast.makeText(MainActivity.this,"Вы ввели буквы в поле Возраст", Toast.LENGTH_LONG).show();
                }


            }
        });

        Button goToBP = findViewById(R.id.buttonGoToBP);
        goToBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick go to BP");
                Intent intent  = new Intent(MainActivity.this, BPActivity.class);
                    startActivity(intent);
            }
        });

        Button goToVitals = findViewById(R.id.buttonGoToVitals);
        goToVitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick goto Vital");
                Intent intent = new Intent(MainActivity.this,VitalActivity.class);
                startActivity(intent);
            }
        });
    }
}