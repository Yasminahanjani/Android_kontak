package com.example.kontak19421369;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama, alamat, email, lahir, telpon;
    TextView hnama, halamat, hemail, hlahir, htelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama     = findViewById(R.id.nama);
        alamat   = findViewById(R.id.alamat);
        email    = findViewById(R.id.email);
        lahir    = findViewById(R.id.lahir);
        telpon   = findViewById(R.id.telpon);

        hnama     = findViewById(R.id.hnama);
        halamat   = findViewById(R.id.halamat);
        hemail    = findViewById(R.id.hemail);
        hlahir    = findViewById(R.id.hlahir);
        htelpon   = findViewById(R.id.htelpon);
    }

    public void save(View view) {
        String vnama        = nama.getText().toString();
        String valamat      = alamat.getText().toString();
        String vemail       = email.getText().toString();
        String vlahir       = lahir.getText().toString();
        String vtelpon      = telpon.getText().toString();

//        hnama.setText(vnama);
//        halamat.setText(valamat);
//        hemail.setText(vemail);
//        hlahir.setText(vlahir);
//        htelpon.setText(vtelpon);

        Intent pindahIntent = new Intent(MainActivity.this, HasilActivity.class);
        pindahIntent.putExtra("VNAMA", vnama);
        pindahIntent.putExtra("VALAMAT", valamat);
        pindahIntent.putExtra("VEMAIL", vemail);
        pindahIntent.putExtra("VLAHIR", vlahir);
        pindahIntent.putExtra("VTELPON", vtelpon);
        startActivity(pindahIntent);




    }
}