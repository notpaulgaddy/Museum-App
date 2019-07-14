package com.example.student.virtualmuseum;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void
    openGenresActivity(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
