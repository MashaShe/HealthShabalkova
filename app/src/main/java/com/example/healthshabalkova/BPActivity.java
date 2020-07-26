package com.example.healthshabalkova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class BPActivity extends AppCompatActivity {
    private static String TAG = "MHeath, BPActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_p);
        final Set<BPdata> bpdataSet = new HashSet<>();
        Log.d(TAG, "onCreate");
        final EditText entLowBP = findViewById(R.id.low_BP_value);
        final EditText entHightBP = findViewById(R.id.hight_BP_value);
        final EditText entPulse = findViewById(R.id.pulse_value);
        final Switch entTachic = findViewById(R.id.tachycardia_value);
        final EditText entData = findViewById(R.id.enterDate_value);
        Button save = findViewById(R.id.buttonSaveBP);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick save");
                String lowBPstr = entLowBP.getText().toString();
                String hightBPstr = entHightBP.getText().toString();
                String pulsestr = entPulse.getText().toString();
                Boolean tachicardia = entTachic.getShowText();
                String datastr = entData.getText().toString();

                try {
                    int lowBP = Integer.parseInt(lowBPstr);
                    int hightBP = Integer.parseInt(hightBPstr);
                    int pulse = Integer.parseInt(pulsestr);
                    BPdata bpData = new BPdata(lowBP, hightBP, pulse, tachicardia, datastr);
                    bpdataSet.add(bpData);
                    Toast.makeText(BPActivity.this,"Успешно", Toast.LENGTH_LONG).show();
                } catch (NumberFormatException ex) {
                    Log.e(TAG, "Буква вместо числа в поле возраст", ex);
                    entLowBP.getText().clear();
                    entHightBP.getText().clear();
                    entPulse.getText().clear();
                    Toast.makeText(BPActivity.this, "Введите числа в поля давления и пульса", Toast.LENGTH_LONG).show();
                }


            }
        });

        ImageButton back = findViewById(R.id.backBP);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick back");
                Intent intent = new Intent(BPActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}