package com.example.lenovo.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class FAQactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqactivity);
        final EditText etCollegeId = (EditText) findViewById(R.id.etCollegeId);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etMobile = (EditText) findViewById(R.id.etMobile);
        final EditText etQuery = (EditText) findViewById(R.id.etQuery);

        final Button bSubmit=(Button)findViewById(R.id.bSubmit);
        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();
                final String collegeid = etCollegeId.getText().toString();
                final String name = etName.getText().toString();
                final long mobile = Long.parseLong(etMobile.getText().toString());
                final String query = etQuery.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            Boolean success = jsonResponse.getBoolean("success");

                            if (success) {
                                // Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                //RegisterActivity.this.startActivity(intent);

                                Toast.makeText(getApplicationContext(), "QUERY RECORDED", Toast.LENGTH_LONG).show();


                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(FAQactivity.this);
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

                FAQrequest registerRequest = new FAQrequest(collegeid,name,mobile,query,responseListener);
                RequestQueue queue = Volley.newRequestQueue(FAQactivity.this);
                queue.add(registerRequest);
            }
        });
    }
}