package com.example.user.toggle_switch;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import static java.lang.Boolean.FALSE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
private TextView et1,et2,et3;
private ToggleButton toggle;
private Switch sw;
private SwitchCompat swc;
    private LinearLayout linear1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear1 = (LinearLayout)findViewById(R.id.linearlayout);
        et1 = (TextView) findViewById(R.id.et1);
        et2 = (TextView) findViewById(R.id.et2);
        et3 = (TextView) findViewById(R.id.et3);

        toggle = (ToggleButton) findViewById(R.id.toggle);
        sw = (Switch) findViewById(R.id.sw);
        swc = (SwitchCompat) findViewById(R.id.swc);

        toggle.setOnClickListener(this);
        sw.setOnClickListener(this);
        swc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (toggle.isChecked() == true) {

            et1.setTextColor(Color.RED);
            et1.setText("El Toggle esta Activado");
        } else {
            et1.setText("El Toggle esta Desactivado");
        }

        if (sw.isChecked() == true) {
            et2.setText("El switch esta Activado");
            et2.setTextColor(Color.BLUE);
            linear1.setBackgroundColor(Color.GREEN);
        } else {
            et2.setText("El switch esta Desactivado");
            linear1.setBackgroundColor(Color.WHITE);
        }
        if(swc.isChecked() == true){

           et3.setTypeface(et1.getTypeface(),Typeface.BOLD);

        }else{
            et3.setTypeface(et1.getTypeface(),Typeface.NORMAL);

        }


    }
}
