package com.sachin.java.javasachin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ahntaehyen on 15. 10. 3..
 */
public class FightActivity extends Activity{

    private TextView nick1, nick2, desc1, desc2;
    private Button select1, select2;
    private ArrayList<User> display;
    private int u1, u2;
    int totalSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fight_activity);

        init();
        select1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext(u2);
            }
        });

        select2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext(u1);
            }
        });
    }

    private void init(){
        display = new ArrayList<User>();
        totalSize = SelectActivity.userList.size();
        nick1 = (TextView)findViewById(R.id.nick_tv);
        nick2 = (TextView)findViewById(R.id.nick_tv2);
        desc1 = (TextView)findViewById(R.id.desc_tv);
        desc2 = (TextView)findViewById(R.id.desc_tv2);
        select1 = (Button)findViewById(R.id.select_btn);
        select2 = (Button)findViewById(R.id.select_btn2);
        u1 = 0; u2 = 1;
        display.add(SelectActivity.userList.get(u1));
        display.add(SelectActivity.userList.get(u2));
        nick1.setText(display.get(0).getNick());
        nick2.setText(display.get(1).getNick());
        desc1.setText(display.get(0).getSelfDesc());
        desc1.setText(display.get(1).getSelfDesc());

    }

    private void moveNext(int unselected){

        SelectActivity.userList.remove(unselected);

        if(SelectActivity.userList.size()==totalSize/2){
            Toast.makeText(this, "Complete", Toast.LENGTH_SHORT).show();

        }else{
            u1++;
            u2++;
            display.add(SelectActivity.userList.get(u1));
            display.add(SelectActivity.userList.get(u2));
            nick1.setText(display.get(0).getNick());
            nick2.setText(display.get(1).getNick());
            desc1.setText(display.get(0).getSelfDesc());
            desc1.setText(display.get(1).getSelfDesc());
        }



    }
}
