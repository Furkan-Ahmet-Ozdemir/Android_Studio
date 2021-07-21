package com.opcd.as_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private ImageView imgTest;
    private CheckBox checkTest;
    private RadioButton radioKadin,radioErkek;
    private Switch switchTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgTest = (ImageView)findViewById(R.id.imageViewTest);
        checkTest = (CheckBox)findViewById(R.id.checkBox);
        radioKadin = (RadioButton)findViewById(R.id.radButKadin);
        radioErkek = (RadioButton)findViewById(R.id.radButErkek);
        switchTest = (Switch)findViewById(R.id.switch1);
        // ImageView
  //      imgTest.setBackgroundColor(Color.BLUE);
//        imgTest.setBackgroundResource(R.drawable.download);
  //       Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.download);
  //      imgTest.setImageBitmap(bitmap);
  //      imgTest.setRotation(45.5f);

        // CheckBox
 //       checkTest.setChecked(true);
//        checkTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b){
//                    System.out.println("Toplam " + 10);
//                }else
//                    System.out.println("Toplan işlemi kapalı.");
//
//            }
//        });
//

        // RadioButton

//        radioErkek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    System.out.println("Cinsiyet erkek.");
//                }
//            }
//        });
//
//        radioKadin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//                if (b) {
//                    System.out.println("Cinsyet kadın.");
//                }
//
//            }
//        });



        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    System.out.println("Ses açık.");
                }else {
                    System.out.println("Ses kapalı.");
                }
            }
        });



    }
}