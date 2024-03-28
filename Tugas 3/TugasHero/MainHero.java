package TugasHero;
import java.util.Scanner;
import TugasHero.Hero;

public class MainHero {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean LoopingHero = true;
            System.out.println("Permainan adu hero");
    
            Hero hero1 = new Hero();
            do {
                System.out.println("Player 1: Silahkan masukkan hero Anda!");
                System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
                System.out.println("==================================");
    
                try {
                    System.out.print("Nama Hero           : ");
                    hero1.setName(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("\nERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
                
                try {
                    System.out.print("Health              : ");
                    double health1 = scanner.nextDouble();
                    scanner.nextLine();
                    if (health1 >= 0 && health1 <= 500) {
                        hero1.setHealthPoint(health1);
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("ERROR: Input tidak valid");
                        System.out.println("==============================");
                        scanner.nextLine();
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
                
                try {
                    System.out.print("Attack              : ");
                    double power1 = scanner.nextDouble();
                    scanner.nextLine();
                    if (power1 >= 0 && power1 <= 500) {
                        hero1.setAttack(power1);
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("ERROR: Input tidak valid");
                        System.out.println("==============================");
                        scanner.nextLine();
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
    
                try {
                    System.out.print("Defense             : ");
                    double defense1 = scanner.nextDouble();
                    scanner.nextLine();
                    if (defense1 >= 0 && defense1 <= 500) {
                        hero1.setDefense(defense1);
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("ERROR: Input tidak valid");
                        System.out.println("==============================");
                        scanner.nextLine();
                        continue;
                    }
    
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
                System.out.println("==============================================================");
    
                LoopingHero = false;
            } while (LoopingHero);
    
    
            String name2 = "";
            double inputHealth2 = 0;
            double inputPower2 = 0;
            double inputDefense2 = 0;
    
            double health2 = 0;
            double power2 = 0;
            double defense2 = 0;
    
            LoopingHero = true;
    
            do {
                System.out.println("\nPermainan adu hero");
                System.out.println("Player 2: Silahkan masukkan hero Anda!");
                System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
                System.out.println("==================================");
    
                try {
                    System.out.print("Nama Hero           : ");
                    name2 = scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
                
                try {
                    System.out.print("Health Point        : ");
                    inputHealth2 = scanner.nextDouble();
                    scanner.nextLine();
                    if (inputHealth2 >= 0 && inputHealth2 <= 500) {
                        health2 = inputHealth2;
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("ERROR: Input tidak valid");
                        System.out.println("==============================");
                        scanner.nextLine();
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
                
                try {
                    System.out.print("Attack              : ");
                    inputPower2 = scanner.nextDouble();
                    scanner.nextLine();
                    if (inputPower2 >= 0 && inputPower2 <= 500) {
                        power2 = inputPower2;
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("ERROR: Input tidak valid");
                        System.out.println("==============================");
                        scanner.nextLine();
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
    
                try {
                    System.out.print("Defense             : ");
                    inputDefense2 = scanner.nextDouble();
                    scanner.nextLine();
                    if (inputDefense2 >= 0 && inputDefense2 <= 500) {
                        defense2 = inputDefense2;
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("ERROR: Input tidak valid");
                        System.out.println("==============================");
                        scanner.nextLine();
                        continue;
                    }
    
                } catch (Exception e) {
                    System.out.println("==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scanner.nextLine();
                    continue;
                }
                System.out.println("==============================================================");
    
                LoopingHero = false;
            } while (LoopingHero);
    
            Hero hero2 = new Hero(name2, health2, power2, defense2);
    
            System.out.println("==============================================================");
    
            double round = 1;
            double hero1Health = 0;
            double hero2Health = 0;
            while (hero1.getHealthPoint() >= 0 && hero2.getHealthPoint() >= 0) {
                System.out.println("\n====================================");
                System.out.println("Ronde " + round++);
                System.out.println(hero1.getName() + " menyerang " + hero2.getName() + "!\n");
        
                System.out.printf("%-30s: %.3f\n", hero1.getName() + " menyerang sebesar", hero1.getAttack());
                System.out.printf("%-30s: %.3f\n", hero2.getName() + " pertahanan sebesar", hero2.getDefense());
                hero1.attack(hero2);
    
                hero2Health = Math.max(hero2.getHealthPoint(), 0);
                System.out.printf("%-30s: %.3f\n", "Health " + hero2.getName() + " saat ini", hero2Health);
            
                System.out.println();
                System.out.println(hero2.getName() + " menyerang " + hero1.getName() + "!\n");
            
                System.out.printf("%-30s: %.3f\n", hero2.getName() + " menyerang sebesar", hero2.getAttack());
                System.out.printf("%-30s: %.3f\n", hero1.getName() + " pertahanan sebesar", hero1.getDefense());
                hero2.attack(hero1);
    
                hero1Health = Math.max(hero1.getHealthPoint(), 0);
                System.out.printf("%-30s: %.3f\n", "Health " + hero1.getName() + " saat ini", hero1Health);
                System.out.println("====================================\n");
    
                if (hero1.getHealthPoint() <= 0 || hero2.getHealthPoint() <= 0) {
                    break;
                }
            }
            
    
            System.out.println("Pertarungan telah usai! ");
            if (hero1.getHealthPoint() > 0) {
                System.out.println("Pemenang: " + hero1.getName());
                System.out.println("Sisa health: " + hero1Health);
            } else {
                System.out.println("Pemenang: " + hero2.getName());
                System.out.println("Sisa health: " + hero2Health);
            }
            System.out.println("==============================================================");
    
            scanner.close();
        }

}




