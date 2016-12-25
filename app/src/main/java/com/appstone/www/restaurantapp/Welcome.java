package com.appstone.www.restaurantapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by aishwaryatalapuru on 24/12/16.
 */

public class Welcome extends Activity {
    private Button log_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        log_out = (Button) findViewById(R.id.button);
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(),Login.class));

            }
        });

    }
}
