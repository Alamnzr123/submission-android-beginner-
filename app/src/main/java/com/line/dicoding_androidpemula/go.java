package com.line.dicoding_androidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class go extends AppCompatActivity {

    private RecyclerView listitem;
    private ArrayList<item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        listitem = findViewById(R.id.youare);
        listitem.setHasFixedSize(true);
        list.addAll(itemData.getListData());
        showRecyclercard();

    }

    private void showRecyclercard()
    {
        listitem.setLayoutManager(new LinearLayoutManager(this));
        List cardViewHeroAdapter = new List(list);
        listitem.setAdapter(cardViewHeroAdapter);

    cardViewHeroAdapter.setOnItemClickCallback(new List.OnItemClickCallback() {
        @Override
        public void onItemClicked(item data) {
            showSelectedlist(data);
        }
      });
      }
    private void showSelectedlist(item item) {
        Intent welcomeIntent = new Intent(go.this, Details.class);
        welcomeIntent.putExtra(Details.nama, item.getNama());
        welcomeIntent.putExtra(Details.deskripsi, item.getDeskripsi());
        welcomeIntent.putExtra(String.valueOf(Details.gambar), item.getPhoto());
        startActivity(welcomeIntent);

    }
}
