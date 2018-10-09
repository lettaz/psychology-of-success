package com.example.android.psychologyofsuccess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void openZero(View view) { Intent b = new Intent(this,Acknowledgement.class);
        startActivity(b);
    }

    public void openOne(View view) {Intent c = new Intent(this,introduction.class);
        startActivity(c);
    }

    public void openTwo(View view) {
        Intent e = new Intent(this,thinking.class);
        startActivity(e);
    }

    public void openThree(View view) {
        Intent e = new Intent(this,development.class);
        startActivity(e);
    }

    public void openFour(View view) {
        Intent e = new Intent(this,gap.class);
        startActivity(e);
    }

    public void openFive(View view) {
        Intent e = new Intent(this,priority.class);
        startActivity(e);
    }

    public void openSix(View view) {
        Intent e = new Intent(this,lad.class);
        startActivity(e);
    }

    public void openSeven(View view) {Intent f = new Intent(this,success.class);
        startActivity(f);
    }

    public void openEight(View view) {Intent e = new Intent(this,professionalism.class);
        startActivity(e);
    }

    public void openNine(View view) {
        Intent e = new Intent(this,social.class);
        startActivity(e);
    }
}
