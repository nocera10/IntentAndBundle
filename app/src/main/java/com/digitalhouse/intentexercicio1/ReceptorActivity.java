package com.digitalhouse.intentexercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    TextView receptorText;
    String receptorValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);
        receptorText = (TextView) findViewById(R.id.textView1);
        Intent receptorIntent = getIntent();
        Bundle receptorBundle = receptorIntent.getExtras();
        receptorValue = receptorBundle.getString("editText1");
        receptorText.setText(receptorValue);
    }
}
