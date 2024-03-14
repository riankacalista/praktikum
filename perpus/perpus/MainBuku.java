package perpustakaan.perpus;

import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {

        Buku perpus = new Buku("judul", "penulis", "jmlhHalaman", "sinopsis");
        Scanner input = new Scanner(System.in);

        String informasi = "";
        int kodeBuku;

    do {
        System.out.println("================PERPUSTAKAAN KAMPUS C==================\n");
        System.out.printf("HALO SELAMAT DATANG DI PERPUSTAKAAN KAMPUS C \nTerdapat tujuh kategori buku, yakni:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\n 8. Keluar dari kode program\nMasukkan kode kategori buku : ");

        kodeBuku = input.nextInt();
        
        switch (kodeBuku) {
            case 1:
            Buku buku1Technology = new Buku("Advanced Java Programming", "Sarah Williams", "320", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
            Buku buku2Technology = new Buku("Data Science with Python and Pandas", "Michael Johnson", "280", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna");
            Buku buku3Technology = new Buku("Introduction to Machine Learning", "Jessica Miller", "220", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut");
            Buku buku4Technology = new Buku("Full-Stack Web Development", "Christopher Davis", "200", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore");
            Buku buku5Technology = new Buku("Network Security Essentials", "Rachel Taylor", "240", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
            Buku[] bukuArrayTechnology = {buku1Technology, buku2Technology, buku3Technology, buku4Technology, buku5Technology};
            perpus.kategori(bukuArrayTechnology);
            break;

            case 2:
            Buku buku1Philosophy = new Buku("The Art of Stoicism", "Olivia Thompson", "220", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
            Buku buku2Philosophy = new Buku("Philosophy Through Children's Eyes", "Samuel Robinson", "380", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
            Buku buku3Philosophy = new Buku("Plato's Allegory of the Cave", "Emily Turner", "300", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim");
            Buku buku4Philosophy = new Buku("Nietzschean Reflections", "Benjamin White", "260", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
            Buku buku5Philosophy = new Buku("Kantian Metaphysics", "Victoria Smith", "480", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
            Buku[] bukuArrayPhilosophy = {buku1Philosophy, buku2Philosophy, buku3Philosophy, buku4Philosophy, buku5Philosophy};
            perpus.kategori(bukuArrayPhilosophy);
            break;

            case 3:
            Buku  buku1History= new Buku("The Untold Stories of American History", "Jennifer Parker", "750", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
            Buku  buku2History= new Buku("Exploring Ancient Civilizations", "Robert Turner", "600", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et");
            Buku  buku3History= new Buku("Human Evolution: A Comprehensive History", "Sandra Adams", "450", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
            Buku  buku4History= new Buku("The World Wars: An In-Depth Analysis", "Edward Collins", "1200", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis");
            Buku  buku5History= new Buku("The Global Impact of the Silk Roads", "Olivia Bennett", "950", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
            Buku[] bukuArrayHistory = {buku1History, buku2History, buku3History, buku4History, buku5History};
            perpus.kategori(bukuArrayHistory);
            break;

            case 4:
            Buku buku1Religion = new Buku("The Prophet's Legacy Unveiled", "Ahmed Ali", "380", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
            Buku buku2Religion = new Buku("Journeys to Spiritual Enlightenment", "Fatima Khan", "320", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore");
            Buku buku3Religion = new Buku("Mecca: A Spiritual Pilgrimage", "Muhammad Hasan", "450", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et");
            Buku buku4Religion = new Buku("Islamic Philosophy and Ethics", "Aisha Malik", "180", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
            Buku buku5Religion = new Buku("In Search of Muhammad's Footprints", "Abdullah Rahman", "420", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do");
            Buku[] bukuArrayReligion = {buku1Religion, buku2Religion, buku3Religion, buku4Religion, buku5Religion};
            perpus.kategori(bukuArrayReligion);
            break;

            case 5:
            Buku buku1Psychology = new Buku("The Quest for Personal Fulfillment", "Erica Mitchell", "280", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim");
            Buku buku2Psychology = new Buku("Cognitive Psychology in Everyday Life", "Simon Turner", "550", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis");
            Buku buku3Psychology = new Buku("Mastering Habits for Success", "Michelle Davis", "400", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do");
            Buku buku4Psychology = new Buku("The Art and Science of Persuasion", "Richard Johnson", "300", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim");
            Buku buku5Psychology = new Buku("Embracing the Strength of Introversion", "Laura Turner", "420", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi");
            Buku[] bukuArrayPsychology = {buku1Psychology, buku2Psychology, buku3Psychology, buku4Psychology, buku5Psychology};
            perpus.kategori(bukuArrayPsychology);
            break;

            case 6:
            Buku buku1Politics = new Buku("Indonesia's Political Landscape", "Rachel Lim", "420", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad");
            Buku buku2Politics = new Buku("Diplomacy in Southeast Asia", "Benjamin Tan", "310", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do");
            Buku buku3Politics = new Buku("Kings and Subjects: Power Dynamics in Nusantara", "Nadia Putri", "360", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim");
            Buku buku4Politics = new Buku("Radicalism and Governance in Indonesia", "Zachary Brown", "300", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco");
            Buku buku5Politics = new Buku("Legal Systems Across Indonesian Society", "Lindsey Miller", "380", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
            Buku[] bukuArrayPolitics = {buku1Politics, buku2Politics, buku3Politics, buku4Politics, buku5Politics};
            perpus.kategori(bukuArrayPolitics);
            break;

            case 7:
            Buku buku1Fiction = new Buku("The Mockingbird's Melody", "Olivia Harper", "400", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi");
            Buku buku2Fiction = new Buku("2050: A Dystopian Vision", "Alex Orwell", "360", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim");
            Buku buku3Fiction = new Buku("Gatsby's Enigma", "Scott Fitzgerald Jr.", "240", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad");
            Buku buku4Fiction = new Buku("The Wizarding World Chronicles", "R.K. Johnston", "380", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco");
            Buku buku5Fiction = new Buku("The Rings of Destiny", "Sarah Tolkien", "900", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do");
            Buku[] bukuArrayFiction = {buku1Fiction, buku2Fiction, buku3Fiction, buku4Fiction, buku5Fiction};
            perpus.kategori(bukuArrayFiction);
            break;
            
            case 8:
            System.out.println("Terima kasih telah menggunakan layanan Perpustakaan C.");
            break;
        
        default:
            informasi = "Kode buku tidak ditemukan. Silakan input kode buku yang tertera \n";
            System.out.println(informasi);
            break;
        }
    }  while (kodeBuku != 8);
}
}
    
