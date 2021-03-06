package edu.css.mjackson1.businesscontacts;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // the following code will run when the Best Buy button is pushed
    public void onClickButton1(View view) {
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("businessNum","1");
        startActivity(i);
    }

    // the following code will run when the Target button is pushed
    public void onClickButton2(View view) {
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("businessNum","2");
        startActivity(i);
    }

    // the following code will run when the Texas Roadhouse button is pushed
    public void onClickButton3(View view) {
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("businessNum","3");
        startActivity(i);
    }

}