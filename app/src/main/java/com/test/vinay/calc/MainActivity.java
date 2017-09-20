package com.test.vinay.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressWarnings({"ALL", "WeakerAccess"})
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText ed1;
    private EditText ed2;
    @SuppressWarnings("WeakerAccess")
    Button btadd;
    @SuppressWarnings("WeakerAccess")
    Button btsub;
    @SuppressWarnings("WeakerAccess")
    Button btdiv;
    Button btmul;

    @SuppressWarnings("WeakerAccess")
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.et1);
        ed2=(EditText) findViewById(R.id.et2);

        btadd=(Button) findViewById(R.id.b1);
        btsub= (Button) findViewById(R.id.b2);
        btdiv= (Button) findViewById(R.id.b3);
        btmul= (Button) findViewById(R.id.b4);

        tv2= (TextView) findViewById(R.id.tv2);

        btadd.setOnClickListener(this);
        btsub.setOnClickListener(this);
        btdiv.setOnClickListener(this);
        btmul.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    int f1,f2,f3;

        switch (v.getId())
        {

            case R.id.b1: f1=Integer.parseInt(ed1.getText().toString());
                f2=Integer.parseInt(ed2.getText().toString());
                f3=f1+f2;
                tv2.setText(String.valueOf(f3));
                break;
            case R.id.b2: f1=Integer.parseInt(ed1.getText().toString());
                f2=Integer.parseInt(ed2.getText().toString());
                f3=f1-f2;
                tv2.setText(String.valueOf(f3));
                break;
            case R.id.b3: f1=Integer.parseInt(ed1.getText().toString());
                f2=Integer.parseInt(ed2.getText().toString());
                f3=f1/f2;
                tv2.setText(String.valueOf(f3));
                break;
            case R.id.b4: f1=Integer.parseInt(ed1.getText().toString());
                f2=Integer.parseInt(ed2.getText().toString());
                f3=f1*f2;
                tv2.setText(String.valueOf(f3));
                break;
            default:break;
        }




    }

}
