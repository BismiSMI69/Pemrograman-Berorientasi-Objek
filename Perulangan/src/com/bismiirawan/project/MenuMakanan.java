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
public class MenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  scan= new Scanner(System.in);
        
        int input = 0;
        
        while(input != 5) {
            System.out.println("==========Menu Makanan==========");
            System.out.println("1. Ayam Goreng");
            System.out.println("2. Ayam Bakar");
            System.out.println("3. Ayam Panggang");
            System.out.println("4. Ayam Rebus");
            System.out.println("5. Keluar");
            
            System.out.print("Pilih Menu(Masukkan Angka) : ");
            input = scan.nextInt();
            
            if(input == 1) {
                System.out.println("Menu Yang Dipilih : Ayam Goreng");
            } else if(input == 2) {
                System.out.println("Menu Yang Dipilih : Ayam Bakar");
            } else if(input == 3) {
                System.out.println("Menu Yang Dipilih : Ayam Panggang");
            } else if(input == 4) {
                 System.out.println("Menu Yang Dipilih : Ayam Rebus");
            } else if(input == 5) {     
                System.out.println("Selamat Tinggal..");
            } else {
                System.out.println("Anda salah input!!!");
            }
        }
    }
}


