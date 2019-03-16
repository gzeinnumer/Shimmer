package com.gzeinnumer.shimmer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class MainActivity extends AppCompatActivity {

    Boolean isStart = false;
    ShimmerTextView textView;
    Shimmer shimmer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn(View view) {
        textView = findViewById(R.id.shimmer_tv);
        shimmer = new Shimmer()
                .setDirection(Shimmer.ANIMATION_DIRECTION_RTL)
                .setDuration(499)
                .setStartDelay(299);
        if(!isStart){
            shimmer.start(textView);
        } else {
            shimmer.cancel();
        }
    }
}
