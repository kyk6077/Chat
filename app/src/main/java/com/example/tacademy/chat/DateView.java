package com.example.tacademy.chat;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class DateView extends FrameLayout{
    public DateView (Context context) {
        super(context);
        init();
    }

    TextView messageView;
    DateData data;

    private void init(){
        inflate(getContext(),R.layout.view_date,this);
        messageView = (TextView)findViewById(R.id.textView);

    }

    public void setData(DateData data){
        this.data = data;
        messageView.setText(data.message);
    }
}
