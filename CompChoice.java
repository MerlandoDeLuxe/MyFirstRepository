package day11.task2;

import java.util.Random;

public class CompChoice {
    Random rndm1 = new Random();

    private String nameOfCompSolder = "<противник не назначен>";
    private int compChoice;
    private int compChoiceAfterCalculate;
    private int userChoice;

    public CompChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public String calculateCompChoice() {
        int min = 1;
        int max = 5;

        do {
            compChoice = rndm1.nextInt(max - min) +min;
        } while (compChoice == userChoice); //Если выбор пользователя равен выбору компьютера, то возвращаем к перебросу кубиков компьютера

                if (compChoice == 1) {
                    nameOfCompSolder = "Воин";
                } else if (compChoice == 2) {
                    nameOfCompSolder = "Паладин";
                } else if (compChoice == 3) {
                    nameOfCompSolder = "Маг";
                } else if (compChoice == 4) {
                    nameOfCompSolder = "Шаман";
                }

                 return nameOfCompSolder; //Возвращаем выбор компьютера
    }

    public int getCompChoice() {
        return compChoice;
    }
}
