package com.mohammadDarwish.taskmaster.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mohammadDarwish.taskmaster.R;

public class MainActivity extends AppCompatActivity {

    public  static final String TASK_TITLE_TAG="taskTitle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton=(Button) findViewById(R.id.AddTaskButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAddTaskActivity=new Intent(MainActivity.this,AddTaskActivity.class);
                startActivity(goToAddTaskActivity);
            }
        });

        Button allButton=(Button) findViewById(R.id.AllTasksButton);
        allButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAllTasksActivity=new Intent(MainActivity.this,AllTasksActivity.class);
                startActivity(goToAllTasksActivity);
            }
        });

        Intent toSettingPageActivity = new Intent(this, SettingsPageActivity.class);
        findViewById(R.id.toSettingImageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(toSettingPageActivity);
            }
        });

        setUpTask1Button();
        setUpTask2Button();
        setUpTask3Button();



    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        String userName=preferences.getString(SettingsPageActivity.USERNAME_TAG,"no username");
        ((TextView)findViewById(R.id.usernameTasksTextView)).setText(getString(R.string.tasks_Owner, userName));

    }

    private void setUpTask1Button(){
        Button taskButton=(Button) findViewById(R.id.task1Button);
        taskButton.setOnClickListener(V ->{
            String taskTitle=((Button)findViewById(R.id.task1Button)).getText().toString();
            Intent goToTask1Intent=new Intent(MainActivity.this,DetailPageActivity.class);
            goToTask1Intent.putExtra(TASK_TITLE_TAG,taskTitle);
            startActivity(goToTask1Intent);
        });
    }

    private void setUpTask2Button(){
        Button taskButton=(Button) findViewById(R.id.task2Button);
        taskButton.setOnClickListener(V ->{
            String taskTitle=((Button)findViewById(R.id.task2Button)).getText().toString();
            Intent goToTask1Intent=new Intent(MainActivity.this,DetailPageActivity.class);
            goToTask1Intent.putExtra(TASK_TITLE_TAG,taskTitle);
            startActivity(goToTask1Intent);
        });
    }

    private void setUpTask3Button(){
        Button taskButton=(Button) findViewById(R.id.task3Button);
        taskButton.setOnClickListener(V ->{
            String taskTitle=((Button)findViewById(R.id.task3Button)).getText().toString();
            Intent goToTask1Intent=new Intent(MainActivity.this,DetailPageActivity.class);
            goToTask1Intent.putExtra(TASK_TITLE_TAG,taskTitle);
            startActivity(goToTask1Intent);
        });
    }



}