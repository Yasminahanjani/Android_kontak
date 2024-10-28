package com.example.kontak19421369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView tnama, talamat, temail, tlahir, ttelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        String shnama = getIntent().getStringExtra("VNAMA");
        String shalamat = getIntent().getStringExtra("VALAMAT");
        String shemail = getIntent().getStringExtra("VEMAIL");
        String shlahir = getIntent().getStringExtra("VLAHIR");
        String shtelpon = getIntent().getStringExtra("VTELPON");

        tnama = findViewById(R.id.hnama);
        tnama.setText(String.valueOf(shnama));

        talamat = findViewById(R.id.halamat);
        talamat.setText(String.valueOf(shalamat));

        temail = findViewById(R.id.hemail);
        temail.setText(String.valueOf(shemail));

        tlahir = findViewById(R.id.hlahir);
        tlahir.setText(String.valueOf(shlahir));

        ttelpon = findViewById(R.id.htelpon);
        ttelpon.setText(String.valueOf(shtelpon));


    }
}