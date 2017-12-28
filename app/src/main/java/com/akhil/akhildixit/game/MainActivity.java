package com.akhil.akhildixit.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button right,left;
    ImageView imageView;
    int x=50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        right=(Button)findViewById(R.id.right);
        left=(Button)findViewById(R.id.left);
        imageView=(ImageView)findViewById(R.id.image);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setX(x);
                x+=10;
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setX(x);
                x-=10;
            }
        });




    }
}
