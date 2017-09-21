package com.gg.viewbind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.azging.ging.viewbind.R;
import com.gg.viewbind.ioc.OnClick;
import com.gg.viewbind.ioc.ViewBind;

public class MainActivity extends AppCompatActivity {

    /****Hello World!****/
    @ViewBind(R.id.text) private TextView mText;

    /****Hello World!****/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.text)
    private void textClick(TextView text) {
    }
}
