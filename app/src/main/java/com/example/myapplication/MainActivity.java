package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buton_click;
    private TextView tvtext;
    private TextView answertext;
    private EditText cintext;
    private int D;
    private int a;
    private int b;
    private int c;
    private double x1;
    private double x2;
    private String aa = "";
    private String bb = "";
    private char[] ss;
    private String cc = "";
    private int index2;
    private int index3;
    private String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("","Hello");
        buton_click = findViewById(R.id.button);
        tvtext = findViewById(R.id.textView);
        answertext = findViewById(R.id.textView2);
        cintext = findViewById(R.id.editText);
        buton_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = String.valueOf(cintext.getText());
                index2 = 0 ; index3 = 0;
                for (int i = 0;i < s.length();i++){
                    if (s.charAt(i) != ' ' && s.charAt(i) != '-'){
                        aa += s.charAt(i);
                    }if (s.charAt(i) == ' '){
                        index2 = i;
                        break;
                    }
                }
                for (int i = index2 + 1;i < s.length();i++){
                    if (s.charAt(i) != ' '&& s.charAt(i) != '-'){
                        bb += s.charAt(i);
                    }if (s.charAt(i) == ' '){
                        index3 = i;
                        break;
                    }
                }
                for (int i = index3 + 1;i < s.length();i++){
                    if (s.charAt(i) != ' '&& s.charAt(i) != '-'){
                        cc += s.charAt(i);
                    }

                }


                a = Integer.parseInt(aa);
                if (s.charAt(0) == '-'){
                    a *= -1;
                }
                b = Integer.parseInt(bb);
                if (s.charAt(index2 + 1) == '-'){
                    b *= -1;
                }
                c = Integer.parseInt(cc);
                if (s.charAt(index3 + 1) == '-'){
                    c *= -1;
                }
                D = (b * b) - (4 * a * c);
                if (D >= 0) {
                    x1 = ((-1) * b + Math.sqrt(D)) / (2 * a);
                    x2 = ((-1) * b - Math.sqrt(D)) / (2 * a);
                    answertext.setText("x1 = " + String.valueOf(x1) + '\n' +"x2 = " +  String.valueOf(x2));
                }else{
                    answertext.setText("Нет корней");
                }









            }
        });
    }

}