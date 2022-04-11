package day11.task2;

public abstract class Hero implements DeathOfHero {
    public final static int MAX_HEALTH = 100;
    public final static int MIN_HEALTH = 0;
    public String nameOfHero;
    double healthOfHero = 0d;
    int physAttack;
    int magicAttack;
    double physicalDeffence = 0d;
    double magicalDeffence = 0d;
    double healHimself = 0d;
    double healTeammate = 0d;
    boolean isAlive = true;


    public String toString(Hero hero) {
        return "Герой " + hero.nameOfHero + " " + hero.DeathOfHero();
    }

    @Override
    public String DeathOfHero() {
        return null;
    }
}
