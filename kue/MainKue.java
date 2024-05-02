public class MainKue {
    public static void main(String[] args) {
        Kue[] menuKue = new Kue[20];

        menuKue[0] = new KuePesanan("Lapis Batu", 30000.0, 2);
        menuKue[1] = new KuePesanan("Martabak Asin", 25000.0, 2.5);
        menuKue[2] = new KuePesanan("Kue Lumpur Lumpur", 20000.0, 2);
        menuKue[3] = new KuePesanan("Putu Bambu", 15000.0, 1.5);
        menuKue[4] = new KuePesanan("Kastengel Gede", 20000.0, 1.8);
        menuKue[5] = new KuePesanan("Serabi Jakarta", 25000.0, 2);
        menuKue[6] = new KuePesanan("Bolu Vanilla", 22000.0, 2);
        menuKue[7] = new KuePesanan("Lapis Merah", 28000.0, 2);
        menuKue[8] = new KuePesanan("Cotton Candy Cake", 60000.0, 1.5);
        menuKue[9] = new KuePesanan("Klepon Keju Coklat", 20000.0, 2);

        menuKue[10] = new KueJadi("Pastel Berlapis", 9000.0, 30);
        menuKue[11] = new KueJadi("Biji Salak", 17000.0, 25);
        menuKue[12] = new KueJadi("Lemper Duren", 14000.0, 40);
        menuKue[13] = new KueJadi("Sus Coklat", 12000.0, 45);
        menuKue[14] = new KueJadi("Kue Soes", 15000.0, 35);
        menuKue[15] = new KueJadi("Putu Bambu Beras", 18000.0, 30);
        menuKue[16] = new KueJadi("Pukis Pisang", 15000.0, 40);
        menuKue[17] = new KueJadi("Lapis Legit", 12000.0, 45);
        menuKue[18] = new KueJadi("Martabak Spesial", 22000.0, 20);
        menuKue[19] = new KueJadi("Wajik Beras", 20000.0, 35);

        System.out.println("Daftar Kue:");
        for (Kue kue : menuKue) {
            System.out.println(kue);
            System.out.println();
        }
        
        // Total harga semua jenis kue
        double totalHarga = hitungTotalHarga(menuKue);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("======================");
        
        // Total harga dan total berat dari KuePesanan
        double totalHargaPesanan = hitungTotalHargaKuePesanan(menuKue);
        double totalBeratPesanan = hitungTotalBeratKuePesanan(menuKue);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);
        System.out.println("======================");
        
        // Total harga dan total jumlah dari KueJadi
        double totalHargaJadi = hitungTotalHargaKueJadi(menuKue);
        double totalJumlahJadi = hitungTotalJumlahKueJadi(menuKue);
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
        System.out.println("======================");
        
        Kue kueTerbesar = cariKueDenganHargaTertinggi(menuKue);
        if (kueTerbesar != null) {
            System.out.println("Kue dengan harga terbesar: ");
            System.out.println(kueTerbesar);
        }
    }
    
    // Total harga semua jenis kue
    public static double hitungTotalHarga(Kue[] kueArray) {
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            if (kue != null) {
                totalHarga += kue.hitungHarga();
            }
        }
        return totalHarga;
    }
    
    // Total harga kue pesanan
    public static double hitungTotalHargaKuePesanan(Kue[] kueArray) {
        double totalHargaPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
            }
        }
        return totalHargaPesanan;
    }
    
    // Total berat kue pesanan
    public static double hitungTotalBeratKuePesanan(Kue[] kueArray) {
        double totalBeratPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalBeratPesanan += ((KuePesanan) kue).berat;
            }
        }
        return totalBeratPesanan;
    }
    
    // Total harga kue jadi
    public static double hitungTotalHargaKueJadi(Kue[] kueArray) {
        double totalHargaJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
            }
        }
        return totalHargaJadi;
    }
    
    // Total jumlah kue jadi
    public static double hitungTotalJumlahKueJadi(Kue[] kueArray) {
        double totalJumlahJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalJumlahJadi += ((KueJadi) kue).jumlah;
            }
        }
        return totalJumlahJadi;
    }

    public static Kue cariKueDenganHargaTertinggi(Kue[] kueArray) {
        double maxHarga = 0;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue != null && kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        return kueTerbesar;}
}

