/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bismiirawan.project;

/**
 *
 * @author Bismi
 */
public class LatihanArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] member = {
            {"Bismi","Tasik"},
            {"Dzikri","Ciamis"},
            {"Sutanto","Bandung"}
        };

        String[][] member = new String[3][2];
        member[0][0] = "Bismi";
        member[0][1] = "Tasik";
        member[1][0] = "Dzikri";
        member[1][1] = "Ciamis";
        member[2][0] = "Sutanto";
        member[2][1] = "Bandung";
        
        for(int i = 0;i<member.length;i++){
            System.out.println("Nama : "+member[i][0]);
            System.out.println("Alamat : "+member[i][1]);
           
            System.out.println("------------------");
        }
    }
    
}
