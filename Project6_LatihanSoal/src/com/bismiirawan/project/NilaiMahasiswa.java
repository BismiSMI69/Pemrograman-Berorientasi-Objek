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
        Scanner input = new Scanner(System.in);
        Nilai n = new Nilai();
        
        System.out.print("Masukan Nama : " );
        n.nama = input.nextLine();
        System.out.print("Masukan Nilai Kehadiran : " );
        n.kehadiran = input.nextInt();
        System.out.print("Masukan Nilai Tugas : " );
        n.tugas = input.nextInt();
        System.out.print("Masukan Nilai UTS : " );
        n.uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : " );
        n.uas = input.nextInt();
        
        //menggunakan fungsi hitunNilai yang ada di class Nilai
        double nilaiAkhir = n.hitungNilai();
        
        //menggunakan prosedur tampilNilai yang ada di clas Nilai
        n.tampilNilai(nilaiAkhir);
    } 
}

