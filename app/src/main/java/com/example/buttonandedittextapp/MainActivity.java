package com.example.buttonandedittextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNumber;
    private Button btnEnter;
    private TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initListeners();
    }

    private void initUI() {
        etNumber = findViewById(R.id.etNumber);
        btnEnter = findViewById(R.id.btnEnter);
        tvNumber = findViewById(R.id.tvNumber);
    }

    private void initListeners() {
        btnEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnEnter) {
            if (!etNumber.getText().toString().isEmpty()) {
                tvNumber.setText(etNumber.getText().toString());
            } else {
                tvNumber.setText("");
                etNumber.setError("The EditText is empty");
            }
        }
    }

}
