package edu.css.mjackson1.businesscontacts;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


import org.w3c.dom.Text;

public class SecondActivity extends Activity {

    String businessNum; // this will be the number of the business from mainActivity
    TextView txtName, txtSummary, txtLocation, txtHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetContentView(R.layout.layout_second);

        txtName = (TextView) findViewById(R.id.txtName);
        txtSummary = (TextView) findViewById(R.id.txtSummary);
        txtLocation = (TextView) findViewById(R.id.txtLocation);
        txtHours = (TextView) findViewById(R.id.txtHours);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            businessNum = extras.getString("businessNum");
        }

        if (businessNum.equals("1")) {
            txtName.setText("Best Buy");
            txtSummary.setText("Best Buy Co., Inc. is an American multinational consumer electronics corporation headquartered in Richfield, Minnesota, a Minneapolis suburb. It operates in the United States, Puerto Rico, Mexico, Canada, and China. The company was founded by Richard M. Schulze and Gary Smoliak in 1966 as an audio specialty store. In 1983, it was renamed and rebranded with more emphasis placed on consumer electronics.");
            txtLocation.setText("5105 Burning Tree Rd, Duluth, MN 55811");
            txtHours.setText("Monday-Saturday: 10:00am to 9:00pm; Sunday: 10:00am to 8:00pm");
        }
        if (businessNum.equals("2")) {
            txtName.setText("Target");
            txtSummary.setText("Target Corporation is an American retailing company, founded in 1902 and headquartered in Minneapolis, Minnesota. It is the second-largest discount retailer in the United States. The company is ranked 36th on the Fortune 500 as of 2013 and is a component of the Standard & Poor's 500 index.");
            txtLocation.setText("1902 Miller Trunk Hwy, Duluth, MN 55811");
            txtHours.setText("Monday-Saturday: 8:00am-11:00pm; Sunday: 8:00am-10:00pm");
        }
        if (businessNum.equals("3")) {
            txtName.setText("Texas Roadhouse");
            txtSummary.setText("Target Corporation is an American retailing company, founded in 1902 and headquartered in Minneapolis, Minnesota. It is the second-largest discount retailer in the United States. The company is ranked 36th on the Fortune 500 as of 2013 and is a component of the Standard & Poor's 500 index.");
            txtLocation.setText("902 Mall Drive, Duluth, MN 55811");
            txtHours.setText("Monday-Thursday: 4:00pm-10:00pm; Friday-Sunday: 11:00am-11:00pm");
        }
    }
}