package com.wordpress.ishansaysjava.advisingscheduler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class AddCourseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);
    }

    public void addData (View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent intent= getIntent();

        EditText editText = (EditText) findViewById(R.id.course_name);
        Spinner class_time = (Spinner) findViewById(R.id.class_time);
        Spinner lab_time = (Spinner) findViewById(R.id.lab_time);
        Spinner class_day = (Spinner) findViewById(R.id.class_day);
        Spinner lab_day = (Spinner) findViewById(R.id.lab_day);

        switch (intent.getIntExtra("list_pos", 200))
        {
            case R.id.course1:
                editor.putString("course1", editText.getText().toString());
                editor.putInt("class1", findTime(class_time));
                editor.putInt("lab1", findTimewithNA(lab_time));
                editor.putInt("corday1", findTime(class_day));
                editor.putInt("labday1",findTimewithNA(lab_day));
                break;

            case R.id.course2:
                editor.putString("course2", editText.getText().toString());
                editor.putInt("class2", findTime(class_time));
                editor.putInt("lab2", findTimewithNA(lab_time));
                editor.putInt("corday2", findTime(class_day));
                editor.putInt("labday2",findTimewithNA(lab_day));
                break;

            case R.id.course3:
                editor.putString("course3", editText.getText().toString());
                editor.putInt("class3", findTime(class_time));
                editor.putInt("lab3", findTimewithNA(lab_time));
                editor.putInt("corday3", findTime(class_day));
                editor.putInt("labday3",findTimewithNA(lab_day));
                break;

            case R.id.course4:
                editor.putString("course4", editText.getText().toString());
                editor.putInt("class4", findTime(class_time));
                editor.putInt("lab4", findTimewithNA(lab_time));
                editor.putInt("corday4", findTime(class_day));
                editor.putInt("labday4",findTimewithNA(lab_day));
                break;

            case R.id.course5:
                editor.putString("course5", editText.getText().toString());
                editor.putInt("class5", findTime(class_time));
                editor.putInt("lab5", findTimewithNA(lab_time));
                editor.putInt("corday5", findTime(class_day));
                editor.putInt("labday5",findTimewithNA(lab_day));
                break;
        }

        editor.commit();

        intent = new Intent(this, CourseListActivity.class);
        startActivity(intent);
        finish();
    }

    public int findTimewithNA(Spinner spinner)
    {
        int i = 0;
        for(; i < 7; i++)
        {
            if(i == spinner.getSelectedItemPosition())
            {
                break;
            }
        }

        return i;
    }

    public int findTime(Spinner spinner)
    {
        int i = 1;
        for(; i < 8; i++)
        {
            if(i == spinner.getSelectedItemPosition()+1)
            {
                break;
            }
        }

        return i;
    }

}
