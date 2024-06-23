package com.line.dicoding_androidpemula;

import java.util.ArrayList;

class itemData
{
    private static String[][] data = new String[][]{
            {"Spaghetti", "Mie Lezat dengan Campuran Saus", String.valueOf(R.drawable.spagethi),"Rp.10.000"},
            {"Hot Cheese Chicken", "Ayam Dimasak dengan Saus Keju", String.valueOf(R.drawable.hot_cheese_chicken),"Rp.20.000"},
            {"Ayam", "Ayam Crispy", String.valueOf(R.drawable.ayam),"Rp.20.000"},
            {"Ayam Bakar", "Ayam Bakar Lezat disantap dengan sepiring Nasi", String.valueOf(R.drawable.ayam_bakar),"Rp.25.000"},
            {"Ayam Geprek", "Ayam Geprek dengan Sambal Matah", String.valueOf(R.drawable.ayam_geprek),"Rp.25.000"},
            {"Ayam Lada Hitam", "Ayam dengan Taburan Lada hitam Di Atasnya", String.valueOf(R.drawable.ayam_lada_hitam),"Rp.30.000"},
            {"Ayam Penyet", "Ayam Penyet dengan Sambal Cabe Hijau", String.valueOf(R.drawable.ayam_penyet),"Rp.20.000"},
            {"Burger", "Roti Isi Nikmat dengan Potongan Daging", String.valueOf(R.drawable.burger),"Rp.8.000"},
            {"Chicken Katsu", "Potongan Ayam Crispy", String.valueOf(R.drawable.chicken_katsu),"Rp.25.000"},
            {"Cordon Bleu", "Potongan Ikan yang digoreng", String.valueOf(R.drawable.cordon_bleu),"Rp.10.000"},
};

    static ArrayList<item> getListData(){
        ArrayList<item> list = new ArrayList<>();
        for (String[] aData : data) {
            item hero = new item();
            hero.setNama(aData[0]);
            hero.setDeskripsi(aData[1]);
            hero.setPhoto(aData[2]);
            hero.setHarga(aData[3]);

            list.add(hero);
        }

        return list;
    }
}

