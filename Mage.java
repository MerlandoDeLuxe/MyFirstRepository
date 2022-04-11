package day11.task2;

import java.util.Random;

public class Mage extends Hero implements PhysAttack, MagicAttack, ThinkingBeforeDoing, DeathOfHero {
    public Mage() {
        healthOfHero = 100d;
        nameOfHero = "Маг";
        physAttack = 5;
        magicAttack = 20;
        physicalDeffence = 0d;
        magicalDeffence = 0.8;
        boolean isAlive = true;
    }

    @Override
    public double magicalAttack(Hero hero) {
        Random rndm1 = new Random();
        int rndmScore = rndm1.nextInt(2);       //Cчетчик сколько раз герой будет бить
        if (rndmScore == 0) {
            System.out.println(nameOfHero + " промахнулся!");
        }
        else {
            for (int i = 1; i <= rndmScore; i++) {
                int rndmRangeOfAttack = rndm1.nextInt(20) + 10;                  //Диапазон силы атаки ОТ и ДО
                double attackScore = rndmRangeOfAttack * (1 - hero.magicalDeffence); //Значение атаки умножается на процент пробития. для воина, например, это 0.2
                attackScore = Math.round(attackScore);                                //Округление дробного числа атаки до десятых

                if (attackScore >= hero.healthOfHero) {  //Значение удара больше здоровья игрока, по которому бьют
                    hero.healthOfHero = MIN_HEALTH;     //Установка значения здоровья MIN_HEALT = 0

                    System.out.println(nameOfHero + " наносит " + hero.nameOfHero + " " + attackScore + " урона магией!");  //Выводим на экран сколько было получено урона перед смертью

                    hero.isAlive = false;   //Устанавливаем переменной isAlive значение false = мертв
                    System.out.println(toString(hero));                 //В методе toString выводим статус Героя. Жив или Мертв
                    break;  //Если герой умер, выходим из цикла

                } else //Если герой жив, изменяем ему кол-во здоровья от удара и сообщаем об этом
                    System.out.println(nameOfHero + " наносит " + hero.nameOfHero + " " + attackScore + " урона магией!");
                hero.healthOfHero -= attackScore;   //Изменение здоровья другого героя
                System.out.println("Здоровье у " + hero.nameOfHero + " " + hero.healthOfHero);
                //System.out.println(toString(hero));                 //В методе toString выводим статус Героя. Жив или Мертв
            }
        }
        return hero.healthOfHero;
    }

    @Override
    public String DeathOfHero() {
        if (healthOfHero > 0){
            return "жив.";
        }else
            return "погиб.";
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

    @Override
    public String toString(Hero hero) {
        return "Герой " + hero.nameOfHero + " " + hero.DeathOfHero();
    }

    @Override
    public void thinkingBeforeDoing(Hero hero) {
        if (isAlive == true && hero.isAlive == true) {

            Random rndm1 = new Random();
            int physicOrmagic = rndm1.nextInt(3);   //Выбор между физическими ударами или магическими. Если 0 то физика, если 1 или 2 то магия

                if (physicOrmagic == 0) {           //Выбор между оружием
                    physicalAttack(hero);
                } else {
                    magicalAttack(hero);
            }

        } else if (isAlive == false && hero.isAlive == true) {
            System.out.print("Герой " + nameOfHero + " " + DeathOfHero() + " " + hero.nameOfHero + " победил.");
        } else if (isAlive == true && hero.isAlive == false) {
            System.out.print("Герой " + nameOfHero + " " + DeathOfHero() + " " + hero.nameOfHero + " проиграл.");
        }
    }
}
