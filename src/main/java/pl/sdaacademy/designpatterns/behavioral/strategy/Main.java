package pl.sdaacademy.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("ABC", new PunchStrategy());
        warrior.hit();
        warrior.setHitStrategy(new SwordSwingStrategy());
        warrior.hit();
        warrior.setHitStrategy(() -> System.out.println("Customowy sposób uderzenia"));
        warrior.hit();
    }
}
