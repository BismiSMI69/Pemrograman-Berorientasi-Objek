/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import modifier.Orang;

/**
 *
 * @author Bismi
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang mhs = new Orang();
        mhs.buatNama("Bismi Sri Mulyani Irawan");
        System.out.println("Nama Mahasiswa : " + mhs.tampilNama());
    }

}
