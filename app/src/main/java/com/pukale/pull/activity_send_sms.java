package com.pukale.pull;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activity_send_sms extends AppCompatActivity {
    EditText no;
    EditText msg;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);
        no=(EditText)findViewById(R.id.etNo);
        msg=(EditText)findViewById(R.id.etMsg);
    }
    public void msgSend(View arg)
    {
        SmsManager smsManager=SmsManager.getDefault();
        try {
            smsManager.sendTextMessage(no.getText().toString(), null, msg.getText().toString(), null, null);
            Toast.makeText(getApplicationContext(),"Message Sent",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();}

        // Toast.makeText(SmsSenderActivity.this,, Toast.LENGTH_SHORT).show();



    }

}
