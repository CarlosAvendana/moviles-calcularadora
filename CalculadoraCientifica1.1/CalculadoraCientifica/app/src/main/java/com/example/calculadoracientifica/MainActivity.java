package com.example.calculadoracientifica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Modelo m = new Modelo();
    public TextView result;
    String op;
    String operacion;
    Double op1,op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);
        result= (TextView) findViewById(R.id.result);
        Button button0 = findViewById(R.id.btn0);
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button dot= findViewById(R.id.btn_dot);
        Button slash= findViewById(R.id.slash);
        Button multiply= findViewById(R.id.btn_multiply);
        Button clear= findViewById(R.id.btn_clear);
        Button delete= findViewById(R.id.btn_delete);
        Button add= findViewById(R.id.btn_plus);
        Button less= findViewById(R.id.btn_less);
        Button raiz= findViewById(R.id.btn_sqrt);
        Button percentage= findViewById(R.id.btn_percentage);
        Button equals= findViewById(R.id.btn_equals);
        Button parentesis= findViewById(R.id.btn_parentesis);
        Button sin= findViewById(R.id.btn_sin);
        Button cos= findViewById(R.id.btn_cos);
        Button tan= findViewById(R.id.btn_tan);
        Button csc= findViewById(R.id.btn_csc);
        Button sec= findViewById(R.id.btn_sec);
        Button off= findViewById(R.id.btn_off);
        Button ctg= findViewById(R.id.btn_ctg);
        Button factorial= findViewById(R.id.btn_fact);
        Button exponente= findViewById(R.id.btn_raised);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        dot.setOnClickListener(this);
        slash.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
        add.setOnClickListener(this);
        less.setOnClickListener(this);
        raiz.setOnClickListener(this);
        percentage.setOnClickListener(this);
        equals.setOnClickListener(this);
        parentesis.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        csc.setOnClickListener(this);
        sec.setOnClickListener(this);
        off.setOnClickListener(this);
        ctg.setOnClickListener(this);
        factorial.setOnClickListener(this);
        exponente.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                op=result.getText().toString();
                result.setText(m.btn0(op));
                break;
            case R.id.btn1:
                op=result.getText().toString();
                result.setText(m.btn1(op));
                break;
            case R.id.btn2:
                op=result.getText().toString();
                result.setText(m.btn2(op));
                break;
            case R.id.btn3:
                op=result.getText().toString();
                result.setText(m.btn3(op));
                break;
            case R.id.btn4:
                op=result.getText().toString();
                result.setText(m.btn4(op));
                break;
            case R.id.btn5:
                op=result.getText().toString();
                result.setText(m.btn5(op));
                break;
            case R.id.btn6:
                op=result.getText().toString();
                result.setText(m.btn6(op));
                break;
            case R.id.btn7:
                op=result.getText().toString();
                result.setText(m.btn7(op));
                break;
            case R.id.btn8:
                op=result.getText().toString();
                result.setText(m.btn8(op));
                break;
            case R.id.btn9:
                op=result.getText().toString();
                result.setText(m.btn9(op));
                break;
            case R.id.slash:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "/";
                result.setText("");
                break;
            case R.id.btn_multiply:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "*";
                result.setText("");
                break;
            case R.id.btn_clear:
                op1 = 0.0;
                result.setText("");
                break;
            case R.id.btn_delete:
                if (!result.getText().equals("")) {
                    op = result.getText().toString();
                    result.setText(op.substring(0, op.length() - 1));
                }
                break;
            case R.id.btn_plus:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "+";
                result.setText("");
                break;
            case R.id.btn_less:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "-";
                result.setText("");
                break;
            case R.id.btn_sqrt:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "√";
                op = " √( " + result.getText().toString() + " ) ";
                result.setText(op);
                break;
            case R.id.btn_percentage:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "%";
                result.setText("");
                break;
            case R.id.btn_sin:
                op1 = Double.parseDouble(result.getText().toString());
                op = " Sin( " + result.getText().toString() + " ) ";
                operacion = "sin";
                result.setText(op);
                break;
            case R.id.btn_cos:
                op1 = Double.parseDouble(result.getText().toString());
                op = " COS( " + result.getText().toString() + " ) ";
                operacion = "cos";
                result.setText(op);
                break;
            case R.id.btn_tan:
                op1 = Double.parseDouble(result.getText().toString());
                op = " TAN( " + result.getText().toString() + " ) ";
                operacion = "tan";
                result.setText(op);
                break;
            case R.id.btn_csc:
                op1 = Double.parseDouble(result.getText().toString());
                op = " CSC( " + result.getText().toString() + " ) ";
                operacion = "csc";
                result.setText(op);
                break;
            case R.id.btn_sec:
                op1 = Double.parseDouble(result.getText().toString());
                op = " SEC( " + result.getText().toString() + " ) ";
                operacion = "sec";
                result.setText(op);
                break;
            case R.id.btn_ctg:
                op1 = Double.parseDouble(result.getText().toString());
                op = " CTG( " + result.getText().toString() + " ) ";
                operacion = "ctg";
                result.setText(op);
                break;
            case R.id.btn_fact:
                op1 = Double.parseDouble(result.getText().toString());
                op = " Factorial( " + result.getText().toString() + " ) ";
                operacion = "factorial";
                result.setText(op);
                break;
            case R.id.btn_raised:
                op1 = Double.parseDouble(result.getText().toString());
                operacion = "pow";
                result.setText("");
                break;
            case R.id.btn_off:
                finish();
                break;
            case R.id.btn_dot:
                op1 = Double.parseDouble(result.getText().toString());
                op = result.getText().toString() + ".";
                result.setText(op);
                break;
            case R.id.btn_parentesis:
                op1 = Double.parseDouble(result.getText().toString());
                op = "(" + result.getText().toString() + ")";
                result.setText(op);
                break;

            case R.id.btn_equals:
                String pantalla2 = result.getText().toString();
                if (pantalla2.equals("")) {
                    op2 = 0.0;
                    result.setText(m.evalua(op1, op2, operacion));
                }else{
                    op2 = Double.parseDouble(result.getText().toString());
                    result.setText(m.evalua(op1, op2, operacion));
                }

                break;
        }
    }
}
