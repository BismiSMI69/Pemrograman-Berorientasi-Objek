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
        
        //Menggunakan  scanner
        Scanner io = new Scanner(System.in);
        System.out.print("Masukan Nama Mahasiswa: ");
        nama = io.nextLine();
        System.out.print("Nilai Mahasiswa: ");
        nilai = io.nextInt();
        
        //Membuat struktur kondisi if
        if(nilai > 60) {
            System.out.println("Lulus");
        }
        else {
            System.out.println("Tidak Lulus");
        }
    }
}




