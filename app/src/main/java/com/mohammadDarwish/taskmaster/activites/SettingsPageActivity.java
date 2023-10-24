package com.mohammadDarwish.taskmaster.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.mohammadDarwish.taskmaster.R;

public class SettingsPageActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    public static final String USERNAME_TAG="userName";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        Button saveButton=findViewById(R.id.usernameSaveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor preferenceEditor=sharedPreferences.edit();
                EditText userNameEditText=(EditText) findViewById(R.id.usernameEditText);
                String usernameString=userNameEditText.getText().toString();

                preferenceEditor.putString(USERNAME_TAG,usernameString);
                preferenceEditor.apply();

                Snackbar.make(findViewById(R.id.settingActivity),"Setting Saved",Snackbar.LENGTH_SHORT).show();

            }
        });
    }
}