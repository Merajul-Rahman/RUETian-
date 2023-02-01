package com.example.ruetian.Syllabus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.ruetian.R;
import com.example.ruetian.about;
import com.example.ruetian.emmergency;
import com.example.ruetian.info;
import com.example.ruetian.routine;
import com.example.ruetian.settings;
import com.example.ruetian.syllabus;
import com.github.barteksc.pdfviewer.PDFView;

public class cfpe extends AppCompatActivity {

    PDFView archi;
    Toolbar toolbar;
    private Button one,two,three,four,five,six,seven,eight;
    PDFView pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfpe);
        toolbar=findViewById(R.id.toolbar);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        setSupportActionBar(toolbar);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(0,1,2).load();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(2,3,4).load();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(4,5,6).load();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(6,7,8).load();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(8,9,10).load();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(10,11,12).load();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(13,14,15).load();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pdf);
                pdf=findViewById(R.id.pdfsyllabus);
                pdf.fromAsset("cfpefull.pdf").pages(15,16,17,18).load();
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
