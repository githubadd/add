package com.example.addi.addone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.addi.addone.R;


public class mains1 extends Activity{
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mains1);

        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);

        one.setOnClickListener(handler);
        two.setOnClickListener(handler);
        three.setOnClickListener(handler);
        four.setOnClickListener(handler);
        five.setOnClickListener(handler);

        one.setTag(1);
        two.setTag(2);
        three.setTag(3);
        four.setTag(4);
        five.setTag(5);
    }
    View.OnClickListener handler = new View.OnClickListener() {
        public void onClick(View v) {
            int tag = (Integer) v.getTag();
            whichone(tag);
        }
    };

    void whichone(int tag){
        switch(tag){
            case 2:
                Intent intent=new Intent(this,One.class);
                startActivity(intent);
                break;
        }

    }

}
