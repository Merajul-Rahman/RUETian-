package com.example.ruetian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class emmergency extends AppCompatActivity {
Button call1,call2,call3,call4,call5,call6,call8,call9,call10;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emmergency);
        call1=findViewById(R.id.call1);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("01713228547");
            }
        });
        call2=findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("01713228547");
            }
        });
        call3=findViewById(R.id.call3);
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("01970030004");
            }
        });
        call4=findViewById(R.id.call4);
        call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("+8807217507423");
            }
        });
        call5=findViewById(R.id.call5);
        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("01713228545");
            }
        });
        call6=findViewById(R.id.call6);
        call6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("8807217507423");
            }
        });
    }
    private void dial(final String phone)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone,null));
        startActivity(intent);
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
