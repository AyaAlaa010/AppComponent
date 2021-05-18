package com.example.appcomponentandworkmnager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;

import androidx.annotation.RequiresApi;


public class OTPReciever  extends BroadcastReceiver {
    private static final String TAG = "OTPReciever";
    @Override
    public void onReceive(Context context, Intent intent) {
        SmsMessage [] smsMessages= Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Log.i(TAG, "onReceive: ");
        if(smsMessages[0].getMessageBody().contains("479573")){
            String[] fragments=smsMessages[0].getMessageBody().split(" ");
            String code=fragments[0];
            Log.i(TAG, "onReceive: "+code);


        }
//        for(SmsMessage smsMessage :smsMessages){ //use in case the search about message in alarg number of messages
//            String SmsMessageBodey=smsMessage.getMessageBody();
//            if(SmsMessageBodey.contains("479573")){
//                String[] fragments=SmsMessageBodey.split(" ");
//                String code=fragments[0];
//                Log.i(TAG, "onReceive: "+code);
//            }
//
//
//        }
    }
}
