package com.example.ruetian.Routine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.ruetian.R;
import com.example.ruetian.emmergency;
import com.example.ruetian.info;
import com.example.ruetian.routine;
import com.github.barteksc.pdfviewer.PDFView;

public class iperoutine extends AppCompatActivity {
    Button a,b,c,d,e;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iperoutine);

        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        e=findViewById(R.id.e);
        pdfView=findViewById(R.id.routinepdf);
        pdfView.fromAsset("archi.pdf").pages(0).load();
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("archi.pdf").pages(0).load();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("archi.pdf").pages(1).load();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("archi.pdf").pages(2).load();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("archi.pdf").pages(3).load();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfView.fromAsset("archi.pdf").pages(4).load();
            }
        });
    }
}
