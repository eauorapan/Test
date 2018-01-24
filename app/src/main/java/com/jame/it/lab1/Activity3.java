package com.jame.it.lab1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final EditText addressfield = (EditText) findViewById(R.id.location);
        final Button button = (Button) findViewById(R.id.mapbutton);
        button.setOnClickListener(new Button.OnClickListener(){
            public  void onClick(View v){
                try {

                    String address = addressfield.getText().toString();
                    address = address.replace(' ','+');
                    Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0=" + address));

                    startActivity(geoIntent);

                }catch(Exception e ){}

            }
        });

    }
}
