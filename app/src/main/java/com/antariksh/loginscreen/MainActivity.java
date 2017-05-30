package com.antariksh.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.password;

public class MainActivity extends AppCompatActivity {

    /*       For Validation

    EditText email;
    EditText pass;
    Button btn;

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ocCreate activity method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   // layout passing

        /*

        *************** Validation Code****************

        email = (EditText) findViewById(R.id.userEmail);
        pass = (EditText) findViewById(R.id.userPass);
        btn = (Button) findViewById(R.id.loginBtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (email.getText().toString().trim().length() == 0) {
                    email.setError("Email is not entered");
                    email.requestFocus();
                }
                if (pass.getText().toString().trim().length() == 0) {
                    pass.setError("Password is not entered");
                    pass.requestFocus();
                } else {
                    // successful login
                }
            }


        });  */
    }
}
