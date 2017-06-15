package com.zxp.animation02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_image=null;
    private Button btn_rotate=null;
    private Button btn_scale=null;
    private Button btn_alpha=null;
    private Button btn_translate=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_image=(ImageView)findViewById(R.id.iv_image);

        btn_rotate=(Button)findViewById(R.id.btn_rotate);
        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet animationSet=new AnimationSet(true);
                RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_PARENT,1f,Animation.RELATIVE_TO_PARENT,0f);
                rotateAnimation.setDuration(1000);
                animationSet.addAnimation(rotateAnimation);
                iv_image.startAnimation(animationSet);
            }
        });


        btn_scale=(Button)findViewById(R.id.btn_scale);
        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet animationSet=new AnimationSet(true);
                ScaleAnimation scaleAnimation=new ScaleAnimation(1,0.1f,1,0.1f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                animationSet.addAnimation(scaleAnimation);
                animationSet.setDuration(2000);
                iv_image.startAnimation(animationSet);
            }
        });

        btn_alpha=(Button)findViewById(R.id.btn_alpha);
        btn_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                iv_image.startAnimation(animation);
            }
        });

        btn_translate=(Button)findViewById(R.id.btn_translate);
        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet animationSet=new AnimationSet(true);
                TranslateAnimation translateAnimation=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,2.0f,Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,5.0f);
                translateAnimation.setDuration(1000);
                animationSet.addAnimation(translateAnimation);
                iv_image.startAnimation(animationSet);
            }
        });
    }
}
