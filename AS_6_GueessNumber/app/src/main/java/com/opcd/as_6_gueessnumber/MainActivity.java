package com.opcd.as_6_gueessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txtKalanHak,txtSonuc;
    private EditText editTextSayi;
    private String gelenDeger;
    private int kalanHak = 3,randomSayi;
    private Random rndNumber;
    private boolean tahminDogrumu = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtKalanHak = (TextView)findViewById(R.id.textViewHak);
        txtSonuc = (TextView)findViewById(R.id.textViewMesaj);
        editTextSayi = (EditText) findViewById(R.id.editTextSayi);

        rndNumber = new Random();
        randomSayi = rndNumber.nextInt(10);
        System.out.println("Random sayi : "+randomSayi);


    }
    public void btnTahminEt(View view){
        gelenDeger = editTextSayi.getText().toString();

        if (!TextUtils.isEmpty(gelenDeger)){
            if (kalanHak > 0 && tahminDogrumu == false){
                if (gelenDeger.equals(String.valueOf(randomSayi))){
                    sonucGoster("Tebrikler Doğru Tahmin");
                    tahminDogrumu = true;
                }else {
                    txtSonuc.setText("Yanlış Tahmin");
                    editTextSayi.setText("");
                }
                kalanHak--;
                txtKalanHak.setText("Kalan hak : "+kalanHak);

                if (kalanHak == 0 && tahminDogrumu == false){
                    sonucGoster("Tahmin hakkınız bitti");
                    editTextSayi.setText(" ");
                }
            }else
                txtSonuc.setText("Game Over");
        }else
            txtSonuc.setText("Girilen Değer Boş Olamaz");
    }

    private void sonucGoster(String mesaj) {
        editTextSayi.setEnabled(false);
        txtSonuc.setText(mesaj);
    }
}