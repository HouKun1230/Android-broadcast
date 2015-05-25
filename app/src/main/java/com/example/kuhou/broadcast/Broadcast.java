package com.example.kuhou.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kuhou on 25/05/2015.
 */
public class Broadcast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        String name = intent.getStringExtra("name");

        Toast.makeText(context,"broadcast-1:" + name, 1000).show();

    }
}
