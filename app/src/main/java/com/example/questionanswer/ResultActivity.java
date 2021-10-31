package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textView;
    private Animation animation;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String game = getIntent().getStringExtra("game");
        String earnValue = getIntent().getStringExtra("earn");
        String lostValue = getIntent().getStringExtra("lost");

        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);


        if(game.equalsIgnoreCase("practice"))
        {
            textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(animation);

            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            String str = "The correct answer to this question is 37."+ "Based on your allocation, you earned "+earnValue+ " points and lost "+lostValue+" points";
            textView = (TextView) findViewById(R.id.textView1);
            textView.setAnimation(animation);
        }

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game.equalsIgnoreCase("practice"))
                {
                    Intent intent = new Intent(getApplicationContext(),PracticeSessionEndActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}