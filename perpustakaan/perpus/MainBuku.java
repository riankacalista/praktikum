package perpustakaan.perpus;
import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Buku perpus = new Buku();
        Scanner input = new Scanner(System.in);

        System.out.println("================PERPUSTAKAAN KAMPUS C==================\n");
        System.out.printf("HALO SELAMAT DATANG DI PERPUSTAKAAN KAMPUS C \nTerdapat tujuh kategori buku, yakni:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\nMasukkan kode kategori buku : ");

        int kodeBuku = input.nextInt();
        String infoBuku = perpus.getInfoBuku(kodeBuku);
        System.out.println(infoBuku); 
    }
}
