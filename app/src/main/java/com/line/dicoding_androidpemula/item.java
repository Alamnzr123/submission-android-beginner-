package com.line.dicoding_androidpemula;

public class item {
    private String nama;
    private String Deskripsi;
    private int photo;

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    private String harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.Deskripsi = deskripsi;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = Integer.parseInt(photo);
    }
}


