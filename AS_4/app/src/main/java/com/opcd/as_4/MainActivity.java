package com.opcd.as_4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button btnRegister;
    private TextView textInfo;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText)findViewById(R.id.editTextName);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        textInfo = (TextView) findViewById(R.id.textInfo);


        editTextName.setText("kelmsmfl");




        // ----------   TextView ------------------
//        System.out.println(textView.getText().toString());
//
//        textView.setTextSize(45f);
//        textView.setTextColor(Color.parseColor("#123456"));
  //      textView.setTextColor(Color.argb(150, 20, 250, 40));
   //     textView.setText("dsdfsgsdg");
        // ----------   Button   ------------------

    /*button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//          textView.setText("Butona basıldı.");
            textView.setText(String.valueOf(15 + 20 ));
            button.setEnabled(false);

        }
    });
   */
    /*    button.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {

            button.setBackgroundColor(Color.BLUE);
            return false;
        }
    });
    */


    }
    public void btnClick(View view){
        name = editTextName.getText().toString();

        if (!TextUtils.isEmpty(name)) {
            textInfo.setText(name + " ismi geçerlidir.");
            textInfo.setVisibility(view.VISIBLE);
        }
        else{
            textInfo.setText("Boş bırakılamaz.");
            textInfo.setVisibility(view.VISIBLE);
        }

    }
}