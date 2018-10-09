package com.example.android.psychologyofsuccess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void openPquotes(View view) { Intent b = new Intent(this, Main7Activity.class);
        startActivity(b);
    }

    public void openMquotes(View view) { Intent b = new Intent(this, motivational.class);
        startActivity(b);
    }

    public void openKquotes(View view) {Intent b = new Intent(this, knowledge.class);
        startActivity(b);
    }

    public void openBquotes(View view) { Intent b = new Intent(this, business.class);
        startActivity(b);
    }

    public void openEquotes(View view) { Intent b = new Intent(this, experience.class);
        startActivity(b);
    }
}
