package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NameActivity extends AppCompatActivity {


    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        Button button = findViewById(R.id.button1);
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("test");
        databaseReference.push().setValue("Testing");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NameActivity.this,ConsentActivity.class);
                editText = (EditText) findViewById(R.id.editTextTextEmailAddress2);
                String name = editText.getText().toString();
                if(name.length()>0)
                {
                    intent.putExtra("name",name);
                    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.selectedlanguage);
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(selectedId);
                    if(radioButton.getText().toString().equals("Bangla"))
                        intent.putExtra("language",radioButton.getText().toString());
                    else
                        intent.putExtra("language",radioButton.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(NameActivity.this, "Please Enter your name", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}