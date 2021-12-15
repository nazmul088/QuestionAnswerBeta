package com.example.questionanswer;

import androidx.annotation.NonNull;
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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.jar.Attributes;

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
        uploadToServer();
//
//        String game = getIntent().getStringExtra("game");
//        String earnValue = getIntent().getStringExtra("earn");
//        String lostValue = getIntent().getStringExtra("lost");
//        String language = getIntent().getStringExtra("language");
//
//
//
//        if(game.equalsIgnoreCase("practice"))
//        {
//            textView = (TextView) findViewById(R.id.textView);
//            textView.setAnimation(animation);
//
//            String str = "The correct answer to this question is 136."+ "Based on your allocation, you earned "+(Double.parseDouble(earnValue))+ " taka";
//            String banglaStr="এই প্রশ্নের সঠিক উত্তর হল ১৩৬"+"। আপনার বরাদ্দের উপর ভিত্তি করে, আপনি "+MyStaff.numBangla(Double.parseDouble(earnValue))+  "টাকা অর্জন করেছেন।\n";
//
//            if(language.equalsIgnoreCase("Bangla"))
//            {
//                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
//                resources = context.getResources();
//
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(banglaStr);
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//                textView.setAnimation(animation);
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//
//            }
//            else {
//
//                context = LocaleHelper.setLocale(ResultActivity.this, "en");
//                resources = context.getResources();
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(str);
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//                textView.setAnimation(animation);
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//
//                textView.setAnimation(animation);
//            }
//        }
//        else if(game.equalsIgnoreCase("practiceSecond"))
//        {
//            textView = (TextView) findViewById(R.id.textView);
//            textView.setAnimation(animation);
//
//            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//            String str = "The correct answer to this question is 92.2%."+ "Based on your allocation, you earned "+(Double.parseDouble(earnValue))+ " taka";
//            String banglaStr="এই প্রশ্নের সঠিক উত্তর হল ৯২.২%। আপনার বরাদ্দের উপর ভিত্তি করে, আপনি "+MyStaff.numBangla(Double.parseDouble(earnValue))+  "টাকা অর্জন করেছেন।\n";
//
//            if(language.equalsIgnoreCase("Bangla"))
//            {
//
//                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
//                resources = context.getResources();
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(banglaStr);
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//                textView.setAnimation(animation);
//
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//            }
//            else{
//                context = LocaleHelper.setLocale(ResultActivity.this, "en");
//                resources = context.getResources();
//
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(str);
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//                textView.setAnimation(animation);
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//            }
//
//        }
//        else if(game.equalsIgnoreCase("practiceThird"))
//        {
//            textView = (TextView) findViewById(R.id.textView);
//            textView.setAnimation(animation);
//
//            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//            String str = "The correct answer to this question is $70191 million."+ "Based on your allocation, you earned "+(Double.parseDouble(earnValue))+ " taka.";
//            String banglaStr="এই প্রশ্নের সঠিক উত্তর হল " +
//                    "৭১৯১ হাজার কোটি টাকা"+"। আপনার বরাদ্দের উপর ভিত্তি করে, আপনি "+MyStaff.numBangla(Double.parseDouble(earnValue))+  "টাকা অর্জন করেছেন।\n";
//            if(language.equalsIgnoreCase("Bangla"))
//            {
//                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
//                resources = context.getResources();
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(banglaStr);
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//                textView.setAnimation(animation);
//
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//            }
//            else{
//                context = LocaleHelper.setLocale(ResultActivity.this, "en");
//                resources = context.getResources();
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(str);
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//            }
//
//
//        }
//        else if(game.equalsIgnoreCase("secondQuestion"))
//        {
//            textView = (TextView) findViewById(R.id.textView);
//            textView.setAnimation(animation);
//
//            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//            String str = "The correct answer to this question is 35.69%."+ "Based on your allocation, you earned "+earnValue+ " points and lost "+lostValue+" points";
//            textView = (TextView) findViewById(R.id.textView1);
//            textView.setText(str);
//            textView.setAnimation(animation);
//        }
//        else if(game.equalsIgnoreCase("firstMainQuestion") || game.equalsIgnoreCase("SecondMainQuestion") || game.equalsIgnoreCase("thirdMainQuestion"))
//        {
//            textView = (TextView) findViewById(R.id.textView);
//            textView.setAnimation(animation);
//
//            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//            String str = "We will calculate your earned bonus and send the amount in your firm’s mobile money account after the Endline Survey.";
//            String banglaStr = "আমরা আপনার অর্জিত বোনাস হিসাব করবো এবং এন্ড লাইন সার্ভের পরে আপনার ফেক্টরি/কারখানার মোবাইল মানি অ্যাকাউন্টে টাকাটি পাঠিয়ে দিবো।\n";
//
//
//            if(language.equalsIgnoreCase("Bangla"))
//            {
//                context = LocaleHelper.setLocale(ResultActivity.this, "bn");
//                resources = context.getResources();
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(banglaStr);
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
//                textView.setAnimation(animation);
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//            }
//            else{
//                context = LocaleHelper.setLocale(ResultActivity.this, "en");
//                resources = context.getResources();
//                textView = (TextView) findViewById(R.id.textView1);
//                textView.setText(str);
//
//                textView = (TextView) findViewById(R.id.textView);
//                textView.setText(resources.getString(R.string.thank_you_for_your_answer));
//                animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
//                textView.setAnimation(animation);
//
//            }
//        }
//
//
//
//        button = (Button) findViewById(R.id.button1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(game.equalsIgnoreCase("practice"))
//                {
//                    Intent intent = new Intent(getApplicationContext(),PracticeSecondActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//                if(game.equalsIgnoreCase("practiceSecond"))
//                {
//                    Intent intent = new Intent(getApplicationContext(),PracticeThirdActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//                else if(game.equalsIgnoreCase("practiceThird"))
//                {
//                    Intent intent = new Intent(getApplicationContext(),PracticeSessionEndActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//                else if(game.equalsIgnoreCase("secondQuestion"))
//                {
//                    Intent intent = new Intent(getApplicationContext(),PracticeSessionEndActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//                else if(game.equalsIgnoreCase("firstMainQuestion"))
//                {
//                    Intent intent = new Intent(getApplicationContext(),SecondMainQuestionActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//                else if(game.equalsIgnoreCase("secondMainQuestion"))
//                {
//                    Intent intent = new Intent(getApplicationContext(),ThirdMainQuestionActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//                else if(game.equalsIgnoreCase("thirdMainQuestion"))
//                {
//                    //////////////////
//                    uploadToServer();
//
//                    Intent intent = new Intent(getApplicationContext(),GameEndActivity.class);
//                    intent.putExtra("language",language);
//                    startActivity(intent);
//                }
//            }
//        });


    }


    class GameItem {
        public String id;
        public String enumerator_name;
        public String respondent_name;
        public String game1;
        public String game1Score;
        public String game2;
        public String game2Score;
        public String game3;
        public String game3Score;
    }

    class GameItemList { // definition
        public ArrayList<GameItem> gameItemArrayList = new ArrayList<>();
    }

    private void uploadToServer() {
        //Trying my code
        ArrayList<GameItem> gameItems = new ArrayList<>();

        GameItem gameItem = new GameItem();
        gameItem.id = "1233456";
        gameItem.enumerator_name = "sajib";
        gameItem.respondent_name = "karim";
        gameItem.game1="1-10(9), 11-20(1)";
        gameItem.game1Score = "199.1";
        gameItem.game2="1-10(9), 11-20(1)";
        gameItem.game2Score = "199.1";
        gameItem.game3="1-10(9), 11-20(1)";
        gameItem.game3Score = "199.1";
        gameItems.add(gameItem);
//        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();
//        databaseReference.child("game").child("0").setValue(gameItem);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
        Query query = databaseReference.child("game").orderByKey();
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                System.out.println(snapshot.getChildrenCount());
                String index = String.valueOf(snapshot.getChildrenCount());
                databaseReference.child("game").child(index).child("id").setValue("1233456");
                databaseReference.child("game").child(index).child("enumerator_name").setValue("sajib");
                databaseReference.child("game").child(index).child("respondent_name").setValue("karim");
                databaseReference.child("game").child(index).child("game1").setValue("1-10(9), 11-20(1)");
                databaseReference.child("game").child(index).child("game1Score").setValue("100.1");
                databaseReference.child("game").child(index).child("game2").setValue("1-10(9), 11-20(1)");
                databaseReference.child("game").child(index).child("game2Score").setValue("200.1");
                databaseReference.child("game").child(index).child("game3").setValue("1-10(9), 11-20(1)");
                databaseReference.child("game").child(index).child("game3Score").setValue("500");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });





        //Apurbo's Code
        //Toast.makeText(ResultActivity.this, "toadting", Toast.LENGTH_SHORT).show();
