package com.opcd.as_10_progb_toggleb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private ImageView imageView;
    private SeekBar seekBar;
    private TextView txtSeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton)findViewById(R.id.toggle);
        imageView = (ImageView)findViewById(R.id.image23);
        seekBar = (SeekBar)findViewById(R.id.seekBar2);
        txtSeekBar = (TextView)findViewById(R.id.textSeek);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    imageView.setVisibility(View.VISIBLE);
                else if (b == false)
                    imageView.setVisibility(View.INVISIBLE);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtSeekBar.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                System.out.println("Seek Bar haraket edebilir.");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                System.out.println("Seek Bar durdu.");
            }
        });

    }
}