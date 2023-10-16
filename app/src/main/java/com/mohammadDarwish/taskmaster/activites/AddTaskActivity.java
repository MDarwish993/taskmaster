package com.mohammadDarwish.taskmaster.activites;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mohammadDarwish.taskmaster.R;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Toast toast=Toast.makeText(this,"submitted!",Toast.LENGTH_SHORT);
        Button addTaskSubmitButton=(Button) findViewById(R.id.AddTaskSubmitButton);
        addTaskSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toast.show();
            }
        });
    }
}