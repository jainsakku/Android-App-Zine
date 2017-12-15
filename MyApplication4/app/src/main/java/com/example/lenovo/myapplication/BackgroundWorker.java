package com.example.lenovo.myapplication;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


public class BackgroundWorker extends AsyncTask<String, Void, String> {
    Builder builder;
    Context context;
    ProgressDialog progressDialog;

    public BackgroundWorker(Context ctx) {
        this.context = ctx;
    }

    protected String doInBackground(String... params) {
        String login_url = "http://zine.co.in/register.php";
        if (params[0].equals("register")) {
            try {
                String name = params[1];
                String email = params[2];
                String mobile = params[3];
                String id = params[4];
                String branch = params[5];
                String hosteller = params[6];
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(login_url).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                bufferedWriter.write(URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&" + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&" + URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8") + "&" + URLEncoder.encode("mobile", "UTF-8") + "=" + URLEncoder.encode(mobile, "UTF-8") + "&" + URLEncoder.encode("branch", "UTF-8") + "=" + URLEncoder.encode(branch, "UTF-8") + "&" + URLEncoder.encode("hosteller", "UTF-8") + "=" + URLEncoder.encode(hosteller, "UTF-8"));
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
                String result = BuildConfig.FLAVOR;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        result = result + line;
                    } else {
                        bufferedReader.close();
                        inputStream.close();
                        httpURLConnection.disconnect();
                        return result;
                    }
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    protected void onPreExecute() {
        this.builder = new Builder(this.context);
        this.progressDialog = new ProgressDialog(this.context);
        this.progressDialog.setTitle("Please Wait..");
        this.progressDialog.setMessage("Registering....");
        this.progressDialog.setIndeterminate(true);
        this.progressDialog.setCancelable(false);
        this.progressDialog.show();
    }

    protected void onPostExecute(String result) {
        this.progressDialog.dismiss();
        this.builder = new Builder(this.context);
        this.builder.setTitle("Registering.");
        this.builder.setMessage(result);
        this.builder.setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        this.builder.create().show();
    }

    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