//        List itemList=new ArrayList();
//        HashMap<String,List> hashMap=new HashMap<>();
//        DatabaseReference ref= FirebaseDatabase.getInstance().getReference();
//        String[] names = {"51-60(2)_61-70(4)_71-80(1)_61-70(4)_71-80(1)","61-70(4)_71-80(1)","61-70(4)_71-80(1)","61-70(4)_71-80(1)"};
//
//        List nameList = new ArrayList<String>(Arrays.asList(names));
//
//        MaintwoActivity.resp.add(0,MaintwoActivity.resultString);
//        PracticeSecondActivity.resp.add(0,PracticeSecondActivity.resultString);
//        PracticeThirdActivity.resp.add(0,PracticeThirdActivity.resultString);
//        FirstMainQuestionActivity.resp.add(0,FirstMainQuestionActivity.resultString);
//        SecondMainQuestionActivity.resp.add(0,SecondMainQuestionActivity.resultString);
//        ThirdMainQuestionActivity.resp.add(0,ThirdMainQuestionActivity.resultString);
//        hashMap.put("id", Collections.singletonList(NameActivity.id));
//        hashMap.put("Enumerator Name", Collections.singletonList(NameActivity.enumerator_name));
//        hashMap.put("Respondant Name", Collections.singletonList(NameActivity.respondent_name));
//        hashMap.put("0f",MaintwoActivity.resp);
//        hashMap.put("1f",PracticeSecondActivity.resp);
//        hashMap.put("2f",PracticeThirdActivity.resp);
//        hashMap.put("3f",FirstMainQuestionActivity.resp);
//        hashMap.put("4f",SecondMainQuestionActivity.resp);
//        hashMap.put("5f",ThirdMainQuestionActivity.resp);
//
//// Now set value with new nameList
//        ref.push().setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                Toast.makeText(ResultActivity.this, "Data Uploaded Successfully", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}