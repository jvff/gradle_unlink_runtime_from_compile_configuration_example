package com.janitovff.test.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.janitovff.test.lib.TestLibWrapper;

public class MainActivity extends Activity {
    private TestLibWrapper lib;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        lib = new TestLibWrapper();

        output = (TextView)findViewById(R.id.output);

        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(lib.methodA());
            }
        });

        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(lib.methodB());
            }
        });
    }
}
