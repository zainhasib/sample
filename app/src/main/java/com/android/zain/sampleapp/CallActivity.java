package com.android.zain.sampleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {

    Button callNum;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        callNum = findViewById(R.id.call_num);
        editText = findViewById(R.id.phone_no);

        callNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = editText.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + num));
                startActivity(i);
            }
        });

    }
}
