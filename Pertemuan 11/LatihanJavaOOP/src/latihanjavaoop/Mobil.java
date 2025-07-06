/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjavaoop;

/**
 *
 * @author Aldi
 */
public class Mobil {
    //Atribut
    String merk;
    String tahun;
    int kecepatan;
    
    //Method
    int tambah_kecepatan(int kecepatan_tambahan){
        kecepatan = kecepatan + kecepatan_tambahan;
        return kecepatan;
    }
    
    int kurangi_kecepatan (){
        kecepatan = kecepatan - 20;
        return kecepatan;
    }
    
    void berehenti(){
        System.out.println("Mobil berhasil diberhentikan...");
    }
    
}
