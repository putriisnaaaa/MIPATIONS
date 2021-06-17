package com.muliyani.putri.isna.mipations;

import android.app.ActionBar;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull String name, @NonNull @org.jetbrains.annotations.NotNull Context context, @NonNull @org.jetbrains.annotations.NotNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    public void sejarah(View view) {
        Intent move = new Intent(this, SejarahActivity.class);
        startActivity(move);
    }

    public void visiMisi(View view) {
        Intent move = new Intent(this, VisiMisiActivity.class);
        startActivity(move);
    }

    public void dosen(View view) {
        Intent move = new Intent(this, DosenActivity.class);
        startActivity(move);
    }

    public void jurusan(View view) {
        Intent move = new Intent(this, JurusanActivity.class);
        startActivity(move);
    }

    public void ormawa(View view) {
        Intent move = new Intent(this, OrmawaActivity.class);
        startActivity(move);
    }

    public void akreditasi(View view) {
        Intent move = new Intent(this, AkreditasiActivity.class);
        startActivity(move);
    }
}