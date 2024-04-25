package InheritanceTugas;

public class ProgramMain {
    public static void main(String[] args) {

        //testcase pekerja
        System.out.println("=============\n" + "Kelas Manusia" + "\n=============");
        Manusia manusia1 = new Manusia("alex", "456", true, true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("cindy", "123", false, true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("virly", "789", false, false);
        System.out.println(manusia3);

        //testcase mahasiswaFILKOM
        System.out.println("\n=====================\n" + "Kelas MahasiswaFILKOM" + "\n=====================");
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("235150407111032", 2.95 , "Calista Aulia", "001", false, false);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("235150407111032",3.45 , "Calista Aulia", "001", false, false);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("235150407111032",3.95 , "Calista Aulia", "001", false, false);
        System.out.println(mahasiswaFILKOM3);

        //testcase Pekerja
        System.out.println("\n=============\n" + "Kelas Pekerja" + "\n=============");
        Pekerja pekerja1 = new Pekerja(100, 2022, 1, 1, 2, "Vero", "352", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(500, 2015, 2, 2, 2, "Verlo", "765", true, true);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(800, 2004, 3, 3, 10, "Verly", "323", false, true);
        System.out.println(pekerja3);

        //testcase Manager
        System.out.println("\n=============\n" + "Kelas Manager" + "\n=============");
        Manager manager = new Manager("HRD", 7500, 2009, 1, 1, 0, "Alexander", "888", true, false);
        System.out.println(manager);
    } 
}