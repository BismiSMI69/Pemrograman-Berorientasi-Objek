/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

/**
 *
 * @author Bismi
 */
public class VolumeTabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definisi Variable dan Konstanta
        double r = 20;
        double t = 40;
        final double pi = 3.14;
        
        // Menghitung Volume Tabung
        double volume = pi * (r * r) * t;
        
        // Menampilkan Hasil Program
        System.out.println("==== MENGHITUNG VOLUME TABUNG ====");
        System.out.println("==== Bismi Sri Mulyani Irawan ====");
        System.out.println("============ 22110093 ============");
        System.out.println("Jari Jari Alas = " + r + " cm");
        System.out.println("Tinggi Tabung = " + t + " cm");
        System.out.println("Volume Tabung = " + volume + "cm kubik");
    }
}

    
