package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;

    public Monster(String nama) {
        this.nama = nama;
    }
    public String bersuara() {
        return bersuara();
    }

    public String bergerak() {
        return bergerak();
    }

    public String getNama() {
        return nama;
    }
    public void getInfo() {
        System.out.println("Nama: " + Main.getMonsterSaya(1).getNama());
        System.out.println("Suara: " + Main.getMonsterSaya(1).bersuara());
        System.out.println("Gerak: " + Main.getMonsterSaya(1).getNama() + " " + Main.getMonsterSaya(1).bergerak().toLowerCase() + "...");
    }
}
