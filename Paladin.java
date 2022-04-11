package day11.task2;

import java.util.Random;

public class Paladin extends Hero implements PhysAttack, Healer, ThinkingBeforeDoing, DeathOfHero {

    public Paladin() {
        healthOfHero = 100d;
        nameOfHero = "Паладин";
        physAttack = 15;
        physicalDeffence = 0.5d;
        magicalDeffence = 0.2d;
        healHimself = 25;
        healTeammate = 10;
        boolean isAlive = true;
    }

    @Override
    public void healHimself() {
        Random rndm1 = new Random();
        int healScore = rndm1.nextInt(15) + 10;

        if (healthOfHero + healScore > 100) {
            healthOfHero = 100;
            System.out.println(nameOfHero + " вылечился на " + healScore + ". Здоровье = " + healthOfHero);
        } else {
            healthOfHero += healScore;
            System.out.println(nameOfHero + " вылечился на " + healScore + ". Здоровье = " + healthOfHero);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        Random rndm1 = new Random();
        int healScore = rndm1.nextInt(6) + 5;

        if (hero.healthOfHero + healScore > 100) {
            hero.healthOfHero = 100;
        } else {
            hero.healthOfHero += healScore;
        }
    }

    @Override
    public double physicalAttack(Hero hero) {
        Random rndm1 = new Random();
        int rndmScore = rndm1.nextInt(2);       //Cчетчик сколько раз герой будет бить
        if (rndmScore == 0) {

            System.out.println(nameOfHero + " промахнулся!");
        } else {
            for (int i = 1; i <= rndmScore; i++) {
                int rndmRangeOfAttack = rndm1.nextInt(20) + 5;                  //Диапазон силы атаки ОТ и ДО
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

            Random rndm1 = new Random();

            if (healthOfHero >= 35) {   //Если здоровье героя больше этого уровня, то бьем, если нет, то лечимся
                physicalAttack(hero);
            }
            if (healthOfHero < 35) {
                int healScore = rndm1.nextInt(1) + 1; //Сколько раз сработает хилка
                for (int i = 1; i <= healScore; i++) {       //Хилимся какое-то количество раз
                    healHimself();
                }
            }

        } else if (isAlive == false && hero.isAlive == true) {
            System.out.print("Герой " + nameOfHero + " " + DeathOfHero() + " " + hero.nameOfHero + " победил.");
        } else if (isAlive == true && hero.isAlive == false) {
            System.out.print("Герой " + nameOfHero + " " + DeathOfHero() + " " + hero.nameOfHero + " проиграл.");
        }
    }
}
