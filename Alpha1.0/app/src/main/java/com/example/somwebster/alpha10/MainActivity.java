package com.example.somwebster.alpha10;

import com.example.somwebster.alpha10.loadwebimage.R;
import com.example.somwebster.alpha10.loadwebimage.imageutils.ImageLoader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView imgView;
    private ImageLoader imgLoader;
    private String strURL = "http://technotalkative.com/android.jpg";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.imageView1);
        imgLoader = new ImageLoader(this);
    }

    public void btnLoadImageClick(View v){

        imgLoader.DisplayImage(strURL, imgView);
    }
}