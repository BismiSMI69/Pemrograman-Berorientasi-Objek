/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

import java.util.ArrayList;
/**
 *
 * @author Bismi
 */
public class LatihanArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //mendefinisikan ayyar list
        ArrayList dataku = new ArrayList();
        
        //memasukkan data
        dataku.add("Bismi Sri Mulyani Irawan");
        dataku.add(21);
        dataku.add(45.2);
        dataku.add(true);
        
        //menmpilkan semua data
        System.out.println(dataku);
        
        //mengubah data pada ArrayList
        dataku.set(1, 40);
        System.out.println(dataku);
        
        //menghapus data pada AttayList
        //dataku.remove(true);
        dataku.remove(3);
        System.out.println(dataku);
        
        //melihat panjang ArrayList
        System.out.println("ArrayList dataku memiliki : " + dataku.size() + " item");
        
        //mengambil 1 data berdasarkan index
        System.out.println(dataku.get(0));
    }
}
