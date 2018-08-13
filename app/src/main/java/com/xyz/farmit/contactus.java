package com.xyz.farmit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contactus extends AppCompatActivity {
Button email,meso,call,tweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        email=findViewById(R.id.button10);
        call=findViewById(R.id.button6);
        meso=findViewById(R.id.button9);
        tweet=findViewById(R.id.button7);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","eunallela@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FarmIT");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Enter content here");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
        meso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "0706243293";  // The number on which you want to send SMS
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "0719775049";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        tweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.twitter.com/intent/tweet?url=YOURURL&text=@DeniseAllela";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
