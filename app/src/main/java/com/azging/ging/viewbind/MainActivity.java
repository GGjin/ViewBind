package com.azging.ging.viewbind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.azging.ging.viewbind.ioc.ViewBind;

public class MainActivity extends AppCompatActivity {

    /****Hello World!****/
    @ViewBind(R.id.text) private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
