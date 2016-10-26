package com.wordpress.ishansaysjava.advisingscheduler;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CourseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        TextView time_class= (TextView) findViewById(R.id.time_class);
        TextView time_lab= (TextView) findViewById(R.id.time_lab);
        TextView day_class = (TextView) findViewById(R.id.day_class);
        TextView day_lab = (TextView) findViewById(R.id.day_lab);

        Intent intent = getIntent();
        time_class.setText(getClassTime(intent.getIntExtra("class_time", 200)));
        time_lab.setText(getLabTime(intent.getIntExtra("lab_time", 200)));
        day_class.setText(getClassDay(intent.getIntExtra("course_day", 200)));
        day_lab.setText(getLabDay(intent.getIntExtra("lab_day", 200)));

    }

    public String getClassTime(int i)
    {
        switch (i){
            case 1: return "8am - 9.20am";
            case 2: return "9.30 am - 10.50 am";
            case 3: return "11am - 12.20pm";
            case 4: return "12.30pm - 1.50pm";
            case 5: return "2 pm - 3.20 pm";
            case 6: return "3.30 pm - 4.50 pm";
            case 7: return "5 pm - 6.20 pm";
        }

        return null;
    }

    public String getLabTime(int i)
    {
        switch (i){
            case 0: return "N/A";
            case 1: return "8 am - 10.50 am";
            case 2: return "11am - 1.50pm";
            case 3: return "2 pm - 4.50 pm";
        }

        return null;
    }

    public String getClassDay(int i)
    {
        switch(i){
            case 1: return "Sun/Tue";
            case 2: return "Mon/Wed";
        }

        return null;
    }

    public String getLabDay(int i)
    {
        switch (i){
            case 0: return "N/A";
            case 1: return "Sun";
            case 2: return "Mon";
            case 3: return "Tue";
            case 4: return "Wed";
            case 5: return "Thr";
        }

        return null;
    }

    public void edit(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Intent intent = getIntent();
        int pos = intent.getIntExtra("list_pos", 200);

        if(pos == R.id.course1)
        {
            editor.putString("course1", null);
            editor.putInt("class1", 200);
            editor.putInt("lab1", 200);
            editor.putInt("corday1", 200);
            editor.putInt("labday1", 200);
            editor.commit();

            intent = new Intent(this, AddCourseActivity.class);
            intent.putExtra("list_pos", pos);
            startActivity(intent);
            finish();
        }

        else if(pos == R.id.course2)
        {
            editor.putString("course2", null);
            editor.putInt("class2", 200);
            editor.putInt("lab2", 200);
            editor.putInt("corday2", 200);
            editor.putInt("labday2", 200);
            editor.commit();

            intent = new Intent(this, AddCourseActivity.class);
            intent.putExtra("list_pos", pos);
            startActivity(intent);
            finish();
        }

        if(pos == R.id.course3)
        {
            editor.putString("course3", null);
            editor.putInt("class3", 200);
            editor.putInt("lab3", 200);
            editor.putInt("corday3", 200);
            editor.putInt("labday3", 200);
            editor.commit();

            intent = new Intent(this, AddCourseActivity.class);
            intent.putExtra("list_pos", pos);
            startActivity(intent);
            finish();
        }

        if(pos == R.id.course4)
        {
            editor.putString("course4", null);
            editor.putInt("class4", 200);
            editor.putInt("lab4", 200);
            editor.putInt("corday4", 200);
            editor.putInt("labday4", 200);
            editor.commit();

            intent = new Intent(this, AddCourseActivity.class);
            intent.putExtra("list_pos", pos);
            startActivity(intent);
            finish();
        }

        else
        {
            editor.putString("course5", null);
            editor.putInt("class5", 200);
            editor.putInt("lab5", 200);
            editor.putInt("corday5", 200);
            editor.putInt("labday5", 200);
            editor.commit();

            intent = new Intent(this, AddCourseActivity.class);
            intent.putExtra("list_pos", pos);
            startActivity(intent);
            finish();
        }

    }

    public void remove(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Intent intent = getIntent();
        int pos = intent.getIntExtra("list_pos", 200);

        if(pos == R.id.course1)
        {
            editor.putString("course1", "ADD A COURSE");
            editor.putInt("class1", 200);
            editor.putInt("lab1", 200);
            editor.putInt("corday1", 200);
            editor.putInt("labday1", 200);
            editor.commit();

            intent = new Intent(this, CourseListActivity.class);
            startActivity(intent);
            finish();
        }

        else if(pos == R.id.course2)
        {
            editor.putString("course2", "ADD A COURSE");
            editor.putInt("class2", 200);
            editor.putInt("lab2", 200);
            editor.putInt("corday2", 200);
            editor.putInt("labday2", 200);
            editor.commit();

            intent = new Intent(this, CourseListActivity.class);
            startActivity(intent);
            finish();
        }

        if(pos == R.id.course3)
        {
            editor.putString("course3", "ADD A COURSE");
            editor.putInt("class3", 200);
            editor.putInt("lab3", 200);
            editor.putInt("corday3", 200);
            editor.putInt("labday3", 200);
            editor.commit();

            intent = new Intent(this, CourseListActivity.class);
            startActivity(intent);
            finish();
        }

        if(pos == R.id.course4)
        {
            editor.putString("course4", "ADD A COURSE");
            editor.putInt("class4", 200);
            editor.putInt("lab4", 200);
            editor.putInt("corday4", 200);
            editor.putInt("labday4", 200);
            editor.commit();

            intent = new Intent(this, CourseListActivity.class);
            startActivity(intent);
            finish();
        }

        else
        {
            editor.putString("course5", "ADD A COURSE");
            editor.putInt("class5", 200);
            editor.putInt("lab5", 200);
            editor.putInt("corday5", 200);
            editor.putInt("labday5", 200);
            editor.commit();

            intent = new Intent(this, CourseListActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
