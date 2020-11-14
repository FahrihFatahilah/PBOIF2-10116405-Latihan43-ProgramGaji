package Instansi;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program penggajian pegawai
**/
public class Pegawai {
    // declare the atribut of class
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;
    
    // build up the method
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport(){
        return uangTransport;
    }
    
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan(){
        return uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTransport,int uangTunjangan, int gajiPokok){
        return uangTransport + uangTunjangan + gajiPokok;
    }
    
    public void tampilData(String nama,String alamat,int uangTransport,int uangTunjangan, int gajiPokok, int totalGaji){        
        System.out.printf("### Data Gaji Karyawan PT. KAKATU ###\n");
        System.out.printf("---------------------------------\n");
        System.out.printf("Nama Karyawan : %s\n", nama);
        System.out.printf("Alamat : %s\n", alamat);
        System.out.printf("Uang Transport : Rp. %d\n", uangTransport);
        System.out.printf("Uang Tunjangan : Rp. %d\n", uangTunjangan);
        System.out.printf("Gaji Pokok : Rp. %d\n", gajiPokok);
        System.out.printf("Total Gaji : Rp. %d\n", totalGaji);
    }
}
