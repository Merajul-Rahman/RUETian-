package com.example.ruetian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class my_syllabus extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_syllabus);
        SharedPreferences dept=getSharedPreferences("depts",MODE_PRIVATE);
        String dep=dept.getString("mydepts","");
        if(dep.equals("eee"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.eee.class));
        }
        if(dep.equals("cse"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.cse.class));
        }
        if(dep.equals("ece"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.ece.class));
        }
        if(dep.equals("ete"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.ete.class));
        }
        if(dep.equals("civil"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.civil.class));
        }
        if(dep.equals("urp"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.urp.class));
        }
        if(dep.equals("becm"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.becm.class));
        }
        if(dep.equals("archi"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.archi.class));
        }
        if(dep.equals("me"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.me.class));
        }
        if(dep.equals("gce"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.gce.class));
        }
        if(dep.equals("cfpe"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.cfpe.class));
        }
        if(dep.equals("mse"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.mse.class));
        }
        if(dep.equals("mte"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.mte.class));
        }
        if(dep.equals("ipe"))
        {
            startActivity(new Intent(my_syllabus.this, com.example.ruetian.Syllabus.ipe.class));
        }

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
