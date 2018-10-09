package com.example.android.psychologyofsuccess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void openPos(View view) { Intent b = new Intent(this,deola.class);
        startActivity(b);
    }
    public void openStories(View view) { Intent a = new Intent(this,linda.class);
        startActivity(a);
    }
    public void openOnce(View view) { Intent c = new Intent(this,fela.class);
        startActivity(c);
    }
    public void openPedro(View view) { Intent d = new Intent(this,pedro.class);
        startActivity(d);
    }
    public void openStella(View view) { Intent d = new Intent(this,stella.class);
        startActivity(d);
    }
    public void openObani(View view) { Intent g = new Intent (this,obani.class);
    startActivity(g);
      }
    public void openJasper(View view) { Intent e = new Intent(this,jasper.class);
        startActivity(e);
    }
    public void openKachi(View view) { Intent f = new Intent(this,kachi.class);
        startActivity(f);
    }
}
