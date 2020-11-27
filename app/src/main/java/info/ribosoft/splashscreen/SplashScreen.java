package info.ribosoft.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    int SPLASH_TIME_OUT = 3000;

    @Override
    // Create the first activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /* Create a new handler to the message queue
           to be run after the specified amount of time elapses */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start a new activity
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}