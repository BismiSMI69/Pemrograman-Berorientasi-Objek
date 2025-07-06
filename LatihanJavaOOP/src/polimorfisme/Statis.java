/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Bismi
 */
public class Statis {
    static int penjumlahan(int x, int y){
        return x + y ;
    }
    static double penjumlahan(double x, double y){
        return x + y;
    }
    static int penjumlahan(int a, int b, int c){
        return a + b + c ;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil1 = penjumlahan(10,8);
        double hasil2 = penjumlahan(12.5, 2.5);
        int hasil3 = penjumlahan(5, 6, 10);
        
        System.out.println("Hasil Penjumlahan (int) : " + hasil1);
        System.out.println("Hasil Penjumlahan (double) : " + hasil2);
        System.out.println("Hasil Penjumlahan (int) : " + hasil3);
    }  
}
