package com.example.masatokg.revcountbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_reset;
    Button btn_up;
    Button btn_down;
    int countValue = 0;
    TextView cnt_value;
    final int FINAL_CNT_VAL=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn_reset = (Button) findViewById(R.id.btn_reset);
        btn_up = (Button) findViewById(R.id.btn_up);
        btn_down = (Button) findViewById(R.id.btn_down);
        cnt_value = (TextView)findViewById(R.id.cnt_viewer);
        cnt_value.setText(String.valueOf(this.FINAL_CNT_VAL));
        // onClickリスナーをセット
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt_value.setText(String.valueOf(FINAL_CNT_VAL));
            }
        });
        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countValue++;
                cnt_value.setText(String.valueOf(countValue));
            }
        });
        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(countValue>FINAL_CNT_VAL){
                    countValue--;
                }
                cnt_value.setText(String.valueOf(countValue));
            }
        });
    }
}
