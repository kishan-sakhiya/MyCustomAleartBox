package com.rku_18fotca11036.mycustomaleartbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDissmiss,btnAlert;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = findViewById(R.id.btnAlert);

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_design);
               btnDissmiss = dialog.findViewById(R.id.btnDismiss);

                btnDissmiss.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}