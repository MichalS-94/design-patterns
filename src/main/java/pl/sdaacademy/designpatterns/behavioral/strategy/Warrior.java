package pl.sdaacademy.designpatterns.behavioral.strategy;

public class Warrior {
    private String name;
    private HitStrategy hitStrategy;

    public Warrior(String name, HitStrategy hitStrategy) {
        this.name = name;
        this.hitStrategy = hitStrategy;
    }

    public String getName() {
        return name;
    }

    public void hit() {
       hitStrategy.hit();
    }

    public void setHitStrategy(HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
    }
}
