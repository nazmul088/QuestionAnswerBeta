package com.example.questionanswer;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomActivity extends AppCompatActivity {
    public static ItemList il[];
    public static RecyclerView ldes[]=new RecyclerView[10];
    public static CardView des[]=new CardView[10];
    public static TextView tdes[]=new TextView[11];
    public static TextView hdes[]=new TextView[11];
    public static ConstraintLayout root;
    public static RecyclerView lsrc;
    public static CardView src;

    public HashMap<String,String> res=new HashMap<>();

    public HashMap<String,String> getRes()
    {
        HashMap<String,String>has=new HashMap<>();
        String s="";
        for(int i=1;i<11;i++) {
            has.put(hdes[i].getText().toString(),(tdes[i-1].getText().toString()));
        }
        return has;
    }

    public String getResOld()
    {
        String s="";
        for(int i=1;i<11;i++) {
            if (!tdes[i-1].getText().toString().equals("0")) {
                if (!s.equals(""))
                    s += "_";
                s+=hdes[i].getText().toString()+"(" + tdes[i-1].getText().toString() + ")";
                //s += ("" + ((i - 1) * 10 + 1) + "-" + (i * 10) + "(" + tdes[i-1].getText() + ")");
            }
        }
        return s;
    }

}
