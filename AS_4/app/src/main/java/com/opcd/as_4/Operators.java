package com.opcd.as_4;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class Operators extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(15);
        stack.push(25);
        stack.push(56);

        for (Integer s: stack){
            System.out.println(s);
        }


    }
}
