package Instansi;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program penggajian pegawai
**/
import java.util.Scanner;
public class ProgramGaji {
    public static void main(String[] args) {
        // instance the object
        Scanner scan = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jl. Semar dlm 4 No 72/66");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        pegawai.setTotalGaji(pegawai.totalGaji(pegawai.getUangTransport(),pegawai.getUangTunjangan(), pegawai.getGajiPokok()));
        pegawai.tampilData(pegawai.getNama(),pegawai.getAlamat(),pegawai.getUangTransport(),pegawai.getUangTunjangan(),pegawai.getGajiPokok(),pegawai.getTotalGaji());
        
    }
    
}
