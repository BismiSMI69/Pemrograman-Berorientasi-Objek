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
public class HitungNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nama; 
        int kehadiran, tugas, uts, uas;
        
        System.out.print("Masukan Nama : " );
        nama = input.nextLine();
        System.out.print("Masukan Nilai Kehadiran :  " );
        kehadiran = input.nextInt();
        System.out.print("Masukan Nilai Tugas : " );
        tugas = input.nextInt();
        System.out.print("Masukan Nilai UTS : " );
        uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : " );
        uas = input.nextInt();
        
        double nilaiAkhir = (kehadiran*0.1)+(tugas*0.2)+(uts*0.3)+(uas*0.4);
        
        System.out.println("=========================================");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Nilai Kehadiran = " + kehadiran);
        System.out.println("Nilai Tugas = " + tugas);
        System.out.println("Nilai UTS = " + uts);
        System.out.println("Nilai UAS= " + uas);
        System.out.println("=========================================");
        System.out.println("Nilai Akhir = " + nilaiAkhir);
    }  
}

