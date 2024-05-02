abstract class Kue {
    String nama;
    double harga;
    
    abstract double hitungHarga();
    
    @Override
    public String toString() {
        return "Nama: " + nama + "\nHarga: " + harga;}
    }