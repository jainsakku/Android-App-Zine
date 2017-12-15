package com.example.lenovo.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        setTitle("Register");

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etCollegeId = (EditText) findViewById(R.id.etCollegeId);
        final EditText etMobile = (EditText) findViewById(R.id.etMobile);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etHostel = (EditText) findViewById(R.id.etHostel);
        final EditText etBranch = (EditText) findViewById(R.id.etBranch);
        final Button bSubmit=(Button)findViewById(R.id.bSubmit);
        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "In process,pls wait!!!", Toast.LENGTH_LONG).show();
                final String name = etName.getText().toString();
                final String collegeid = etCollegeId.getText().toString();
                final long mobile = Long.parseLong(etMobile.getText().toString());
                final String email = etEmail.getText().toString();
                final String hostel = etHostel.getText().toString();
                final String branch = etBranch.getText().toString();
                if (name.isEmpty() || collegeid.isEmpty() ||email.isEmpty()||hostel.isEmpty()||branch.isEmpty())

                {
                    Toast.makeText(getApplicationContext(),
                            "Please enter your details!", Toast.LENGTH_LONG)
                            .show();
                }
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            Boolean success = jsonResponse.getBoolean("success");

                            String op=jsonResponse.getString("id");
                            setContentView(R.layout.activity_register);
                            TextView textView = (TextView) findViewById(R.id.etid);
                            textView.setText("Your id is "+op);

                            if (success) {
                                // Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                //RegisterActivity.this.startActivity(intent);

                                Toast.makeText(getApplicationContext(), "REGISTRATION DONE", Toast.LENGTH_LONG).show();
                                Toast.makeText(getApplicationContext(), "Pls remember your id shown below.", Toast.LENGTH_LONG).show();


                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(collegeid,name,mobile,email,hostel,branch,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}