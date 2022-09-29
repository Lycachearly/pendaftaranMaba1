package com.chearly.pendaftranmaba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorpendaftaran, etNama;
    Button btnDAFTAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorpendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_nama);
        btnDAFTAR = findViewById(R.id.et_daftar);
        btnDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NomorPendaftarn = etNomorpendaftaran.getText().toString();
                String Nama = etNama.getText().toString();

                if (NomorPendaftarn.trim().equals("")){
                    etNomorpendaftaran.setError("Nomor Pendaftaran Wajib Diisi");
                }
                else  if (Nama.trim().equals("")){
                    etNama.setError("Nama Wajib Diisi");
                }
                else{
                    Toast.makeText(MainActivity.this, "Selamat Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}