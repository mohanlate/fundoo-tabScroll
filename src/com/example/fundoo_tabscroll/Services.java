package com.example.fundoo_tabscroll;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebView.FindListener;


public class Services extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        WebView wv = (WebView) container.findViewById(R.id.webView1);
        if(wv != null) wv.loadUrl("http://www.google.com");
    	return inflater.inflate(R.layout.services, container, false);
    }
}
