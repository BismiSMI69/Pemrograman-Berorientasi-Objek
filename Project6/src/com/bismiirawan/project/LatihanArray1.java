/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

/**
 *
 * @author Bismi
 */
public class LatihanArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] buah = {"Anggur","Apel","Jeruk","Melon","Semangka"};
        
        String[] buah2 = {"Anggur","Apel","Jeruk","Melon","Semangka"};
        
        String[] buah3 = new String[3];
        buah3[0] = "Anggur";
        buah3[1] = "Apel";
        buah3[2] = "Jeruk";
        //buah3[3] = "Melon";
        
        //System.out.println(buah3[0]);
        //System.out.println(buah3[1]);
        //System.out.println(buah3[2]);
        
        buah[3] = "Mangga";
        
        for(int i = 0;i<buah.length;i++){
            System.out.println(buah[i]);
        }
    }
    
}
