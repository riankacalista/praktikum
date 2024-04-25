package InheritanceTugas;
public class MahasiswaFILKOM extends Manusia{
    
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }


    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String prodiName = "";
        switch (prodi) {
            case 2: prodiName = "Teknik Informatika"; break;
            case 3: prodiName = "Teknik Komputer"; break;
            case 4: prodiName = "Sistem Informasi"; break;
            case 6: prodiName = "Pendidikan Teknologi Informasi"; break;
            case 7: prodiName = "Teknologi Informasi"; break;
            default: prodiName = "Unknown";
        }
        return prodiName + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nNIM\t\t: " + nim + "\nIPK\t\t: " + ipk + "\nStatus\t\t: " + getStatus();
    }
}