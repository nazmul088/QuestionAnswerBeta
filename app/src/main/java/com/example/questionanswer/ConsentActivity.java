package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class ConsentActivity extends AppCompatActivity {

    private Button button;
    private CheckBox checkBox,checkBox1;
    private TextView textView;
    private Context context;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consent);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        String name = getIntent().getStringExtra("name");
        textView = (TextView) findViewById(R.id.textView4);
        textView.setText(name);

        //Change Language

        Switch languageSwitch = (Switch) findViewById(R.id.switch1);

        languageSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){//In bangla
                    languageSwitch.setText("English");
                    System.out.println("In Bangla");
                    context = LocaleHelper.setLocale(ConsentActivity.this, "bn");
                    resources = context.getResources();
                    textView = (TextView) findViewById(R.id.textView3);
                    textView.setText(resources.getString(R.string.consent_label));

                    textView = (TextView) findViewById(R.id.textView1);
                    textView.setText(resources.getString(R.string.hello_my_name_is));

                    textView = (TextView) findViewById(R.id.textView2);
                    textView.setText(resources.getString(R.string.consent_text));


                }else{ //In English
                    languageSwitch.setText("Bangla");
                    context = LocaleHelper.setLocale(ConsentActivity.this, "en");
                    resources = context.getResources();
                    textView = (TextView) findViewById(R.id.textView3);
                    textView.setText(resources.getString(R.string.consent_label));

                    textView = (TextView) findViewById(R.id.textView1);
                    textView.setText(resources.getString(R.string.hello_my_name_is));

                    textView = (TextView) findViewById(R.id.textView2);
                    textView.setText(resources.getString(R.string.consent_text));

                }
            }
        });






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