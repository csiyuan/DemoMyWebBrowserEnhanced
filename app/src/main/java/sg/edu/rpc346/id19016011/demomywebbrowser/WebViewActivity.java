package sg.edu.rpc346.id19016011.demomywebbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    WebView wvPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvPage = findViewById(R.id.webViewMyPage);

        //Extract the URL from the Intent
        Intent intentReceive = getIntent();
        String url = intentReceive.getStringExtra("url");

        //Initialize the Client Window
        wvPage.setWebViewClient(new WebViewClient());

        //Configure the WebView
        WebSettings webSettings = wvPage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        //Load the web page
        wvPage.loadUrl(url);
    }
}


