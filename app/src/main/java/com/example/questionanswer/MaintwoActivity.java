package com.example.questionanswer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MaintwoActivity extends CustomActivity {
    private String resultString = "";

    private Button button;
    private TextView textView;

    public static Activity activity;
    double a=100;
    double b=50;

    private String language;
    private Context context;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        il=new ItemList[11];




        activity=this;
        setContentView(R.layout.main3);



        language= getIntent().getStringExtra("language");
        //language = "Bangla";
        if(language.equalsIgnoreCase("Bangla"))
        {
            context = LocaleHelper.setLocale(MaintwoActivity.this, "bn");
            resources = context.getResources();
            textView = (TextView) findViewById(R.id.textView);
            textView.setText(resources.getString(R.string.practiceQuestion1));
            textView = (TextView) findViewById(R.id.h1);
            textView.setText(resources.getString(R.string.q_1_o_1));

            textView = (TextView) findViewById(R.id.h2);
            textView.setText(resources.getString(R.string.q_1_o_2));

            textView = (TextView) findViewById(R.id.h3);
            textView.setText(resources.getString(R.string.q_1_o_3));

            textView = (TextView) findViewById(R.id.h4);
            textView.setText(resources.getString(R.string.q_1_o_4));

            textView = (TextView) findViewById(R.id.h5);
            textView.setText(resources.getString(R.string.q_1_o_5));

            textView = (TextView) findViewById(R.id.h6);
            textView.setText(resources.getString(R.string.q_1_o_6));

            textView = (TextView) findViewById(R.id.h7);
            textView.setText(resources.getString(R.string.q_1_o_7));

            textView = (TextView) findViewById(R.id.h8);
            textView.setText(resources.getString(R.string.q_1_o_8));

            textView = (TextView) findViewById(R.id.h9);
            textView.setText(resources.getString(R.string.q_1_o_9));

            textView = (TextView) findViewById(R.id.h10);
            textView.setText(resources.getString(R.string.q_1_o_10));

        }
        else{
            context = LocaleHelper.setLocale(MaintwoActivity.this, "en");
            resources = context.getResources();
            textView = (TextView) findViewById(R.id.textView);
            textView.setText(resources.getString(R.string.practiceQuestion1));

            textView = (TextView) findViewById(R.id.h1);
            textView.setText(resources.getString(R.string.q_1_o_1));

            textView = (TextView) findViewById(R.id.h2);
            textView.setText(resources.getString(R.string.q_1_o_2));

            textView = (TextView) findViewById(R.id.h3);
            textView.setText(resources.getString(R.string.q_1_o_3));

            textView = (TextView) findViewById(R.id.h4);
            textView.setText(resources.getString(R.string.q_1_o_4));

            textView = (TextView) findViewById(R.id.h5);
            textView.setText(resources.getString(R.string.q_1_o_5));

            textView = (TextView) findViewById(R.id.h6);
            textView.setText(resources.getString(R.string.q_1_o_6));

            textView = (TextView) findViewById(R.id.h7);
            textView.setText(resources.getString(R.string.q_1_o_7));

            textView = (TextView) findViewById(R.id.h8);
            textView.setText(resources.getString(R.string.q_1_o_8));

            textView = (TextView) findViewById(R.id.h9);
            textView.setText(resources.getString(R.string.q_1_o_9));

            textView = (TextView) findViewById(R.id.h10);
            textView.setText(resources.getString(R.string.q_1_o_10));


        }


        lsrc=findViewById(R.id.lsrc);
        src=findViewById(R.id.src);
        ldes[0]=findViewById(R.id.ldes1);
        ldes[1]=findViewById(R.id.ldes2);
        ldes[2]=findViewById(R.id.ldes3);
        ldes[3]=findViewById(R.id.ldes4);
        ldes[4]=findViewById(R.id.ldes5);
        ldes[5]=findViewById(R.id.ldes6);
        ldes[6]=findViewById(R.id.ldes7);
        ldes[7]=findViewById(R.id.ldes8);
        ldes[8]=findViewById(R.id.ldes9);
        ldes[9]=findViewById(R.id.ldes10);


        des[0]=findViewById(R.id.des1);
        des[1]=findViewById(R.id.des2);
        des[2]=findViewById(R.id.des3);
        des[3]=findViewById(R.id.des4);
        des[4]=findViewById(R.id.des5);
        des[5]=findViewById(R.id.des6);
        des[6]=findViewById(R.id.des7);
        des[7]=findViewById(R.id.des8);
        des[8]=findViewById(R.id.des9);
        des[9]=findViewById(R.id.des10);


        tdes[0]=findViewById(R.id.tdes1);
        tdes[1]=findViewById(R.id.tdes2);
        tdes[2]=findViewById(R.id.tdes3);
        tdes[3]=findViewById(R.id.tdes4);
        tdes[4]=findViewById(R.id.tdes5);
        tdes[5]=findViewById(R.id.tdes6);
        tdes[6]=findViewById(R.id.tdes7);
        tdes[7]=findViewById(R.id.tdes8);
        tdes[8]=findViewById(R.id.tdes9);
        tdes[9]=findViewById(R.id.tdes10);
        tdes[10]=findViewById(R.id.tsrc);


        hdes[0]=findViewById(R.id.textView20);

        hdes[1]=findViewById(R.id.h1);
        hdes[2]=findViewById(R.id.h2);
        hdes[3]=findViewById(R.id.h3);
        hdes[4]=findViewById(R.id.h4);
        hdes[5]=findViewById(R.id.h5);
        hdes[6]=findViewById(R.id.h6);
        hdes[7]=findViewById(R.id.h7);
        hdes[8]=findViewById(R.id.h8);
        hdes[9]=findViewById(R.id.h9);
        hdes[10]=findViewById(R.id.h10);


        root=findViewById(R.id.root);


        List<DataItem>list=new ArrayList<>();
        list.add(new DataItem(1,"#aa9955"));
        list.add(new DataItem(2,"#99aa55"));
        list.add(new DataItem(3,"#5599aa"));
        list.add(new DataItem(4,"#ff7733"));
        list.add(new DataItem(5,"#77ff33"));
        list.add(new DataItem(6,"#3377ff"));
        list.add(new DataItem(7,"#cc1133"));
        list.add(new DataItem(8,"#11cc33"));
        list.add(new DataItem(9,"#3311cc"));
        list.add(new DataItem(10,"#cc00aa"));


        button = (Button) findViewById(R.id.button1);


        for(int i=0;i<10;i++)
        {
            textView = (TextView) tdes[i];
            textView.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    setResultVisible();

                    String str="";
                    int start = 1;
                    TableLayout tableLayout = (TableLayout) findViewById(R.id.table_layout);
                    for(int i=0;i<10;i++)
                    {
                        double temp = calculateResult(i);
                        TableRow tableRow = (TableRow)tableLayout.getChildAt(i+1);
                        textView = (TextView) tableRow.getChildAt(1);
                        textView.setText(String.valueOf(temp));


                    }
                }
            });
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView = (TextView) findViewById(R.id.tsrc);
                if(textView.getText().toString().equals("0"))
                {
                    double result = calculateResult(3);
                    double lostValue = 100-result;

                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("game","practice");
                    intent.putExtra("earn",String.valueOf(result));
                    intent.putExtra("lost",String.valueOf(lostValue));
                    intent.putExtra("language",language);
                    startActivity(intent);
                    /*AlertDialog.Builder builder = new AlertDialog.Builder(MaintwoActivity.this);
                    builder.setMessage("The correct answer to this question is 37."+ "Based on your allocation, you earned "+result+ " points and lost "+lostValue+" points").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(MaintwoActivity.this,SecondQuestionActivity.class));
                        }
                    });

                    builder.setCancelable(false);
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.setTitle("Thank you for your answer.");
                    alert.show();*/

                }
                else{
                    Toast.makeText(MaintwoActivity.this, "Please Drag all Icon from Source Box", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });



        for(int i=0;i<10;i++)
        {
            ldes[i].setHasFixedSize(true);
            ldes[i].setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            List<DataItem>list1=new ArrayList<>();
            il[i+1]=new ItemList(activity,list1,des[i],ldes[i],tdes[i]);
            ldes[i].setAdapter(il[i+1]);
        }

        lsrc.setHasFixedSize(true);
        lsrc.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        lsrc.addOnScrollListener(new RecyclerView.OnScrollListener() {
            int x=0,y=0;
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                x+=dx;
                //Toast.makeText(MaintwoActivity.this, x+" "+dx+" "+dy, Toast.LENGTH_SHORT).show();
            }
        });

        il[0]=new ItemList(activity,list,0,src,lsrc,tdes[10]);
        lsrc.setAdapter(il[0]);

    }

    private double calculateResult(int rightValuePosition) {
        double totalValue = (a-b);
        int startRange = 1;
        int endRange = 10;
        for(int i=0;i<10;i++)
        {
            if(i!=0)
            {
                startRange = startRange+10;
                endRange = endRange+10;
            }
            double value = Double.parseDouble(tdes[i].getText().toString());
            if(value!=0)
            {

                //check if it is correct or incorrect box
                //here need to add to string
                if(i==rightValuePosition)
                {
                    //for correct bin
                    double temp = value/10;
                    temp = b*temp*(2-temp);

                    totalValue = totalValue+temp;
                }
                else{
                    //for incorrect bin
                    double temp = value/10.0;
                    temp=b*temp*temp;
                    totalValue = totalValue-temp;

                }

            }
        }
        System.out.println(totalValue);
        return totalValue;
    }


    public void setResultVisible()
    {
        int totalValue = 0;
        for(int i=0;i<10;i++)
        {
            textView = (TextView) tdes[i];
            totalValue = totalValue + Integer.parseInt(textView.getText().toString());
            if(totalValue == 10)
            {
                TableLayout tableLayout = findViewById(R.id.table_layout);
                tableLayout.setVisibility(View.VISIBLE);
            }
            else{
                TableLayout tableLayout = findViewById(R.id.table_layout);
                tableLayout.setVisibility(View.INVISIBLE);
            }
        }
    }
}