package com.digitalhouse.intentexercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {

    EditText senderEditText;
    Button sendBundle;
    String editTextValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        sendBundle = (Button) findViewById(R.id.sendBundle);
        senderEditText = (EditText) findViewById(R.id.editText1);
    }

    public void sendBundleMethod(View v) {
        Toast.makeText(this, "Bundle sent", Toast.LENGTH_SHORT).show();
        Intent senderIntent = new Intent (this, ReceptorActivity.class);
        editTextValue = senderEditText.getText().toString();
        Bundle senderBundle = new Bundle();
        senderBundle.putString("editText1", editTextValue);
        senderIntent.putExtras(senderBundle);
        startActivity(senderIntent);
    }
}
