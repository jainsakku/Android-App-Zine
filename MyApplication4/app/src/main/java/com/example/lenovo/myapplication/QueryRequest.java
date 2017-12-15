package com.example.lenovo.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class QueryRequest extends StringRequest {
        private static final String REGISTER_REQUEST_URL = "http://www.zine.co.in/QueryApp.php";
        private Map<String, String> params;

    public QueryRequest(String collegeid, String name, long mobile, String query,Response.Listener<String> listener) {
            super(Method.POST, REGISTER_REQUEST_URL, listener, null);
            params = new HashMap<>();
            params.put("collegeid", collegeid);
            params.put("name", name);
            params.put("mobile", mobile + "");
            params.put("query", query);

        }

        @Override
        public Map<String, String> getParams() {
            return params;
        }
    }

