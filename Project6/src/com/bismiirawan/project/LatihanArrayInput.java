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
public class LatihanArrayInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] siswa = new String[5];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0;i<siswa.length;i++){
            System.out.print("Nama Siswa Ke-"+i+" : ");
            siswa[i] = scan.nextLine();       
    }
        
        System.out.println("");
        System.out.println("----- Data Siswa -----");
        
        for(String s:siswa){
            System.out.println(s);
        }
    } 
}
