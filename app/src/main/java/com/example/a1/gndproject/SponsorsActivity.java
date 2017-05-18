package com.example.a1.gndproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SponsorsActivity extends AppCompatActivity {

    private String URL = "https://m.vk.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        WebView web = (WebView)findViewById(R.id.webSponsors);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(URL);

    }
}
