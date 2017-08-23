package com.example.pulkit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Main2Activity extends AppCompatActivity {

    private String email="aggarwalpulkit596@gmail.com",password="pulkit1234";
    private EditText edt1,edt2;
    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt1 = findViewById(R.id.email);
        edt2 = findViewById(R.id.password);
    }

    public void newIntent(View view) {
        if(!Objects.equals(edt1.getText().toString(), email) || !Objects.equals(edt2.getText().toString(),password)){
            counter++;
            Toast.makeText(this, "Invalid Id or Password", Toast.LENGTH_SHORT).show();
            if(counter==5)
                finish();
            return;
        }else {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Main2Activity.this,MainActivity.class));
        }

    }
}
