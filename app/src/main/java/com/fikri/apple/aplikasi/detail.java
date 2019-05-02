package com.fikri.apple.aplikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class detail extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        web = findViewById(R.id.web);

        Intent detail = getIntent();
        detail.getIntExtra("Posisi", 0);
        String link = detail.getStringExtra("Link");

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(link);


    }
}
