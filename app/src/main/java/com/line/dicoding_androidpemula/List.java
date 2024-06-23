package com.line.dicoding_androidpemula;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class List extends RecyclerView.Adapter<List.listHolder> {

    private ArrayList<item> itemlist;
    List(ArrayList<item> list) {
        this.itemlist = list;
    }
    private OnItemClickCallback onItemClickCallback;

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public listHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemlist, viewGroup, false);
        return new listHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final listHolder holder, int position) {
        item hero = itemlist.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(hero.getNama());

        holder.btndetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(itemlist.get(holder.getAdapterPosition()));
            }
        });

        holder.btnharga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Harga" +
                        itemlist.get(holder.getAdapterPosition()).getHarga(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
            return itemlist.size();
        }

    class  listHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        Button btnharga, btndetail;


        listHolder(View view) {
            super(view);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            btnharga = itemView.findViewById(R.id.btn_harga);
            btndetail = itemView.findViewById(R.id.btn_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(item data);
    }
}
