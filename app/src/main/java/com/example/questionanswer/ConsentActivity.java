package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ConsentActivity extends AppCompatActivity {

    private Button button;
    private CheckBox checkBox;
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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox = (CheckBox) findViewById(R.id.checkbox1);
                if(checkBox.isChecked())
                {
                    startActivity(new Intent(ConsentActivity.this,InstructionActivity.class));
                }
                else{
                    Toast.makeText(ConsentActivity.this, "Please check the agreement", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}