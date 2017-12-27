package com.example.celso.testes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.editReal = (EditText) this.findViewById(R.id.edit_real);
        this.mViewHolder.textDollar = (TextView) this.findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro = (TextView) this.findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = (Button) this.findViewById(R.id.button_calculate);
        this.clearValues();
        this.mViewHolder.buttonCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_calculate) {


            Double mReal = Double.valueOf(this.mViewHolder.editReal.getText().toString());


            this.mViewHolder.textDollar.setText(String.format("%.2f", mReal * 3.29));
            this.mViewHolder.textEuro.setText(String.format("%.2f", mReal * 3.89));
        }
    }


    private void clearValues() {
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }


    private static class ViewHolder {
        private EditText editReal;
        private TextView textDollar;
        private TextView textEuro;
        private Button buttonCalculate;
    }
}