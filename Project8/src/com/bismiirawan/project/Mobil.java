/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

/**
 *
 * @author Bismi
 */
public class Mobil {
    //Attribute
    String merk;
    String tahun;
    int kecepatan;
    
    //Method
    int tambah_kecepatan(int kecepatan_tambahan) {
        kecepatan = kecepatan + kecepatan_tambahan;
        return kecepatan;
    }
    
    int kurangi_kecepatan(){
        kecepatan = kecepatan - 20;
        return kecepatan;
    }
    
    void berhenti(){
        System.out.println("Mobil berhasil dihentikan.....");
    }
}
