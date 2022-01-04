package com.example.heart;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import xyz.hanks.library.bang.SmallBangView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1st image pop animation
        SmallBangView like_heart = (SmallBangView) findViewById(R.id.like_heart);
        like_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(like_heart.isSelected()){
                    like_heart.setSelected(true);
                }else{
                    like_heart.setSelected(true);
                    Toast.makeText(MainActivity.this, "NEZUKO KAMADO", Toast.LENGTH_SHORT).show();
                    like_heart.likeAnimation(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationCancel(Animator animation) {
                            super.onAnimationCancel(animation);
                        }
                    });
                }
            }
        });

        //2nd Image bounce animation
        ImageView img2 = (ImageView) findViewById(R.id.galaxy);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img2.isSelected()){
                    img2.setSelected(true);
                }else{
                    img2.setSelected(true);
                    Toast.makeText(MainActivity.this, "KIRA", Toast.LENGTH_SHORT).show();
                    Context context;
                    Animation animation = new AnimationUtils().loadAnimation(getApplicationContext(), R.anim.bounce);
                    img2.startAnimation(animation);
                }
            }
        });

        //3rd Image rotate clockwise animation
        ImageView img3 = (ImageView) findViewById(R.id.onep);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img3.isSelected()){
                    img3.setSelected(true);
                }else{
                    img3.setSelected(true);
                    Toast.makeText(MainActivity.this,"TONY TONY CHOPPER", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
                    img3.startAnimation(animation);
                }
            }
        });

        //4th Image rotate anticlockwise
        ImageView img4 = (ImageView) findViewById(R.id.pikachu);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img4.isSelected()){
                    img4.setSelected(true);
                }else{
                    img4.setSelected(true);
                    Toast.makeText(MainActivity.this,"PIKACHU", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);
                    img4.startAnimation(animation);
                }
            }
        });


        //5th Image zoom In
        ImageView img5 = (ImageView) findViewById(R.id.stitch);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img5.isSelected()){
                    img5.setSelected(true);
                }else{
                    img5.setSelected(true);
                    Toast.makeText(MainActivity.this,"STITCH", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
                    img5.startAnimation(animation);
                }
            }
        });

        //6th Image zoomout
        ImageView img6 = (ImageView) findViewById(R.id.kuroko);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img6.isSelected()){
                    img6.setSelected(true);
                }else{
                    img6.setSelected(true);
                    Toast.makeText(MainActivity.this,"KUROKO", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomout);
                    img6.startAnimation(animation);
                }
            }
        });

        //7th Image blink
        ImageView img7 = (ImageView) findViewById(R.id.naruto);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img7.isSelected()){
                    img7.setSelected(true);
                }else{
                    img7.setSelected(true);
                    Toast.makeText(MainActivity.this,"NARUTO", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                    img7.startAnimation(animation);
                }
            }
        });


        //8th Image change position
        ImageView img8 = (ImageView) findViewById(R.id.sanguko);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img8.isSelected()){
                    img8.setSelected(true);
                }else{
                    img8.setSelected(true);
                    Toast.makeText(MainActivity.this,"SAN GOKU", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.position);
                    img8.startAnimation(animation);
                }
            }
        });

        //9th Image fade in
        ImageView img9 = (ImageView) findViewById(R.id.conan);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img9.isSelected()){
                    img9.setSelected(true);
                }else{
                    img9.setSelected(true);
                    Toast.makeText(MainActivity.this,"DETECTIVE CONAN", Toast.LENGTH_SHORT).show();
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
                    img9.startAnimation(animation);
                }
            }
        });
    }
}