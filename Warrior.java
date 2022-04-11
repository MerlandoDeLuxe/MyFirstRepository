package day11.task2;

import java.util.Random;

public class Warrior extends Hero implements PhysAttack, ThinkingBeforeDoing, DeathOfHero {
    public Warrior() {
        healthOfHero = 100d;
        nameOfHero = "Воин";
        physAttack = 30;
        physicalDeffence = 0.65d;
        magicalDeffence = 0d;
        boolean isAlive = true;
    }

    @Override
    public double physicalAttack(Hero hero) {
        Random rndm1 = new Random();
        int rndmScore = rndm1.nextInt(2);       //Cчетчик сколько раз герой будет бить
        if (rndmScore == 0) {

            System.out.println(nameOfHero + " промахнулся!");
        } else {
            for (int i = 1; i <= rndmScore; i++) {
                int rndmRangeOfAttack = rndm1.nextInt(20) + 10;                  //Диапазон силы атаки ОТ и ДО
                double attackScore = rndmRangeOfAttack * (1 - hero.physicalDeffence); //Значение атаки умножается на процент пробития. для воина, например, это 0.2
                attackScore = Math.round(attackScore);                                //Округление дробного числа атаки до десятых

                if (attackScore >= hero.healthOfHero) {  //Значение удара больше здоровья игрока, по которому бьют
                    hero.healthOfHero = MIN_HEALTH;     //Установка значения здоровья MIN_HEALT = 0

                    System.out.println(nameOfHero + " наносит по " + hero.nameOfHero + " " + attackScore + " физического урона!");  //Выводим на экран сколько было получено урона перед смертью

                    hero.isAlive = false;   //Устанавливаем переменной isAlive значение false = мертв
                    System.out.println(toString(hero));                 //В методе toString выводим статус Героя. Жив или Мертв
                    break;  //Если герой умер, выходим из цикла

                } else //Если герой жив, изменяем ему кол-во здоровья от удара и сообщаем об этом
                    System.out.println(nameOfHero + " наносит " + hero.nameOfHero + " " + attackScore + " физического урона!");
                hero.healthOfHero -= attackScore;   //Изменение здоровья другого героя
                System.out.println("Здоровье у " + hero.nameOfHero + " " + hero.healthOfHero);
                //System.out.println(toString(hero));                 //В методе toString выводим статус Героя. Жив или Мертв
            }
        }
        return hero.healthOfHero;
    }

    public String toString(Hero hero) {
        return "Герой " + hero.nameOfHero + " " + hero.DeathOfHero();
    }

    @Override
    public String DeathOfHero() {   //Проверка жив этот герой или нет
        if (healthOfHero > MIN_HEALTH) {
            return "жив.";
        } else
            isAlive = false;
        return "погиб.";
    }

    @Override
    public void thinkingBeforeDoing(Hero hero) {
        if (isAlive == true && hero.isAlive == true) {
            physicalAttack(hero);
        } else if (isAlive == false && hero.isAlive == true) {
            System.out.print("Герой " + nameOfHero + " " + DeathOfHero() + " " + hero.nameOfHero + " победил.");
        } else if (isAlive == true && hero.isAlive == false) {
            System.out.print("Герой " + nameOfHero + " " + DeathOfHero() + " " + hero.nameOfHero + " проиграл.");
        }
    }
}
