package com.example.whatsappdm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText enterNumber;
    EditText enterMsg;
    Button sendMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNumber = findViewById(R.id.enter_number);
        enterMsg = findViewById(R.id.enter_msg);
        sendMsg = findViewById(R.id.send_in_whatsApp);

        sendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message=enterMsg.getText().toString();
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse( "https://api.whatsapp.com/send?phone="+enterNumber.getText().toString()+"&text="+message)));
            }
        });


    }
}
