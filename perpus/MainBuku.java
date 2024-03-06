package perpustakaan.perpus;
import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Buku perpus = new Buku();
        Scanner input = new Scanner(System.in);
        int kodeBuku;
        do{
        System.out.println("================PERPUSTAKAAN KAMPUS C==================\n");
        System.out.printf("HALO SELAMAT DATANG DI PERPUSTAKAAN KAMPUS C \nTerdapat tujuh kategori buku, yakni:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\n 8. Keluar dari kode program\nMasukkan kode kategori buku : ");

        kodeBuku = input.nextInt();
        if (kodeBuku != 8) {
            String infoBuku = perpus.getInfoBuku(kodeBuku);
            System.out.println(infoBuku);
        } 
        else {
            System.out.println("Terima kasih telah menggunakan layanan Perpustakaan Kampus C.");
        }
        
        } while (kodeBuku !=8);
    }
}
