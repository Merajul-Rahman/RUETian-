package com.example.ruetian;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.ruetian.Syllabus.archi;
import com.github.barteksc.pdfviewer.PDFView;

public class info extends AppCompatActivity {
    PDFView info;
    Spinner infoselect;
    Button infobutton;
    String check;
    Toolbar toolbar;
    int[] colours={Color.parseColor("#04c5fd"),Color.parseColor("#a9e9fb")};
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,colours);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(info.this, R.array.info, android.R.layout.simple_spinner_item);
        gd.setCornerRadius(0f);
        info=findViewById(R.id.infoview);
        infoselect=findViewById(R.id.infoselect);
        infobutton=findViewById(R.id.infobutton);
        infoselect.setAdapter(adapter);
        infoselect.setBackground(gd);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        info.fromAsset("info1.pdf").load();
        infobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check=infoselect.getSelectedItem().toString();
                if(check.equals("General Information"))
                {
                    info.fromAsset("info1.pdf").load();
                }
                if(check.equals("History"))
                {
                    info.fromAsset("History.pdf").load();
                }
                if(check.equals("Faculties"))
                {
                    info.fromAsset("Faculties.pdf").load();
                }
                if(check.equals("Student"))
                {
                    info.fromAsset("Student.pdf").load();
                }
                if(check.equals("Laboratory"))
                {
                    info.fromAsset("Laboratories.pdf").load();
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
