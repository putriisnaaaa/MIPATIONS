package com.muliyani.putri.isna.mipations.akreditasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.muliyani.putri.isna.mipations.R;

public class AkreditasiInformatikaActivity extends AppCompatActivity {

    private ImageView imgSertifikat;
    private TextView txtKeteranganTahun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akreditasi_informatika);

        imgSertifikat = findViewById(R.id.imgSertifikat);
        txtKeteranganTahun = findViewById(R.id.txtKeteranganTahun);

        // 2014-2019
        // 2020-2025
        String tahunSerifikat = getIntent().getStringExtra("sertifikat");
        if(tahunSerifikat.equals("2014-2019")) {
            imgSertifikat.setBackgroundResource(R.drawable.infomatika20142019);
            txtKeteranganTahun.setText(txtKeteranganTahun.getText().toString() +" (2014-2019)");
        } else if(tahunSerifikat.equals("2020-2025")) {
            imgSertifikat.setBackgroundResource(R.drawable.informatika20202025);
            txtKeteranganTahun.setText(txtKeteranganTahun.getText().toString() +" (2020-2025)");
        }
    }

    public void back(View view) {
        onBackPressed();
    }
}