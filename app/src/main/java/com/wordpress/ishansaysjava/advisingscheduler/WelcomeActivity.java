package com.wordpress.ishansaysjava.advisingscheduler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void start(View view)
    {
        Intent intent = new Intent(this, CourseListActivity.class);
        startActivity(intent);
        finish();
    }

}
