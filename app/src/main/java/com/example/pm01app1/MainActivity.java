package com.example.pm01app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest jsonObjectRequest=new StringRequest(Request.Method.GET,
                "https://jsonplaceholder.typicode.com/posts", new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                Log.d("Respueste",response.toString());
            }
        }, new Response.ErrorListener() {
                public void onErrorResponse(VolleyError error) {
                    Log.d("Respueste",error.toString());
            }
        });


    }
}
