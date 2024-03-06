package perpustakaan.perpus;

public class Buku {
    public String[][] technology = {
        {"Advanced Java Programming", "Sarah Williams", "320"},
        {"Data Science with Python and Pandas", "Michael Johnson", "280"},
        {"Introduction to Machine Learning", "Jessica Miller", "220"},
        {"Full-Stack Web Development", "Christopher Davis", "200"},
        {"Network Security Essentials", "Rachel Taylor", "240"}
    };
    public String[][] philosophy = {
        {"The Art of Stoicism", "Olivia Thompson", "220"},
        {"Philosophy Through Children's Eyes", "Samuel Robinson", "380"},
        {"Plato's Allegory of the Cave", "Emily Turner", "300"},
        {"Nietzschean Reflections", "Benjamin White", "260"},
        {"Kantian Metaphysics", "Victoria Smith", "480"}
    };
    public String[][] history = {
        {"The Untold Stories of American History", "Jennifer Parker", "750"},
        {"Exploring Ancient Civilizations", "Robert Turner", "600"},
        {"Human Evolution: A Comprehensive History", "Sandra Adams", "450"},
        {"The World Wars: An In-Depth Analysis", "Edward Collins", "1200"},
        {"The Global Impact of the Silk Roads", "Olivia Bennett", "950"}
    };
    public String[][] religion = {
        {"The Prophet's Legacy Unveiled", "Ahmed Ali", "380"},
        {"Journeys to Spiritual Enlightenment", "Fatima Khan", "320"},
        {"Mecca: A Spiritual Pilgrimage", "Muhammad Hasan", "450"},
        {"Islamic Philosophy and Ethics", "Aisha Malik", "180"},
        {"In Search of Muhammad's Footprints", "Abdullah Rahman", "420"}
    };
    public String[][] psychology = {
        {"The Quest for Personal Fulfillment", "Erica Mitchell", "280"},
        {"Cognitive Psychology in Everyday Life", "Simon Turner", "550"},
        {"Mastering Habits for Success", "Michelle Davis", "400"},
        {"The Art and Science of Persuasion", "Richard Johnson", "300"},
        {"Embracing the Strength of Introversion", "Laura Turner", "420"}
    };
    public String[][] politics = {
        {"Indonesia's Political Landscape", "Rachel Lim", "420"},
        {"Diplomacy in Southeast Asia", "Benjamin Tan", "310"},
        {"Kings and Subjects: Power Dynamics in Nusantara", "Nadia Putri", "360"},
        {"Radicalism and Governance in Indonesia", "Zachary Brown", "300"},
        {"Legal Systems Across Indonesian Society", "Lindsey Miller", "380"}
    };
    public String[][] fiction = {
        {"The Mockingbird's Melody", "Olivia Harper", "400"},
        {"2050: A Dystopian Vision", "Alex Orwell", "360"},
        {"Gatsby's Enigma", "Scott Fitzgerald Jr.", "240"},
        {"The Wizarding World Chronicles", "R.K. Johnston", "380"},
        {"The Rings of Destiny", "Sarah Tolkien", "900"}
    };
    
public String getInfoBuku(int kodeBuku) {
    String info = "";
    
    switch (kodeBuku) {
        case 1:
            info = "\nKategori buku: Teknologi\n";
            info += "========================\n";
            for (String[] buku : technology) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        case 2:
            info = "Kategori buku: Filsafat\n";
            info += "========================\n";
            for (String[] buku : philosophy) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        case 3:
            info = "Kategori buku: Sejarah\n";
            info += "========================\n";
            for (String[] buku : history) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        case 4:
            info = "Kategori buku: Agama\n";
            info += "========================\n";
            for (String[] buku : religion) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        case 5:
            info = "Kategori buku: Psikologi\n";
            info += "========================\n";
            for (String[] buku : psychology) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        case 6:
            info = "Kategori buku: Politik\n";
            info += "========================\n";
            for (String[] buku : politics) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        case 7:
            info = "Kategori buku: Fiksi\n";
            info += "========================\n";
            for (String[] buku : fiction) {
                info += "Judul Buku: " + buku[0] + "\n";
                info += "Penulis Buku: " + buku[1] + "\n";
                info += "Jumlah Halaman Buku: " + buku[2] + "\n\n";
            }
            break;
        default:
            info = "Kode buku tidak ditemukan.";
            break;
    } 
    return info;
}
}

