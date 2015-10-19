package com.example.addi.addone;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class One extends Activity {
    ImageButton word;
    ImageButton write;
    ImageButton mosaic;
    ImageButton express;
    ImageButton frame;
    ImageButton photo;

    //LinearLayout ll;

    Oview paletteView=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.stylexml);

        paletteView=(Oview)findViewById(R.id.palette);

        word=(ImageButton)findViewById(R.id.word);
        write=(ImageButton)findViewById(R.id.write);
        mosaic=(ImageButton)findViewById(R.id.mosaic);
        express=(ImageButton)findViewById(R.id.express);
        frame=(ImageButton)findViewById(R.id.frame);
        photo=(ImageButton)findViewById(R.id.photo);

        word.setOnClickListener(handler);
        write.setOnClickListener(handler);
        mosaic.setOnClickListener(handler);
        express.setOnClickListener(handler);
        frame.setOnClickListener(handler);
        photo.setOnClickListener(handler);

        word.setTag(0);
        write.setTag(1);
        mosaic.setTag(2);
        express.setTag(3);
        frame.setTag(4);
        photo.setTag(5);
        //ll=(LinearLayout)findViewById(R.id.linearLayout1); 
        //int widths=getViewWidth(ll);
        //Log.v("taggg","taggg---."+widths);
    }
    View.OnClickListener handler = new View.OnClickListener() {
        public void onClick(View v) {
            int tag = (Integer) v.getTag();
            paletteView.selected(tag);
        }
    };

    //public int getViewWidth(LinearLayout view){
    //view.measure(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    // return view.getMeasuredWidth();
    // }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return paletteView.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "退出");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==1){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}