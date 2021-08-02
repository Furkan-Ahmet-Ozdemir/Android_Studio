package com.opcd.as_8_registerpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import java.sql.SQLOutput;
import java.util.OptionalInt;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextSurName, editTextCity, editTextAge;
    private CheckBox checkBoxProg, checkBoxSpor, checkBoxOyun;
    private RadioButton radioButtonEr, radioButtonKa;

    private String editName, editSurName, editCity, editAge;
    private String check1, check2, check3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextSurName = (EditText) findViewById(R.id.editTextlLastName);
        editTextCity = (EditText) findViewById(R.id.editTextCity);
        editTextAge = (EditText) findViewById(R.id.editTextAge);

        checkBoxProg = (CheckBox) findViewById(R.id.checkBoxProg);
        checkBoxSpor = (CheckBox) findViewById(R.id.checkBoxSpor);
        checkBoxOyun = (CheckBox) findViewById(R.id.checkBoxOyun);

        radioButtonEr = (RadioButton) findViewById(R.id.radioBtnEr);
        radioButtonKa = (RadioButton) findViewById(R.id.radioBtnKa);


    }

    public void btnKayitOl(View view) {
        editName = editTextName.getText().toString();
        editSurName = editTextSurName.getText().toString();
        editCity = editTextCity.getText().toString();
        editAge = editTextAge.getText().toString();

        if (!TextUtils.isEmpty(editAge) && !TextUtils.isEmpty(editName) && !TextUtils.isEmpty(editCity) && !TextUtils.isEmpty(editSurName)) {

            System.out.println("----Bİlgileriniz----");
            System.out.println("Adınız :"+editName);
            System.out.println("Soyadınız :"+editSurName);
            System.out.println("Yaşınız :"+editAge);


            System.out.println("----Hobileriniz----");
            if (checkBoxOyun.isChecked()) {
                System.out.println(checkBoxOyun.getText().toString());
            }
            if (checkBoxSpor.isChecked()) {
                System.out.println(checkBoxSpor.getText().toString());
            }
            if (checkBoxProg.isChecked()) {
                System.out.println(checkBoxProg.getText().toString());
            }

            System.out.println("----Cinsiyetiniz----");
            if (radioButtonEr.isChecked())
                System.out.println("Erkek");
            else
                System.out.println("Bayan");
        }
        else
            System.out.println("Bilgiler Boş Geçilemez");




    }
}