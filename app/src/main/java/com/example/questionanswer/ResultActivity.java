package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
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

    private Context context;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String game = getIntent().getStringExtra("game");
        String earnValue = getIntent().getStringExtra("earn");
        String lostValue = getIntent().getStringExtra("lost");
        String language = getIntent().getStringExtra("language");



        if(game.equalsIgnoreCase("practice"))
        {
            textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(animation);



            String str = "The correct answer to this question is 136."+ "Based on your allocation, you earned "+earnValue+ " taka";
            String banglaStr="এই প্রশ্নের সঠিক উত্তর হল 136"+"। আপনার বরাদ্দের উপর ভিত্তি করে, আপনি "+earnValue+  "টাকা অর্জন করেছেন।\n";

            if(language.equalsIgnoreCase("Bangla"))
            {
                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
                resources = context.getResources();

                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(banglaStr);
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                textView.setAnimation(animation);

                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);

            }
            else {

                context = LocaleHelper.setLocale(ResultActivity.this, "en");
                resources = context.getResources();
                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(str);
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                textView.setAnimation(animation);

                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);

                textView.setAnimation(animation);
            }
        }
        else if(game.equalsIgnoreCase("practiceSecond"))
        {
            textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(animation);

            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            String str = "The correct answer to this question is 92.2%."+ "Based on your allocation, you earned "+earnValue+ " taka";
            String banglaStr="এই প্রশ্নের সঠিক উত্তর হল 92.2%"+"। আপনার বরাদ্দের উপর ভিত্তি করে, আপনি "+earnValue+  "টাকা অর্জন করেছেন।\n";

            if(language.equalsIgnoreCase("Bangla"))
            {

                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
                resources = context.getResources();
                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(banglaStr);
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                textView.setAnimation(animation);


                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);
            }
            else{
                context = LocaleHelper.setLocale(ResultActivity.this, "en");
                resources = context.getResources();

                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(str);
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                textView.setAnimation(animation);

                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);
            }

        }
        else if(game.equalsIgnoreCase("practiceThird"))
        {
            textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(animation);

            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            String str = "The correct answer to this question is $846.1 million."+ "Based on your allocation, you earned "+earnValue+ " taka.";
            String banglaStr="এই প্রশ্নের সঠিক উত্তর হল ৭১৯১.৮৫ কোটি টাকা"+"। আপনার বরাদ্দের উপর ভিত্তি করে, আপনি "+earnValue+  "টাকা অর্জন করেছেন।\n";
            if(language.equalsIgnoreCase("Bangla"))
            {
                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
                resources = context.getResources();
                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(banglaStr);
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                textView.setAnimation(animation);


                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);
            }
            else{
                context = LocaleHelper.setLocale(ResultActivity.this, "en");
                resources = context.getResources();
                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(str);

                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);
            }


        }
        else if(game.equalsIgnoreCase("secondQuestion"))
        {
            textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(animation);

            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            String str = "The correct answer to this question is 35.69%."+ "Based on your allocation, you earned "+earnValue+ " points and lost "+lostValue+" points";
            textView = (TextView) findViewById(R.id.textView1);
            textView.setText(str);
            textView.setAnimation(animation);
        }
        else if(game.equalsIgnoreCase("firstMainQuestion") || game.equalsIgnoreCase("SecondMainQuestion") || game.equalsIgnoreCase("thirdMainQuestion"))
        {
            textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(animation);

            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            String str = "We will calculate your earned bonus and send the amount in your firm’s mobile money account after the Endline Survey.";
            String banglaStr = "আমরা আপনার অর্জিত বোনাস হিসাব করবো এবং এন্ড লাইন সার্ভের পরে আপনার ফেক্টরি/কারখানার মোবাইল মানি অ্যাকাউন্টে টাকাটি পাঠিয়ে দিবো।\n";


            if(language.equalsIgnoreCase("Bangla"))
            {
                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
                resources = context.getResources();
                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(banglaStr);
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                textView.setAnimation(animation);

                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);
            }
            else{
                context = LocaleHelper.setLocale(ResultActivity.this, "en");
                resources = context.getResources();
                textView = (TextView) findViewById(R.id.textView1);
                textView.setText(str);

                textView = (TextView) findViewById(R.id.textView);
                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.setAnimation(animation);

            }
        }



        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game.equalsIgnoreCase("practice"))
                {
                    Intent intent = new Intent(getApplicationContext(),PracticeSecondActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }
                if(game.equalsIgnoreCase("practiceSecond"))
                {
                    Intent intent = new Intent(getApplicationContext(),PracticeThirdActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }
                else if(game.equalsIgnoreCase("practiceThird"))
                {
                    Intent intent = new Intent(getApplicationContext(),PracticeSessionEndActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }
                else if(game.equalsIgnoreCase("secondQuestion"))
                {
                    Intent intent = new Intent(getApplicationContext(),PracticeSessionEndActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }
                else if(game.equalsIgnoreCase("firstMainQuestion"))
                {
                    Intent intent = new Intent(getApplicationContext(),SecondMainQuestionActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }
                else if(game.equalsIgnoreCase("secondMainQuestion"))
                {
                    Intent intent = new Intent(getApplicationContext(),ThirdMainQuestionActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }
                else if(game.equalsIgnoreCase("thirdMainQuestion"))
                {
                    Intent intent = new Intent(getApplicationContext(),GameEndActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                }

            }
        });


    }
}