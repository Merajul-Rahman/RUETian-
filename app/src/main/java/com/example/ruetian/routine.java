package com.example.ruetian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class routine extends AppCompatActivity {
    private Button civil,eee,cse,me,ece,ete,urp,becm,archi,ipe,cfpe,gce,mse,mte;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
        cse=findViewById(R.id.cse);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        civil=(Button)findViewById(R.id.civil);
        eee=(Button)findViewById(R.id.eee);
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
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.civilroutine.class);
                startActivity(intent);
            }
        });
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.cseroutine.class);
                intent.putExtra("s","2");
                startActivity(intent);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.eeeroutine.class);
                startActivity(intent);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.meroutine.class);
                startActivity(intent);
            }
        });
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.eceroutine.class);
                startActivity(intent);
            }
        });
        ete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.eteroutine.class);
                startActivity(intent);
            }
        });
        urp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.urproutine.class);
                startActivity(intent);
            }
        });
        archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.archiroutine.class);
                startActivity(intent);
            }
        });
        becm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.becmroutine.class);
                startActivity(intent);
            }
        });
        ipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.iperoutine.class);
                startActivity(intent);
            }
        });
        cfpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.cfperoutine.class);
                startActivity(intent);
            }
        });
        gce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.gceroutine.class);
                startActivity(intent);
            }
        });
        mse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.mseroutine.class);
                startActivity(intent);
            }
        });
        mte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(routine.this, com.example.ruetian.Routine.mteroutine.class);
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
