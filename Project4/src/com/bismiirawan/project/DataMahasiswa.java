/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

import java.util.Scanner;

/**
 *
 * @author Bismi
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        String alamat;
        int umur;
        
        //Membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("== PROGRAM DATA MAHASISWA ==");
        System.out.print("Nama Mahasiswa : ");
        
        //Menyimpan inputan user ke variabel dengan scanner
        nama = input.nextLine();
        
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        
        System.out.print("Umur : ");
        umur = input.nextInt();
        
        System.out.println("---------------------------");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
    }
}








