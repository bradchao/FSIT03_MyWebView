package tw.brad.app.helloworld.mywebview;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webview);
        name = (EditText)findViewById(R.id.name);

        initWebView();
    }
    private void initWebView(){
        webView.setWebViewClient(new WebViewClient());

        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);

        //webView.loadUrl("http://www.iii.org.tw");
        webView.loadUrl("file:///android_asset/brad01.html");
    }
    public void test1(View view){
        String myname = name.getText().toString();
        webView.loadUrl("javascript:test3('" + myname+ "')");
    }
    public void test2(View view){

    }
    public void test3(View view){

    }
    public void test4(View view){

    }


}
