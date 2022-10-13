package com.ibo.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    CheckBox checkjava,checkpython,checkruby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        checkjava=findViewById(R.id.JavaBox);
        checkpython=findViewById(R.id.PythonBox);
        checkruby=findViewById(R.id.RubyBox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
                if(checkjava.isChecked()){
                    stringBuilder.append(checkjava.getText().toString() +"\n" );
                }
                if(checkpython.isChecked()){
                    stringBuilder.append(checkpython.getText().toString() +"\n" );
                }
                if(checkruby.isChecked()){
                    stringBuilder.append(checkruby.getText().toString() +"\n" );
                }
                textView.setText(stringBuilder);
            }
        });
    }
}