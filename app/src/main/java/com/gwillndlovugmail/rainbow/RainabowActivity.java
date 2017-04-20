package com.gwillndlovugmail.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RainabowActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainabow);
        textView1=(TextView)this.findViewById(R.id.textView1);
        textView2=(TextView)this.findViewById(R.id.textView2);
        textView3=(TextView)this.findViewById(R.id.textView3);
        textView4=(TextView)this.findViewById(R.id.textView4);
        textView5=(TextView)this.findViewById(R.id.textView5);
        textView6=(TextView)this.findViewById(R.id.textView6);
        textView7=(TextView)this.findViewById(R.id.textView7);


    }
}
