package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {


    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NameActivity.this,ConsentActivity.class);
                editText = (EditText) findViewById(R.id.editTextTextEmailAddress2);
                String name = editText.getText().toString();
                if(name.length()>0)
                {
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(NameActivity.this, "Please Enter your name", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}