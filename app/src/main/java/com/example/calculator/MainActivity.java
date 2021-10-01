package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnZero,btnDot,btnClear,btnAdd,btnSub,btnDiv,btnMul,btnEqual;
    TextView enterTextView;
    Float res1,res2;
    boolean Add,Sub,Div,Mul;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterTextView= findViewById(R.id.enterTextView);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnZero=findViewById(R.id.btnZero);
        btnClear=findViewById(R.id.btnClear);
        btnDot=findViewById(R.id.btnDot);
        btnEqual=findViewById(R.id.btnEqual);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(enterTextView.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(enterTextView==null) {
                    enterTextView.setText("");
                }
                else{
                    res1=Float.parseFloat(enterTextView.getText()+"");
                    Add=true;
                    enterTextView.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(enterTextView==null) {
                    enterTextView.setText("");
                }
                else{
                    res1=Float.parseFloat(enterTextView.getText()+"");
                    Sub=true;
                    enterTextView.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(enterTextView==null) {
                    enterTextView.setText("");
                }
                else{
                    res1=Float.parseFloat(enterTextView.getText()+"");
                    Div=true;
                    enterTextView.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(enterTextView==null) {
                    enterTextView.setText("");
                }
                else{
                    res1=Float.parseFloat(enterTextView.getText()+"");
                    Mul=true;
                    enterTextView.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2=Float.parseFloat(enterTextView.getText()+"");

                if(Add==true)
                {
                    enterTextView.setText(res1+res2+"");
                    Add=false;
                }
                if(Mul==true)
                {
                    enterTextView.setText(res1*res2+"");
                    Mul=false;
                }
                if(Div==true)
                {
                    enterTextView.setText(res1/res2+"");
                    Div=false;
                }
                if(Sub==true)
                {
                    enterTextView.setText(res1-res2+"");
                    Sub=false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterTextView.setText(null);
            }
        });


    }


}