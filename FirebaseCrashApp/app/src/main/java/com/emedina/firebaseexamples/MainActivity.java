package com.emedina.firebaseexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String message= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnCrash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.replace(".","");
            }
        });
    }
}
