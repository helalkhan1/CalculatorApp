
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private TextView textView, resultView;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDot,btnEqual,btnPlus,btnDivide,btnMinus,btnMultiple,btnDelete,btnAC,btnLArrow,btnRArrow;

    private int track=-1;

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivide = findViewById(R.id.btnDivide);
        btnDelete = findViewById(R.id.del);
        btnAC = findViewById(R.id.ac);
        btnLArrow = findViewById(R.id.lArrow);
        btnRArrow = findViewById(R.id.rArrow);
        resultView = findViewById(R.id.rtv);
        textView =findViewById(R.id.tv);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }


                if(text == null){
                    text = "";
                }
                textView.setText(text+0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }

                textView.setText(text+1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+9);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                if(text == null){
                    text = "";
                }
                textView.setText(text+".");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                char last = text.charAt(text.length() -1);

                if(text == null){
                    text = "";
                }

                if (last == '+' || last == '-' || last == '*' || last == '/'){
                    textView.setText(text.substring(0, text.length() - 1));
                    text = textView.getText().toString();
                    textView.setText(text+"+");
                }else {
                    textView.setText(text + "+");
                }
            }


        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if(rtext !=""){
                    text="";
                    resultView.setText("");
                }

                char last = text.charAt(text.length() -1);

                if(text == null){
                    text = "";
                }
                if (last == '+' || last == '-' || last == '*' || last == '/'){
                    textView.setText(text.substring(0, text.length() - 1));
                    text = textView.getText().toString();
                    textView.setText(text+"-");
                }else {
                    textView.setText(text + "-");
                }
            }
        });


        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if (rtext != "") {
                    text = "";
                    textView.setText("");
                    resultView.setText("");
                }

                if(text==null || text.isEmpty()) {
                    textView.setText("");
                }
                else{
                    text = textView.getText().toString();
                    char last = text.charAt(text.length() - 1);

                    if (last == '+' || last == '-' || last == '*' || last == '/') {
                        textView.setText(text.substring(0, text.length() - 1));
                        text = textView.getText().toString();
                        textView.setText(text + "*");
                    } else {
                        textView.setText(text + "*");
                    }
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();
                String rtext = resultView.getText().toString();

                if (rtext != "") {
                    text = "";
                    textView.setText("");
                    resultView.setText("");
                }

                if(text==null || text.isEmpty()) {
                    textView.setText("");
                }
                 else{
                    text = textView.getText().toString();
                    char last = text.charAt(text.length() - 1);

                    if (last == '+' || last == '-' || last == '*' || last == '/') {
                        textView.setText(text.substring(0, text.length() - 1));
                        text = textView.getText().toString();
                        textView.setText(text + "/");
                    } else {
                        textView.setText(text + "/");
                    }
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();
                if(text==null || text.isEmpty()){
                    return;
                }
                textView.setText(text.substring(0, text.length() - 1));
            }
        });


        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("");
                resultView.setText("");
                track = -1;
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textView.getText().toString();


                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String Result="";
                String finalResult="";

                Scriptable scriptable=rhino.initStandardObjects();
                Result=rhino.evaluateString(scriptable,text,"Javsscript",1,null).toString();

                if(Result.equalsIgnoreCase("Infinity")){
                    finalResult = Result;
                }else{
                    int i,num;
                    char operator = 0;
                    for(i=0 ; i<Result.length() ; i++){
                        if(Result.charAt(i)== '.') {
                            operator = Result.charAt(i);
                            break;
                        }
                    }

                    String str1 = Result.substring(0,i);
                    String str2 = Result.substring(i+1,Result.length());
                    num = Integer.parseInt(str2);

                    if(num == 0){
                        finalResult = str1;
                    }else{
                        finalResult = Result;
                    }
                }

                resultView.setText(finalResult);

                String equation = text+"---"+finalResult;

                String history = mSharedPreferences.getString("history","");

                String[] strSplit = history.split(",");

                ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));
                System.out.println(list);
                if(history.equals("")) list.remove(list.size()-1);

                System.out.println(list);
                if(list.size()==10){
                    list.remove(9);
                }
                list.add(0, equation);
                history = String.join(", ", list);
                mEditor.putString("history",history);
                mEditor.apply();


            }
        });

        btnLArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String history = mSharedPreferences.getString("history","");

                String[] strSplit = history.split(",");
                ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));



                if(track +1 <list.size()){
                    if(track !=9){
                        track=track+1;
                    }

                    String[] resultHistory = list.get(track).split("---");

                    textView.setText(resultHistory[0]);
                    resultView.setText(resultHistory[1]);
                    System.out.println(list.size());
                    System.out.println(track);

                }
            }
        });

        btnRArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String history = mSharedPreferences.getString("history","");

                String[] strSplit = history.split(",");
                ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));
                System.out.println(list);

                if(track >= 0){
                    if(track !=0){
                        track=track-1;
                    }

                    String[] resultHistory = list.get(track).split("---");

                    textView.setText(resultHistory[0]);
                    resultView.setText(resultHistory[1]);
                    System.out.println(list.size());
                    System.out.println(track);
                    if(track == 0){
                        track = -1;
                    }



                }
            }
        });

    }
}