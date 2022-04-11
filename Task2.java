package day11.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int repeat = 1;

        Scanner scan4in = new Scanner(System.in);

        System.out.println("Это настоящий World of Warcraft, только в консоли :)");
        System.out.println("Выберите класс, за который будете играть. Вашего оппонента компьютер выберет автоматически.");
        System.out.println(" 1 - ВОИН - Мощные удары, отличная защита от физических повреждений. Слаб против магии.");
        System.out.println(" 2 - ПАЛАДИН - Настоящий воин света. Неплохо сражается в физическом бою и умеет лечить себя.");
        System.out.println(" 3 - МАГ - Специалист по атакующим заклинаниям. Против обычных доспехов - лучший выбор. Слаб против физических атак.");
        System.out.println(" 4 - ШАМАН - Магические удары и лечение себя - наше всё.");
        System.out.print("Ваш выбор: ");
        int userChoice = scan4in.nextInt();
        Battle battle1 = new Battle(userChoice, repeat);
        CompChoice compChoice = new CompChoice(userChoice);

        switch (userChoice) {
            case 1:
                    battle1.battleUserChoice1();
                break;
            case 2:
                    battle1.battleUserChoice2();
                break;
            case 3:
                    battle1.battleUserChoice3();
                break;
            case 4:
                    battle1.battleUserChoice4();
                break;
            default:
                System.out.println("Такого персонажа в игре нет");
                break;
        }
    }
}

