package com.mohammadDarwish.taskmaster.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mohammadDarwish.taskmaster.R;

public class MainActivity extends AppCompatActivity {

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

    }


}