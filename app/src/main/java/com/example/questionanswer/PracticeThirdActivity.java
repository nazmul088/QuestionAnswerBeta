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
<<<<<<< HEAD
import java.util.HashMap;
=======
>>>>>>> 193b0070f939f883e7d791121fd7ac2f88b83896
import java.util.List;

public class PracticeThirdActivity extends CustomActivity {
    public static String resultString = "";

    private Button button;
    private TextView textView;

    public static Activity activity;
    double a=100;
    double b=50;

    public static boolean ended=false;

    private String language;
    private Context context;
    private Resources resources;


    private void setupTableBangla() {
        TableLayout tableLayout = (TableLayout) findViewById(R.id.table_layout);
        for(int i=0;i<10;i++)
        {
            double temp = calculateResult(i);
            TableRow tableRow = (TableRow)tableLayout.getChildAt(i+1);
            textView = (TextView) tableRow.getChildAt(0);
            if(i==0)
<<<<<<< HEAD
                textView.setText("যদি ১০০০-২০০০ সঠিক হয়");
            else if(i==1)
                textView.setText("যদি ২০০১-৩০০০ সঠিক হয়");
            else if(i==2)
                textView.setText("যদি ৩০০১-৪০০০ সঠিক হয়");
            else if(i==3)
                textView.setText("যদি ৪০০১-৫০০০ সঠিক হয়");
            else if(i==4)
                textView.setText("যদি ৫০০১-৬০০০ সঠিক হয়");
            else if(i==5)
                textView.setText("যদি ৬০০১-৭০০০ সঠিক হয়");
            else if(i==6)
                textView.setText("যদি ৭০০১-৮০০০ সঠিক হয়");
            else if(i==7)
                textView.setText("যদি ৮০০১-৯০০০ সঠিক হয়");
            else if(i==8)
                textView.setText("যদি ৯০০১-১০০০০ সঠিক হয়");
            else if(i==9)
                textView.setText("যদি ১০০০১-১১০০০ সঠিক হয়");
=======
                textView.setText("যদি ০০০০০-১০০০০ সঠিক হয়");
            else if(i==1)
                textView.setText("যদি ১০০০১-২০০০০ সঠিক হয়");
            else if(i==2)
                textView.setText("যদি ২০০০১-৩০০০০ সঠিক হয়");
            else if(i==3)
                textView.setText("যদি ৩০০০১-৪০০০০ সঠিক হয়");
            else if(i==4)
                textView.setText("যদি ৪০০০১-৫০০০০ সঠিক হয়");
            else if(i==5)
                textView.setText("যদি ৫০০০১-৬০০০০ সঠিক হয়");
            else if(i==6)
                textView.setText("যদি ৬০০০১-৭০০০০ সঠিক হয়");
            else if(i==7)
                textView.setText("যদি ৭০০০১-৮০০০০ সঠিক হয়");
            else if(i==8)
                textView.setText("যদি ৮০০০১-৯০০০০ সঠিক হয়");
            else if(i==9)
                textView.setText("যদি ৯০০০১-১০০০০০ সঠিক হয়");
>>>>>>> 193b0070f939f883e7d791121fd7ac2f88b83896
        }
    }
    public static int value[]={0,0,0,0,0,0,0,0,0,0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        il=new ItemList[11];
        activity=this;
        setContentView(R.layout.activity_practice_third);

<<<<<<< HEAD
        //language = "English";
       language= getIntent().getStringExtra("language");
=======
       // language = "English";
        language= getIntent().getStringExtra("language");
>>>>>>> 193b0070f939f883e7d791121fd7ac2f88b83896


        if(language.equalsIgnoreCase("Bangla"))
            setupTableBangla();
        if(language.equalsIgnoreCase("Bangla"))
        {
            context = LocaleHelper.setLocale(PracticeThirdActivity.this, "bn");
            resources = context.getResources();
            textView = (TextView) findViewById(R.id.textView);
            textView.setText(resources.getString(R.string.practiceQuestion3));

            textView = (TextView) findViewById(R.id.h1);
            textView.setText(resources.getString(R.string.q_3_o_1));

            textView = (TextView) findViewById(R.id.h2);
            textView.setText(resources.getString(R.string.q_3_o_2));

            textView = (TextView) findViewById(R.id.h3);
            textView.setText(resources.getString(R.string.q_3_o_3));

            textView = (TextView) findViewById(R.id.h4);
            textView.setText(resources.getString(R.string.q_3_o_4));

            textView = (TextView) findViewById(R.id.h5);
            textView.setText(resources.getString(R.string.q_3_o_5));

            textView = (TextView) findViewById(R.id.h6);
            textView.setText(resources.getString(R.string.q_3_o_6));

            textView = (TextView) findViewById(R.id.h7);
            textView.setText(resources.getString(R.string.q_3_o_7));

            textView = (TextView) findViewById(R.id.h8);
            textView.setText(resources.getString(R.string.q_3_o_8));

            textView = (TextView) findViewById(R.id.h9);
            textView.setText(resources.getString(R.string.q_3_o_9));

            textView = (TextView) findViewById(R.id.h10);
            textView.setText(resources.getString(R.string.q_3_o_10));



        }
        else{
            context = LocaleHelper.setLocale(PracticeThirdActivity.this, "en");
            resources = context.getResources();
            textView = (TextView) findViewById(R.id.textView);
            textView.setText(resources.getString(R.string.practiceQuestion3));

            textView = (TextView) findViewById(R.id.h1);
            textView.setText(resources.getString(R.string.q_3_o_1));

            textView = (TextView) findViewById(R.id.h2);
            textView.setText(resources.getString(R.string.q_3_o_2));

            textView = (TextView) findViewById(R.id.h3);
            textView.setText(resources.getString(R.string.q_3_o_3));

            textView = (TextView) findViewById(R.id.h4);
            textView.setText(resources.getString(R.string.q_3_o_4));

            textView = (TextView) findViewById(R.id.h5);
            textView.setText(resources.getString(R.string.q_3_o_5));

            textView = (TextView) findViewById(R.id.h6);
            textView.setText(resources.getString(R.string.q_3_o_6));

            textView = (TextView) findViewById(R.id.h7);
            textView.setText(resources.getString(R.string.q_3_o_7));

            textView = (TextView) findViewById(R.id.h8);
            textView.setText(resources.getString(R.string.q_3_o_8));

            textView = (TextView) findViewById(R.id.h9);
            textView.setText(resources.getString(R.string.q_3_o_9));

            textView = (TextView) findViewById(R.id.h10);
            textView.setText(resources.getString(R.string.q_3_o_10));


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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = (TextView) findViewById(R.id.tsrc);
                if(textView.getText().toString().equals("0"))
                {
                    double result;
                    double lostValue;
                    if(!ended) {
                        for(int i=0;i<10;i++)
                        {
                            value[i]=Integer.parseInt(tdes[i].getText().toString());
                        }
                        result = calculateResult(6);
                        lostValue = 100 - result;
                        ended=true;
                    }
                    else
                    {
                        result=Double.parseDouble(resultString);
                        lostValue=100-result;
                    }

                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("game","practiceThird");


                    resultString=String.valueOf(result);
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
                    Toast.makeText(PracticeThirdActivity.this, "Please Drag all Icon from Source Box", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });


        if(ended==true)
        {
            List<DataItem>listsrc=new ArrayList<>();
            List<List<DataItem>>desLists=new ArrayList<>();
            for(int i=0;i<10;i++)
            {
                List<DataItem>dlists=new ArrayList<>();
                for(int j=0;j<value[i];j++)
                    dlists.add(new DataItem(j,""));
                desLists.add(dlists);
            }

            for(int i=0;i<10;i++)
            {
                ldes[i].setHasFixedSize(true);
                ldes[i].setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
                List<DataItem>list1=desLists.get(i);
                il[i+1]=new ItemList(activity,list1,des[i],ldes[i],tdes[i]);
                ldes[i].setAdapter(il[i+1]);
                tdes[i].setText(""+list1.size());
            }

            TableLayout tableLayout = (TableLayout) findViewById(R.id.table_layout);
            tableLayout.setVisibility(View.VISIBLE);
            for(int i=0;i<10;i++)
            {
                double temp = calculateResult(i);
                TableRow tableRow = (TableRow)tableLayout.getChildAt(i+1);
                textView = (TextView) tableRow.getChildAt(1);
                if(language.equalsIgnoreCase("Bangla"))
                    textView.setText(MyStaff.numBangla(temp));
                else
                    textView.setText(String.valueOf(temp));
            }

            return;
        }
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
                        if(language.equalsIgnoreCase("Bangla"))
                            textView.setText(MyStaff.numBangla(temp));
                        else
                            textView.setText(String.valueOf(temp));
                    }
                }
            });
        }




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

<<<<<<< HEAD
    public static HashMap<String,String> resp=new HashMap<>();
=======
    public static List<String> resp=new ArrayList<>();
>>>>>>> 193b0070f939f883e7d791121fd7ac2f88b83896

    int totVal=0;

    public void setResultVisible()
    {
        int totalValue = 0;
        for(int i=0;i<10;i++)
        {
            textView = (TextView) tdes[i];
            totalValue = totalValue + Integer.parseInt(textView.getText().toString());

        }
        if(totalValue == 10&&totVal!=10)
        {
            totVal=10;
            TableLayout tableLayout = findViewById(R.id.table_layout);
            tableLayout.setVisibility(View.VISIBLE);
<<<<<<< HEAD
            resp=getRes();
            //if(resp.size()==0||(!resp.get(resp.size()-1).equals(getRes())))
              //  resp.add(getRes());
=======
            if(resp.size()==0||(!resp.get(resp.size()-1).equals(getRes())))
                resp.add(getRes());
>>>>>>> 193b0070f939f883e7d791121fd7ac2f88b83896
        }
        else{
            totVal=0;
            TableLayout tableLayout = findViewById(R.id.table_layout);
            tableLayout.setVisibility(View.INVISIBLE);
        }
    }
}