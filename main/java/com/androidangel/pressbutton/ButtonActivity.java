package com.androidangel.pressbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void onPressButtonClick(View view) {
        Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_LONG).show();
      Intent i = new Intent(ButtonActivity.this,DisplayHelloWorldActivity.class);
        startActivity(i);





    }
}
