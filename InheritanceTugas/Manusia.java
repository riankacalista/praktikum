package InheritanceTugas;

public class Manusia {
    private String nama;
    private boolean jnsKelamin;
    private String nik;
    private boolean menikah;

    public Manusia() {
    }

    public Manusia(String nama, String nik, boolean jnsKelamin, boolean menikah) {
        this.nama = nama;
        this.jnsKelamin = jnsKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jnsKelamin) {
        this.jnsKelamin = jnsKelamin;
    }

    public boolean getJenisKelamin() {
        return jnsKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jnsKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        String jnsKelaminStr = (jnsKelamin) ? "Laki-laki" : "Perempuan";
        return "\nNama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + jnsKelaminStr + "\nPendapatan\t: $" + getPendapatan();
    }
}