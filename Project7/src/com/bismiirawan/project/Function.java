/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

/**
 *
 * @author Bismi
 */
public class Function {

    static String nama = "Bismi Sri Mulyani Irawan";
    
    //Fungsi static
    static void jalan() {
        
        System.out.println(nama + " sedang berjalan..");
    }
    
    //Fungsi menggunakan parameter
    static void buah(String nama_buah) {
        System.out.println(nama + " membeli buah : " + nama_buah);
    }
    
    //Fungsi dengan paramater dan return value
    static int luasPersegiPanjang(int p, int l){
        int luas = p * l;
        return luas;
    }
    
    //Fungsi non static
    void keluar() {
        System.out.println("Saya ingin keluar kelas..");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Memanggil fungsi static
        jalan();
        
        //memanggil fungsi static dengan dengan parameter
        buah("Pear");
        
        //Memanggil dengan parameter dan return value
        int panjang = 20;
        int lebar = 10;
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang(panjang, lebar));
        
        //memanggil fungsi non static
        Function f = new Function();
        f.keluar();
    }
}