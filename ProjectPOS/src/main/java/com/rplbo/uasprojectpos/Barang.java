package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private int nextNum;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        if (nama.startsWith("Keyboard")) {
            nextNum+=1;kode = "KB00" + nextNum;
        }
        if (nama.startsWith("Mouse")) {
            nextNum+=1;kode = "MS00" + nextNum;
        }
        if (nama.startsWith("Headset")) {
            nextNum+=1;kode = "HS00" + nextNum;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public long getHarga() {
        return harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
