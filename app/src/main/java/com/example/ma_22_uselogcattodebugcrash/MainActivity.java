package com.example.ma_22_uselogcattodebugcrash;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    /***
     * This app will crash on startup with no hint as to why
     * Unless you look at logcat.  It tells you exactly why
     * USE LOGCAT
     */
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b.setText("new text");
    }
}




//solution, right after setContentView in on create
//lots of problems
//first the XML is a textview not a button, change b to TextView above
//second the tv has no id so you cannot get a ref to it
//       add android:id="@+id/tv1" to layout file
//third: get a ref to tv1
//b=findViewById(R.id.tv1);
