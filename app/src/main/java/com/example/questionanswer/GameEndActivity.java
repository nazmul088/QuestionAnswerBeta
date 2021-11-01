package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class GameEndActivity extends AppCompatActivity {
    private TextView textView;
    private Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_end);

        Button button  = (Button) findViewById(R.id.button1);

        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        textView = (TextView) findViewById(R.id.textView1);
        textView.setAnimation(animation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NameActivity.class));
            }
        });
    }
}