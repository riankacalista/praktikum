class KuePesanan extends Kue {
    double berat;
    
    KuePesanan(String nama, double harga, double berat) {
        this.nama = nama;
        this.harga = harga;
        this.berat = berat;
    }
    
    @Override
    double hitungHarga() {
        return harga * berat;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nJenis: kuePesanan";}
}