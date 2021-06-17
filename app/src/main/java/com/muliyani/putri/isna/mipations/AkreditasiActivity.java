package com.muliyani.putri.isna.mipations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.muliyani.putri.isna.mipations.akreditasi.AkreditasiInformatikaActivity;

public class AkreditasiActivity extends AppCompatActivity {

    private TextView txtDuaRibuEmpatBelas;
    private TextView txtDuaRibuDuaPuluh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akreditasi);

        txtDuaRibuEmpatBelas = findViewById(R.id.infDuaRibuEmpatBelas);
        txtDuaRibuDuaPuluh = findViewById(R.id.infDuaRibuDuaPuluh);
    }

    public void DuaRibuEmpatSampaiDuaRibuSembilanBelas(View view) {
        Intent move = new Intent(this, AkreditasiInformatikaActivity.class);
        move.putExtra("sertifikat", txtDuaRibuEmpatBelas.getText().toString());
        startActivity(move);
    }

    public void DuaRibuDuaPuluhSampaiDuaRibuDuaPuluhLima(View view) {
        Intent move = new Intent(this, AkreditasiInformatikaActivity.class);
        move.putExtra("sertifikat", txtDuaRibuDuaPuluh.getText().toString());
        startActivity(move);
    }

    public void back(View view) {
        onBackPressed();
    }
}