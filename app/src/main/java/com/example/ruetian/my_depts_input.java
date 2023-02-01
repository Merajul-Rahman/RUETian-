package com.example.ruetian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class my_depts_input extends AppCompatActivity {
    private Button submit;
    private EditText dept;
    String dep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_depts_input);
        submit=findViewById(R.id.submit);
        dept=findViewById(R.id.dept);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dep=dept.getText().toString();
                SharedPreferences prefs=getSharedPreferences("prefs",MODE_PRIVATE);
                SharedPreferences.Editor editor=prefs.edit();
                editor.putBoolean("first",false);
                editor.apply();
                SharedPreferences dept=getSharedPreferences("dept",MODE_PRIVATE);
                SharedPreferences.Editor editor1=dept.edit();
                editor1.putString("mydepts",dep);
                editor1.commit();
                startActivity(new Intent(my_depts_input.this,my_syllabus.class));
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
