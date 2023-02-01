package com.example.ruetian;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button info;
    private Button routine;
    private Button syllabus;
    private Button emergency;
    private Button about;
    private Button myroutine;
    private Button mysyllabus;
    LinearLayout layout;
    Toolbar toolbar;
    int[] colours={Color.parseColor("#04c5fd"),Color.parseColor("#a9e9fb")};
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=(LinearLayout) findViewById(R.id.home);
        info=(Button) findViewById(R.id.info);
        routine=(Button)findViewById(R.id.routine);
        syllabus=(Button)findViewById(R.id.syllabus);
        emergency=(Button)findViewById(R.id.emmergency);
        about=(Button)findViewById(R.id.about);
        myroutine=findViewById(R.id.myroutine);
        mysyllabus=findViewById(R.id.mysyllabus);
        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP,colours);
        gd.setCornerRadius(0f);
        layout.setBackground(gd);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences prefs=getSharedPreferences("prefs",MODE_PRIVATE);
        final boolean first=prefs.getBoolean("first",true);
        SharedPreferences prefss=getSharedPreferences("prefss",MODE_PRIVATE);
        final boolean firsts=prefss.getBoolean("firsts",true);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,info.class);
                startActivity(intent);
            }
        });
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,syllabus.class);
                startActivity(intent);
            }
        });
        routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,routine.class);
                startActivity(intent);
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,emmergency.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,about.class);
                startActivity(intent);
            }
        });
        myroutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first)
                {
                    startActivity(new Intent(MainActivity.this,my_dept_input.class));
                    SharedPreferences prefs=getSharedPreferences("prefs",MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefs.edit();
                    editor.putBoolean("first",false);
                    editor.apply();
                }

              if(!first)
                {
                    startActivity(new Intent(MainActivity.this,my_routine.class));
                }
            }
        });
        mysyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firsts)
                {
                    startActivity(new Intent(MainActivity.this,my_depts_input.class));
                    SharedPreferences prefs=getSharedPreferences("prefss",MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefs.edit();
                    editor.putBoolean("firsts",false);
                    editor.apply();
                }

                if(!firsts)
                {
                    startActivity(new Intent(MainActivity.this,my_syllabus.class));
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.night:
                getApplication().setTheme(R.style.Theme_AppCompat_NoActionBar);
                return true;
            case R.id.infor:
                startActivity(new Intent(this, info.class));
                return true;
            case R.id.syllabus:
                startActivity(new Intent(this, syllabus.class));
                return true;
            case R.id.routine:
                startActivity(new Intent(this, routine.class));
                return true;
            case R.id.about:
                startActivity(new Intent(this, about.class));
                return true;
            case R.id.settings:
                startActivity(new Intent(this, settings.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
