/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

/**
 *
 * @author Bismi
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
        String nama;
        int kehadiran, tugas, uts, uas;
        double hasil;
       
        double hitungNilai(){
            hasil = (kehadiran*0.1)+(tugas*0.2)+(uts*0.3)+(uas*0.4);
            return hasil;
        }
               
        void tampilNilai (double nAkhir){
        System.out.println("=========================================");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Nilai Kehadiran = " + kehadiran);
        System.out.println("Nilai Tugas = " + tugas);
        System.out.println("Nilai UTS = " + uts);
        System.out.println("Nilai UAS= " + uas);
        System.out.println("=========================================");
        System.out.println("Nilai Akhir = " + nAkhir);
    }
} 

