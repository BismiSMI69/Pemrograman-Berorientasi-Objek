/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread;

/**
 *
 * @author Bismi
 */
public class tampil extends Thread{
    public void run()
    {
        try
            {
             for(int x=1; x<=10;x++)
                {
                    System.out.println("Angka ke - "+x);
                    Thread.sleep(1000); //waktu eksekusi millisecond
                }
            } catch(Exception exc)
            {
             exc.printStackTrace();
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampil out=new tampil();
        
        out.start();
    }
    
}
