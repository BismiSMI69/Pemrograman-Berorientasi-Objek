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
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int nilai;
        
        Scanner io = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa: ");
        nama = io.nextLine();
        
        System.out.print("Nilai Mahasiswa: ");
        nilai = io.nextInt();
        
        //Membuat struktur kondisi if
        if(nilai >=80) {
            System.out.println("Nilai: A");
        } else if (nilai >= 70) {
            System.out.println("Nilai: B");
        } else if (nilai >= 60) {
            System.out.println("Nilai: C");
        } else if (nilai >= 50) {
           System.out.println("Nilai: D"); 
        } else {
            System.out.println("Nilai : E dan Tidak Lulus");
        }
    } 
}


