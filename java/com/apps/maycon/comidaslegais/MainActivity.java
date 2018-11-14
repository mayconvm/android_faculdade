package com.apps.maycon.comidaslegais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFeijoada(View v) {
        Intent intent = new Intent(this, Feijoada.class);
        startActivity(intent);
    }

    public void clickStrogonoff(View v) {
        Intent intent = new Intent(this, Strogonoff.class);
        startActivity(intent);
    }
}
