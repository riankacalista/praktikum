class KueJadi extends Kue {
    double jumlah;
    
    KueJadi(String nama, double harga, double jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    @Override
    double hitungHarga() {
        return harga * jumlah;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nJenis: kueJadi";}
}
