package com.example.questionanswer;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CustomActivity extends AppCompatActivity {
    public static ItemList il[];
    public static RecyclerView ldes[]=new RecyclerView[10];
    public static CardView des[]=new CardView[10];
    public static TextView tdes[]=new TextView[11];
    public static TextView hdes[]=new TextView[11];
    public static ConstraintLayout root;
    public static RecyclerView lsrc;
    public static CardView src;
}
