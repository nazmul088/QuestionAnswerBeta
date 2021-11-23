package com.example.questionanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PracticeSessionEndActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_session_end);
        TextView textView = (TextView) findViewById(R.id.textView1);
        String html = "You have completed the practice exercise. We will now move to the main exercise, " +
                "which will help us learn what you expect will change for a Leather Goods or " +
                "Footwear Firm similar to yours, if it replaces the clutch motor on one sewing machine " +
                "with a servo motor. We will ask you 3 questions. While answering please keep in mind that " +
                "we are asking these questions for a Leather Goods or Footwear firm similar to yours.";
        textView.setText(Html.fromHtml(html));
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FirstMainQuestionActivity.class));
            }
        });
    }
}