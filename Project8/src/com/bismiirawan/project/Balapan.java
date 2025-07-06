/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;
/**
 *
 * @author Bismi
 */
public class Balapan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Membuat objek baru class Mobil
        Mobil mbl = new Mobil();
        
        //Mengakses dan menggunakan attribute dari class Mobil
        mbl.merk = "Toyota";
        mbl.tahun = "2019";
        mbl.kecepatan = 60;                                                 
        
        System.out.println("Merk Mobil : " + mbl.merk);
        System.out.println("Tahun : " + mbl.tahun);
        System.out.println("Kecepatan Awal : " + mbl.kecepatan);
        
        //Mengakses dan menggunakan method dari class Mobil
        mbl.tambah_kecepatan(20);
        System.out.println("Kecepatan : " + mbl.kecepatan);
        
        mbl.kurangi_kecepatan();
        System.out.println("Kecepatan : " + mbl.kecepatan);
        
        mbl.kurangi_kecepatan();
        System.out.println("Kecepatan : " + mbl.kecepatan);
        
        mbl.kurangi_kecepatan();
        System.out.println("Kecepatan : " + mbl.kecepatan);
        
        mbl.berhenti();
    }
}