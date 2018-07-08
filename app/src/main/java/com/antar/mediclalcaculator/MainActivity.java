package com.antar.mediclalcaculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double convertionRate =2.2;
    double weightEntered;
    double convertedWeight;

    EditText editText;
    RadioGroup radioGroup;
    RadioButton RadioButton1;
    RadioButton RadioButton2;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =findViewById(R.id.weight);
        radioGroup =findViewById(R.id.myRadioGroup);
        RadioButton1 =findViewById(R.id.weight1);
        RadioButton2=findViewById(R.id.weight2);
        textView =findViewById(R.id.text);


        }

    public void convert(View view) {

        weightEntered =Double.parseDouble(editText.getText().toString());


    }
}
