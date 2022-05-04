package com.gamegards.allinonev3._LuckySpinner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.gamegards.allinonev3.R;
import java.util.Random;

public class LuckySpinnerActivity extends AppCompatActivity {

    Button btnSpin;
    ImageView ivWheel;
    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_activity);

        // initializing views
        btnSpin = findViewById(R.id.btnSpin);
        ivWheel = findViewById(R.id.ivWheel);

        // creating an object of Random class
        // to generate random numbers for the spin
        final Random random = new Random();

        // on click listener for btnSpin
        btnSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // disabling the button so that user
                // should not click on the button
                // while the wheel is spinning
                btnSpin.setEnabled(false);

                // reading random value between 10 to 30
                int spin = random.nextInt(20)+10;

                // since the wheel has 10 divisions, the
                // rotation should be a multiple of
                // 360/10 = 36 degrees
                spin = spin * 36;

                // timer for each degree movement
                timer = new CountDownTimer(spin*20,1) {
                    @Override
                    public void onTick(long l) {
                        // rotate the wheel
                        float rotation = ivWheel.getRotation() + 2;
                        ivWheel.setRotation(rotation);
                    }

                    @Override
                    public void onFinish() {
                        // enabling the button again
                        btnSpin.setEnabled(true);
                    }
                }.start();

            }
        });

    }
}
