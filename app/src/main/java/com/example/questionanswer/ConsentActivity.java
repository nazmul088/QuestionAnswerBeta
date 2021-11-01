package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class ConsentActivity extends AppCompatActivity {

    private Button button;
    private CheckBox checkBox,checkBox1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consent);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        String name = getIntent().getStringExtra("name");
        textView = (TextView) findViewById(R.id.textView4);
        textView.setText(name);
        button = (Button) findViewById(R.id.button1);
        checkBox = (CheckBox) findViewById(R.id.checkbox1);
        checkBox1 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox.isChecked())
                {
                    checkBox1.setEnabled(false);
                }
                else{
                    checkBox1.setEnabled(true);
                }
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox1.isChecked())
                {
                    checkBox.setEnabled(false);
                }
                else{
                    checkBox.setEnabled(true);
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(checkBox.isChecked())
                {
                    startActivity(new Intent(ConsentActivity.this,InstructionActivity.class));
                }
                else if(checkBox1.isChecked())
                {
                    startActivity(new Intent(getApplicationContext(),GameEndActivity.class));
                }
                else{
                    Toast.makeText(ConsentActivity.this, "Please check any one agreement", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}