package com.example.android.psychologyofsuccess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openPos(View view) {
        Intent a = new Intent(this, Main5Activity.class);
        startActivity(a);
    }

    public void openStories(View view) {
        Intent b = new Intent(this, Main6Activity.class);
        startActivity(b);
    }

    public void OpenQuotes(View view) {
        Intent f = new Intent(this, Main3Activity.class);
        startActivity(f);
    }

    public void OpenAbout(View view) {
        Intent a = new Intent(this, Main4Activity.class);
        startActivity(a);
    }
}
