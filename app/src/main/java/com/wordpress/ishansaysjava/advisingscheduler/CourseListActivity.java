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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CourseListActivity extends Activity {

    Button course1 ;
    Button course2 ;
    Button course3 ;
    Button course4 ;
    Button course5 ;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        course1 = (Button) findViewById(R.id.course1);
        course2 = (Button) findViewById(R.id.course2);
        course3 = (Button) findViewById(R.id.course3);
        course4 = (Button) findViewById(R.id.course4);
        course5 = (Button) findViewById(R.id.course5);

        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);

        course1.setText(sharedPreferences.getString("course1", "ADD A COURSE"));
        course2.setText(sharedPreferences.getString("course2", "ADD A COURSE"));
        course3.setText(sharedPreferences.getString("course3", "ADD A COURSE"));
        course4.setText(sharedPreferences.getString("course4", "ADD A COURSE"));
        course5.setText(sharedPreferences.getString("course5", "ADD A COURSE"));
    }

    public void addCourse (View view)
    {
        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        Spinner class_time = (Spinner) findViewById(R.id.class_time);
        Spinner lab_time = (Spinner) findViewById(R.id.lab_time);

        if(view.getId() == R.id.course1)
        {
            if(course1.getText().toString().equals("ADD A COURSE"))
            {
                Intent intent = new Intent(this, AddCourseActivity.class);
                intent.putExtra("list_pos", R.id.course1);
                startActivity(intent);
                finish();
            }

            else
            {
                Intent intent = new Intent(this, CourseActivity.class);
                intent.putExtra("class_time", sharedPreferences.getInt("class1", 200));
                intent.putExtra("lab_time", sharedPreferences.getInt("lab1", 200));
                intent.putExtra("course_day", sharedPreferences.getInt("corday1", 200));
                intent.putExtra("lab_day", sharedPreferences.getInt("labday1", 200));
                intent.putExtra("list_pos", R.id.course1);
                startActivity(intent);

            }
        }

        else if(view.getId() == R.id.course2)
        {
            if(course2.getText().toString().equals("ADD A COURSE"))
            {
                Intent intent = new Intent(this, AddCourseActivity.class);
                intent.putExtra("list_pos", R.id.course2);
                startActivity(intent);
                finish();
            }

            else
            {
                Intent intent = new Intent(this, CourseActivity.class);
                intent.putExtra("class_time", sharedPreferences.getInt("class2", 200));
                intent.putExtra("lab_time", sharedPreferences.getInt("lab2", 200));
                intent.putExtra("course_day", sharedPreferences.getInt("corday2", 200));
                intent.putExtra("lab_day", sharedPreferences.getInt("labday2", 200));
                intent.putExtra("list_pos", R.id.course2);
                startActivity(intent);
            }
        }

       else if(view.getId() == R.id.course3)
        {
            if(course3.getText().toString().equals("ADD A COURSE"))
            {
                Intent intent = new Intent(this, AddCourseActivity.class);
                intent.putExtra("list_pos", R.id.course3);
                startActivity(intent);
                finish();
            }

            else
            {
                Intent intent = new Intent(this, CourseActivity.class);
                intent.putExtra("class_time", sharedPreferences.getInt("class3", 200));
                intent.putExtra("lab_time", sharedPreferences.getInt("lab3", 200));
                intent.putExtra("course_day", sharedPreferences.getInt("corday3", 200));
                intent.putExtra("lab_day", sharedPreferences.getInt("labday3", 200));
                intent.putExtra("list_pos", R.id.course3);
                startActivity(intent);
            }
        }

       else if(view.getId() == R.id.course4)
        {
            if(course4.getText().toString().equals("ADD A COURSE"))
            {
                Intent intent = new Intent(this, AddCourseActivity.class);
                intent.putExtra("list_pos", R.id.course4);
                startActivity(intent);
                finish();
            }

            else
            {
                Intent intent = new Intent(this, CourseActivity.class);
                intent.putExtra("class_time", sharedPreferences.getInt("class4", 200));
                intent.putExtra("lab_time", sharedPreferences.getInt("lab4", 200));
                intent.putExtra("course_day", sharedPreferences.getInt("corday4", 200));
                intent.putExtra("lab_day", sharedPreferences.getInt("labday4", 200));
                intent.putExtra("list_pos", R.id.course4);
                startActivity(intent);
            }
        }

        else
        {
            if(course5.getText().toString().equals("ADD A COURSE"))
            {
                Intent intent = new Intent(this, AddCourseActivity.class);
                intent.putExtra("list_pos", R.id.course5);
                startActivity(intent);
                finish();
            }

            else
            {
                Intent intent = new Intent(this, CourseActivity.class);
                intent.putExtra("class_time", sharedPreferences.getInt("class5", 200));
                intent.putExtra("lab_time", sharedPreferences.getInt("lab5", 200));
                intent.putExtra("course_day", sharedPreferences.getInt("corday5", 200));
                intent.putExtra("lab_day", sharedPreferences.getInt("labday5", 200));
                intent.putExtra("list_pos", R.id.course5);
                startActivity(intent);
            }
        }
    }

    public void checkClash(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        float[] class_time = {sharedPreferences.getInt("class1", 200), sharedPreferences.getInt("class2", 200),sharedPreferences.getInt("class3", 200),
                sharedPreferences.getInt("class4", 200),sharedPreferences.getInt("class5", 200)};

        Log.i("ishanvai", Float.toString(class_time[0]));

        float[] lab_time = {sharedPreferences.getInt("lab1", 200), sharedPreferences.getInt("lab2", 200),sharedPreferences.getInt("lab3", 200),
                sharedPreferences.getInt("lab4", 200), sharedPreferences.getInt("lab5", 200)};

        float[] class_day = {sharedPreferences.getInt("corday1", 200), sharedPreferences.getInt("corday2", 200),sharedPreferences.getInt("corday3", 200),
                sharedPreferences.getInt("corday4", 200), sharedPreferences.getInt("corday5", 200)};

        float[] lab_day = {sharedPreferences.getInt("labday1", 200), sharedPreferences.getInt("labday2", 200),sharedPreferences.getInt("labday3", 200),
                sharedPreferences.getInt("labday4", 200), sharedPreferences.getInt("labday5", 200)};

        String[] course_name = {sharedPreferences.getString("course1", "Error"), sharedPreferences.getString("course2", "Error"),sharedPreferences.getString("course3", "Error"),
                sharedPreferences.getString("course4", "Error"),sharedPreferences.getString("course5", "Error")};

        boolean clash = false;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(j != i)
                {
                    if (class_time[i] == class_time[j] && class_time[i] != 200.0 && class_day[i] == class_day[j]) {
                        clash = true;
                        String text = "There is a clash between " + course_name[i] + " and " + course_name[j];
                        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
                        toast.show();
                        break;
                    }

                    else if(lab_time[i] != 0.0 || lab_time[j] != 0.0) {
                        Log.i("hurrah", "dhukse");
                        if (Math.ceil(class_time[i] / 2.0) == lab_time[j] && class_time[i] != 200.0 && (Math.ceil(lab_day[j]/2.0) == class_day[i])) {
                            Log.i("ishanerclass", Float.toString(class_time[i]));
                            Log.i("ishanerclass2", Float.toString(lab_time[j]));
                            clash = true;
                            String text = "There is a clash between " + course_name[i] + " class time and " + course_name[j] + " lab.";
                            Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
                            toast.show();
                            break;
                        }

                        else if (Math.ceil(class_time[j] / 2.0) == lab_time[i] && class_time[j] != 200.0 && (Math.ceil(lab_day[i]/2.0) == class_day[j])){
                            clash = true;
                            String text = "There is a clash between " + course_name[j] + " class time and " + course_name[i] + " lab.";
                            Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
                            toast.show();
                            break;
                        }

                        else if (lab_time[i] == lab_time[j] && lab_time[i] != 200 && lab_time[i] != 0 && lab_day[i] == lab_day[j]) {
                            clash = true;
                            String text = "There is a clash between " + course_name[i] + " lab and " + course_name[j] + " lab.";
                            Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
                            toast.show();
                            break;
                        }
                    }
                }
            }

            if(clash) break;
        }

        if(clash == false)
        {
            Toast toast = Toast.makeText(this, "No clash!!! Cheers!!!", Toast.LENGTH_LONG);
            toast.show();
        }
    }


}
