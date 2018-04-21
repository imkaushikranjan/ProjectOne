package com.testworkshop.projectone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends Activity {

    EditText et5, et6, et7, et8;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sign_up);
        et5= (EditText) findViewById(R.id.et5);
        et6= (EditText) findViewById(R.id.et6);
        et7= (EditText) findViewById(R.id.et7);
        et8= (EditText) findViewById(R.id.et8);
        btn3 =(Button) findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent3);
            }
        });
    }
}

