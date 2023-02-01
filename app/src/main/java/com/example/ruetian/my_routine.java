package com.example.ruetian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.ruetian.Routine.cseroutine;
import com.example.ruetian.Routine.eeeroutine;

public class my_routine extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_routine);
        SharedPreferences dept=getSharedPreferences("dept",MODE_PRIVATE);
        String dep=dept.getString("mydept","");
       if(dep.equals("eee"))
       {
           startActivity(new Intent(my_routine.this, eeeroutine.class));
       }
        if(dep.equals("cse"))
        {
            startActivity(new Intent(my_routine.this, cseroutine.class));
        }
        if(dep.equals("ece"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.eceroutine.class));
        }
        if(dep.equals("ete"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.eteroutine.class));
        }
        if(dep.equals("civil"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.civilroutine.class));
        }
        if(dep.equals("urp"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.urproutine.class));
        }
        if(dep.equals("becm"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.becmroutine.class));
        }
        if(dep.equals("archi"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.archiroutine.class));
        }
        if(dep.equals("me"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.meroutine.class));
        }
        if(dep.equals("gce"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.gceroutine.class));
        }
        if(dep.equals("cfpe"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.cfperoutine.class));
        }
        if(dep.equals("mse"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.mseroutine.class));
        }
        if(dep.equals("mte"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.mteroutine.class));
        }
        if(dep.equals("ipe"))
        {
            startActivity(new Intent(my_routine.this, com.example.ruetian.Routine.iperoutine.class));
        }

    }
    @Override
    public void onBackPressed()
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
