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
import android.widget.Button;

public class syllabus extends AppCompatActivity {
    private Button civil,eee,cse,me,ece,ete,urp,becm,archi,ipe,cfpe,gce,mse,mte;
    Toolbar toolbar;
    int[] colours={Color.parseColor("#04c5fd"),Color.parseColor("#a9e9fb")};
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        civil=(Button)findViewById(R.id.civil);
        eee=(Button)findViewById(R.id.eee);
        cse=(Button)findViewById(R.id.cse);
        me=(Button)findViewById(R.id.me);
        ece=(Button)findViewById(R.id.ece);
        ete=(Button)findViewById(R.id.ete);
        urp=(Button)findViewById(R.id.urp);
        becm=(Button)findViewById(R.id.becm);
        archi=(Button)findViewById(R.id.archi);
        ipe=(Button)findViewById(R.id.ipe);
        cfpe=(Button)findViewById(R.id.cfpe);
        gce=(Button)findViewById(R.id.gce);
        mse=(Button)findViewById(R.id.mse);
        mte=(Button)findViewById(R.id.mte);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,colours);
        gd.setCornerRadius(0f);
        civil.setBackground(gd);
        cse.setBackground(gd);
        eee.setBackground(gd);
        ece.setBackground(gd);
        ete.setBackground(gd);
        becm.setBackground(gd);
urp.setBackground(gd);
archi.setBackground(gd);
gce.setBackground(gd);
ipe.setBackground(gd);
me.setBackground(gd);
cfpe.setBackground(gd);
mse.setBackground(gd);
mte.setBackground(gd);

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.civil.class);
                startActivity(intent);
            }
        });
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.cse.class);
                intent.putExtra("s","2");
                startActivity(intent);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.eee.class);
                startActivity(intent);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.me.class);
                startActivity(intent);
            }
        });
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.ece.class);
                startActivity(intent);
            }
        });
        ete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.ete.class);
                startActivity(intent);
            }
        });
        urp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.urp.class);
                startActivity(intent);
            }
        });
        archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.archi.class);
                startActivity(intent);
            }
        });
        becm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.becm.class);
                startActivity(intent);
            }
        });
        ipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.ipe.class);
                startActivity(intent);
            }
        });
        cfpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.cfpe.class);
                startActivity(intent);
            }
        });
        gce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.gce.class);
                startActivity(intent);
            }
        });
        mse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.mse.class);
                startActivity(intent);
            }
        });
        mte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(syllabus.this, com.example.ruetian.Syllabus.mte.class);
                startActivity(intent);
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
