package com.example.afif.myfinalproject;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class content_keyboard_activity extends AppCompatActivity {

    private EditText a;
    private Button b,c;
    private ContentResolver resolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_keyboard_activity);
        a=findViewById(R.id.output);
        b=findViewById(R.id.enable_keyboard_id);
        c=findViewById(R.id.select_keyboard_id);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
                ob.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(ob);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
                imeManager.showInputMethodPicker();
            }
        });
    }
}
