package TugasHero;

public class Hero {

    private String name;
    private double healthPoint;
    private double attack;
    private double defense;

    public Hero(){
        this.name = "Hero";
        this.healthPoint = 100;
        this.attack = 10;
        this.defense = 5;
    }

    public Hero(String name, double healthPoint, double attack, double defense) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void attack(Hero enemy) {
        double damage = this.attack - enemy.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        enemy.setHealthPoint(enemy.getHealthPoint() - damage);
        // enemy.setHealthPoint(enemy.getHealthPoint() - (this.attack - enemy.getDefense()));
    }
    
    public void display() {
        System.out.println("Name            : " + this.name);
        System.out.println("Health Point    : " + this.healthPoint);
        System.out.println("Attack          : " + this.attack);
        System.out.println("Defense         : " + this.defense);}
}


