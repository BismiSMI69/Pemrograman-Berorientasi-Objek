/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Bismi
 */
public class Dinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan h = new Hewan();
        Kucing k = new Kucing();
        Ayam a = new Ayam();
        
        h.bersuara();
        k.bersuara();
        a.bersuara();
    }
    
}
