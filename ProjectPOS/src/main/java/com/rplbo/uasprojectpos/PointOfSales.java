package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfSales {
    private ArrayList<Barang> arrBarang;

    public PointOfSales() {

    }

    public void inputBarang(Barang barang) {
        ArrayList<Barang> arrBarang = new ArrayList<Barang>();
        arrBarang.add(barang);

        System.out.println("Kode Barang\t\tNama Barang\t\t\t\t\tStok\t\tHarga");
        System.out.print(arrBarang.get(0).getKode());
        System.out.print("\t\t\t");
        System.out.print(arrBarang.get(0).getNama());
        System.out.print("\t\t");
        System.out.print(arrBarang.get(0).getStok());
        System.out.print("\t\t\tRp ");
        System.out.print(arrBarang.get(0).getHarga());
        System.out.println();
    }

    public void tampilDaftarBarang() {
        System.out.println("Kode Barang\t\tNama Barang\t\t\t\t\tStok\t\tHarga");
//        for(int i = 0; i <= arrBarang.size(); i++) {
//            System.out.print(arrBarang.get(i).getKode());
//            System.out.print("\t\t\t");
//            System.out.print(arrBarang.get(i).getNama());
//            System.out.print("\t\t");
//            System.out.print(arrBarang.get(i).getStok());
//            System.out.print("\t\t\tRp ");
//            System.out.print(arrBarang.get(i).getHarga());
//            System.out.println();
//        }
    }


    public void checkout(HashMap<Barang,Integer> keranjang, long nominal) {
        long tagihan = 1320000;
        long kembalian = nominal - tagihan;
        System.out.println("-----Transaksi Sukses!-----");
        System.out.println("Total Tagihan: Rp " + tagihan);
        System.out.println("Total Bayar: Rp " + nominal);
        System.out.println("Total Kembalian: Rp " + kembalian);
    }
}
