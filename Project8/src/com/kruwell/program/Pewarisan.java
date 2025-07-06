/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kruwell.program;

/**
 *
 * @author Bismi
 */
class BangunRuang {
    String nama;
    
    float volume(){
        System.out.println("Menghitung Volume Bangun Ruang " + nama);
        return 0;
    }
    
    float keliling() {
        System.out.println("Menghitung Keliling Bangun Ruang " + nama);
        return 0;
    }
}

class Kubus extends BangunRuang {
    int sisi;
    
    @Override
    float volume() {
        float volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
        return volume;
    }
    
    @Override
    float keliling() {
        float keliling = 12 * sisi;
        System.out.println("Keliling Kubus : " +keliling);
        return keliling;
    }
}

class Balok extends BangunRuang {
    int p, l, t;
    
    @Override
    float volume() {
        float volume = p * l * t;
        System.out.println("Volume Balok : " + volume);
        return volume;
    }
    
    @Override
    float keliling() {
        float keliling = 4 * (p + l + t);
        System.out.println("Keliling Balok : " +keliling);
        return keliling;
    }
}

class Tabung extends BangunRuang {
    int r, t;
    
    @Override
    float volume() {
        float volume = 3.14f * r * r * t;
        System.out.println("Volume Tabung : " + volume);
        return volume;
    }
    
    @Override
    float keliling() {
        float keliling = 2 * 3.14f * r;
        System.out.println("Keliling Tabung : " +keliling);
        return keliling;
    }
}

public class Pewarisan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        kbs.nama  = "Kubus 1";
        kbs.sisi = 20;
        kbs.volume();
        kbs.keliling();
        
        Balok b = new Balok();
        b.nama = "Balok 1";
        b.p = 20;
        b.l = 15;
        b.t = 5;
        b.volume();
        b.keliling();
        
        Tabung tbg = new Tabung();
        tbg.nama = "Tabung 1";
        tbg.r = 10;
        tbg.t = 20;
        tbg.volume();
        tbg.keliling();
    }
    
}
