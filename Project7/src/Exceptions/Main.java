/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();

        // Exception handling
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d: %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }

        // Running error
        System.out.println("Handling IO not found");
        try {
            FileInputStream fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }

        // Menggabungkan dua exception
        System.out.println("Menggabungkan dua buah exception");
        try {
            System.out.printf("indek ke-%d: %d\n", index, array[index]);
            FileInputStream fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } catch (Exception e) {
            System.err.println("File tidak ditemukan");
        }

        // finally
        try {
            System.out.printf("indek ke-%d: %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("Akhir dari program");
    }
}
  

