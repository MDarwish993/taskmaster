package com.mohammadDarwish.taskmaster.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mohammadDarwish.taskmaster.R;

public class DetailPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        Intent callingIntent=getIntent();
        String taskTitle=null;

        if(callingIntent!=null){
            taskTitle=callingIntent.getStringExtra(MainActivity.TASK_TITLE_TAG);
        }

        TextView taskTitleTextView=(TextView) findViewById(R.id.taskTitleTextView);

        if (taskTitle!=null){
            taskTitleTextView.setText(taskTitle);
        }else {
            taskTitleTextView.setText("no title for this task!!!");
        }
    }
}