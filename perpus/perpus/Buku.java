package perpustakaan.perpus;
import java.util.Scanner;
public class Buku {

    private String judul;
    private String penulis;
    private String jmlhHalaman;
    private String sinopsis;

    public Buku(String judul, String penulis, String jmlhHalaman, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.jmlhHalaman = jmlhHalaman;
        this.sinopsis = sinopsis;
    }

    public int hitungJmlhKataSinopsis() {
        String[] Words = sinopsis.split(" ");
        return Words.length;
    }

    public void infoTampilan(){
        System.out.println("1. Judul Buku              : " +judul);
        System.out.println("2. Penulis                 : " + penulis);
        System.out.println("3. Jumlah Halaman          : " + jmlhHalaman);
        System.out.println("4. Sinopsis                : " + sinopsis);
        System.out.println("5. Jumlah Kata di Sinopsis : " + hitungJmlhKataSinopsis());
    }

    public static void main(String[] args) {
    }

    public void kategori(Buku[] bukuArray){
        int i = 0;
        for (Buku buku : bukuArray) {
            i++;
            if (i <= bukuArray.length) 
                System.out.println("buku ke-" + i);
            buku.infoTampilan();
        }
    }


    }

