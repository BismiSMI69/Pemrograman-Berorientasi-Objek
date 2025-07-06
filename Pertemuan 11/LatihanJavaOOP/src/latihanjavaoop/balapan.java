package latihanjavaoop;
/**
 *
 * @author Aldi
 */
public class balapan {
    public static void main(String[] args) {
        //membuat object dari class mobil
        Mobil mbl = new Mobil();
        
        //mengakses dan menggunakan atribut dari class mobil
        mbl.merk = "Toyota";
        mbl.tahun = "2019";
        mbl.kecepatan = 60;
        
        System.out.println("Merk Mobil : "  + mbl.merk);
        System.out.println("Tahun : "  + mbl.tahun);
        System.out.println("Kecepatan Awal : "  + mbl.kecepatan);
        
        //mengakses dan menggunakan method dari class mobil
        mbl.tambah_kecepatan(20);
        System.out.println("Kecepatan : "  + mbl.kecepatan);
        
        mbl.kurangi_kecepatan();
        System.out.println("Kecepatan : "  + mbl.kecepatan);
        
        mbl.kurangi_kecepatan();
        System.out.println("Kecepatan : "  + mbl.kecepatan);
        
        mbl.kurangi_kecepatan();
        System.out.println("Kecepatan : "  + mbl.kecepatan);
        
        mbl.berehenti();
    }
}
