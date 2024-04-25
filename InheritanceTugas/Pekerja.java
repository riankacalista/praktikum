package InheritanceTugas;
import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate thnMasuk;
    private int jmlAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jmlAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.thnMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jmlAnak = jmlAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setThnMasuk(LocalDate thnMasuk) {
        this.thnMasuk = thnMasuk;
    }

    public LocalDate getThnMasuk() {
        return thnMasuk;
    }

    public void setJmlAnak(int jmlAnak) {
        this.jmlAnak = jmlAnak;
    }
  
    public int getJmlAnak() {
        return jmlAnak;
    }

    public double getBonus(){
        int tahun = LocalDate.now().getYear() - thnMasuk.getYear();
        if (tahun >= 0 && tahun <= 5){
            return 0.05 * gaji;
        }
        else if (tahun > 5 && tahun <= 10){
            return 0.10 * gaji;
        }
        else if (tahun > 10){
            return 0.15 * gaji;
        }
        else{
            return 0;
        }
    }

    public double getPendapatan(){
        return super.getPendapatan() + getGaji() + getBonus() + (getJmlAnak() * 20);
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk: " + getThnMasuk() + "\nJumlah Anak: " + getJmlAnak() + "\nGaji: $" + getGaji();
    }
}