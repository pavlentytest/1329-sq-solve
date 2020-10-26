package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public EditText objectA, objectB, objectC;
    public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solveEq(View v) {
        objectA = findViewById(R.id.objA);
        objectB = findViewById(R.id.objB);
        objectC = findViewById(R.id.objC);
        res = findViewById(R.id.resultT);

        double a = Double.parseDouble(objectA.getText().toString());
        double b = Double.parseDouble(objectB.getText().toString());
        double c = Double.parseDouble(objectC.getText().toString());

        double d = b * b - 4 *a*c;
        Log.d("RRRRR",Double.toString(d));

        DecimalFormat df = new DecimalFormat("###.###");

        if(d == 0) {
            double x = -b/(2*a);
            res.setText("x = "+x);
        } else if(d < 0) {
            res.setText("Нет решений!");
        } else {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            res.setText("x1 = "+df.format(x1) + ";\n x2 = "+df.format(x2));
        }

    }
}