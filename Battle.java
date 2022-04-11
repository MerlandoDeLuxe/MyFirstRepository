package day11.task2;

import java.util.Scanner;

public class Battle {

    private int userChoice;
    private int repeat;
    Scanner scan4in = new Scanner(System.in);

    public Battle (int userChoice, int repeat){
        this.userChoice = userChoice;
        this.repeat = repeat;
    }
    public int getUserChoice() {
        return userChoice;
    }

    public void battleUserChoice1() {
        CompChoice compChoice = new CompChoice(userChoice);
        System.out.println("Ваш выбор Воин, против вас будет сражаться " + compChoice.calculateCompChoice());
        if (compChoice.getCompChoice() == 2) {
            Warrior userWarrior1 = new Warrior();
            Paladin compPaladin1 = new Paladin();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userWarrior1.thinkingBeforeDoing(compPaladin1);
                System.out.println();
                compPaladin1.thinkingBeforeDoing(userWarrior1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 3) {
            Mage compMage1 = new Mage();
            Warrior userWarrior1 = new Warrior();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userWarrior1.thinkingBeforeDoing(compMage1);
                System.out.println();
                compMage1.thinkingBeforeDoing(userWarrior1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 4) {
            Warrior userWarrior1 = new Warrior();
            Shaman compShaman1 = new Shaman();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userWarrior1.thinkingBeforeDoing(compShaman1);
                System.out.println();
                compShaman1.thinkingBeforeDoing(userWarrior1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
    }
    public void battleUserChoice2() {
        CompChoice compChoice = new CompChoice(userChoice);
        System.out.println("Ваш выбор Паладин, против вас будет сражаться " + compChoice.calculateCompChoice());
        if (compChoice.getCompChoice() == 1) {
            Paladin userPaladin1 = new Paladin();
            Warrior compWarrior1 = new Warrior();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userPaladin1.thinkingBeforeDoing(compWarrior1);
                System.out.println();
                compWarrior1.thinkingBeforeDoing(userPaladin1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 3) {
            Paladin userPaladin1 = new Paladin();
            Mage compMage1 = new Mage();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userPaladin1.thinkingBeforeDoing(compMage1);
                System.out.println();
                compMage1.thinkingBeforeDoing(userPaladin1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 4) {
            Paladin userPaladin1 = new Paladin();
            Shaman compShaman1 = new Shaman();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userPaladin1.thinkingBeforeDoing(compShaman1);
                System.out.println();
                compShaman1.thinkingBeforeDoing(userPaladin1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
    }
    public void battleUserChoice3() {
        CompChoice compChoice = new CompChoice(userChoice);
        System.out.println("Ваш выбор Маг, против вас будет сражаться " + compChoice.calculateCompChoice());
        if (compChoice.getCompChoice() == 1) {
            Mage userMage1 = new Mage();
            Warrior compWarrior1 = new Warrior();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userMage1.thinkingBeforeDoing(compWarrior1);
                System.out.println();
                compWarrior1.thinkingBeforeDoing(userMage1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 2) {
            Mage userMage1 = new Mage();
            Paladin compPaladin1 = new Paladin();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userMage1.thinkingBeforeDoing(compPaladin1);
                System.out.println();
                compPaladin1.thinkingBeforeDoing(userMage1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 4) {
            Mage userMage1 = new Mage();
            Shaman compShaman1 = new Shaman();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userMage1.thinkingBeforeDoing(compShaman1);
                System.out.println();
                compShaman1.thinkingBeforeDoing(userMage1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
    }
    public void battleUserChoice4() {
        CompChoice compChoice = new CompChoice(userChoice);
        System.out.println("Ваш выбор Шаман, против вас будет сражаться " + compChoice.calculateCompChoice());
        if (compChoice.getCompChoice() == 1) {
            Shaman userShaman1 = new Shaman();
            Warrior compWarrior1 = new Warrior();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userShaman1.thinkingBeforeDoing(compWarrior1);
                System.out.println();
                compWarrior1.thinkingBeforeDoing(userShaman1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 2) {
            Shaman userShaman1 = new Shaman();
            Paladin compPaladin1 = new Paladin();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userShaman1.thinkingBeforeDoing(compPaladin1);
                System.out.println();
                compPaladin1.thinkingBeforeDoing(userShaman1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
        if (compChoice.getCompChoice() == 3) {
            Shaman userShaman1 = new Shaman();
            Mage compMage1 = new Mage();
            do {
                System.out.print("Чтобы закончить бой, введите 0: ");
                repeat = scan4in.nextInt();
                System.out.println();
                if (repeat == 0) {
                    break;
                }
                userShaman1.thinkingBeforeDoing(compMage1);
                System.out.println();
                compMage1.thinkingBeforeDoing(userShaman1);
                System.out.println();
            } while (repeat != 0);
            System.out.println("Программа будет завершена");
        }
    }
}
