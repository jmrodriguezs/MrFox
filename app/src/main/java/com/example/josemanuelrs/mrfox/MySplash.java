package com.example.josemanuelrs.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JoseManuelRS on 07/03/2017.
 */

public class MySplash extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        TextView myTitle = (TextView)findViewById(R.id.txttitulo);
        ImageView logo= (ImageView) findViewById(R.id.fox);
        Drawable drawable= getResources().getDrawable(R.drawable.fox);
        logo.setImageDrawable(drawable);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);


        Animation shake = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        Animation rotar=AnimationUtils.loadAnimation(this,R.anim.girar);

        myTitle.startAnimation(shake);
        logo.startAnimation(rotar);

        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash
                        .this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

}

