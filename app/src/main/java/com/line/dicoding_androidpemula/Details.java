package com.line.dicoding_androidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Details extends AppCompatActivity {

    private ArrayList<item> itemlist;

    public static final String deskripsi = "Deskripsi";
    public static final String nama = "Nama Menu";
    public static final String gambar = "Gambar";

    private Button btnabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView datanama = findViewById(R.id.txtnama);
        ImageView datagambar = findViewById(R.id.img);
        EditText datadeskripsi = findViewById(R.id.editText);
        btnabout = findViewById(R.id.btnabout);

        String getnama = getIntent().getStringExtra(nama);
        String getdeskripsi = getIntent().getStringExtra(deskripsi);
        int getphoto = getIntent().getIntExtra(gambar, 0);

        String txtnama = "Nama menu : " + getnama ;
        datanama.setText(txtnama);

        String edtdeskripsi = getdeskripsi;
        datadeskripsi.setText(edtdeskripsi);

        Glide.with(this)
                .load(getphoto)
                .apply(new RequestOptions().override(400, 173))
                .into(datagambar);


        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(Details.this, about.class);
                startActivity(data);
            }
        });
    }
}