package src;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    //Creating an instance of a class gives us access to the methods in that class.
    public static void main(String[] args) {
        Main main = new Main();
        //main.task1();
        //main.task2();
        //main.task3();
        //main.task4();
        //main.task5();
        //main.task6();
        //main.task7();
        main.task8();
    }

    //With static methods you don't need to create an instance of it before calling the method
    void task1() {
        System.out.println("TASK 1");
        int number = 11;
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        }
        else {
            System.out.println(number + " is an odd number.");
        }
    }

    void task2() {
        System.out.println("TASK 2");
        System.out.println("Please enter your number.");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is an even number.");
        } else {
            System.out.println("Your number is an odd number.");
        }
    }

    void task3() {
        System.out.println("TASK 3");
        System.out.println("Please enter your number.");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Your number is greater than 0.");
        }
        else if (number < 0) {
            System.out.println("Your number is less than 0.");
        }
        else {
            System.out.println("Your number equals to zero.");
        }
    }

    void task4() {
        System.out.println("TASK 4");
        System.out.println("Welcome to a roller-coaster!Please enter your info below to begin.");
        System.out.println("Please enter your height (in cm).");
        int height = scanner.nextInt();
        System.out.println("Please enter your weight (in kg).");
        float weight = scanner.nextFloat();
        if (height > 150 && weight < 180) {
            System.out.println("Fasten your seatbelt!");
        }
        else {
            System.out.println("I'm sorry you can't go!");
        }
    }

    void task5() {
        System.out.println("TASK 5");
        System.out.println("Please enter the temperature in C.");
        float tempInCelsius = scanner.nextFloat();
        float tempInFahrenheit = (float) (1.8 * tempInCelsius + 32.0);
        System.out.println("The temperature provided in Fahrenheit is: " + tempInFahrenheit + ".");
    }

    void task6() {
        System.out.println("TASK 6");
        System.out.println("Please enter your income.");
        double income = scanner.nextDouble();
        double tax;
        if (income < 85528.00) {
            tax = 0.18*income - 556.02;
        }
        else {
            tax =  14839.02 + 0.32*(income-85528.00);
        }
        System.out.println("Your personal income tax is: " + tax + ".");
    }

    void task7() {
        System.out.println("TASK 7");
        System.out.println("Please enter a loan amount.");
        double amount = scanner.nextDouble();
        if (amount > 10000.00) {
            amount = 5000.00;
            System.out.println("Your loan amount has been amended to " + amount);
        }

        while (amount < 100) {
            System.out.println("The loan amount should be at least 100. Please enter the loan amount again.");
            amount = scanner.nextDouble();
            if (amount > 10000.00) {
                amount = 5000.00;
                System.out.println("Your loan amount has been amended to " + amount);
            }
        }

        System.out.println("Please enter the number of installments.");
        int numberOfInstallments = scanner.nextInt();
        if (numberOfInstallments > 48) {
            numberOfInstallments = 36;
            System.out.println("Your number of installments has been amended to " + numberOfInstallments + ".");
            double monthlyInstallment = (amount + 0.1 * amount) / numberOfInstallments;
        }
        while (numberOfInstallments < 6) {
            System.out.println("The number of installments should be at least 6. Please enter the number of installments again.");
            numberOfInstallments = scanner.nextInt();
        }


        if (numberOfInstallments >= 6 && numberOfInstallments <= 12 && amount >=100.00){
                double monthlyInstallment = (amount + 0.025 * amount) / numberOfInstallments;
                System.out.printf("Your monthly installment is: %.2f", monthlyInstallment);
                System.out.print(".");
            }
            else if (numberOfInstallments >= 13 && numberOfInstallments <= 24 && amount >=100.00){
                double monthlyInstallment = (amount + 0.05 * amount) / numberOfInstallments;
                System.out.printf("Your monthly installment is: %.2f", monthlyInstallment);
                System.out.print(".");

            }
            else if (numberOfInstallments >= 25 && numberOfInstallments <= 48 && amount >=100.00){
                double monthlyInstallment = (amount + 0.1 * amount) / numberOfInstallments;
                System.out.printf("Your monthly installment is: %.2f", monthlyInstallment);
                System.out.print(".");
            }
            else {
                System.out.println("Please rerun the programme.");
            }
        }

        void task8() {
        System.out.println("TASK 8");
//        System.out.println("Please enter the month (number).");
//        int month = scanner.nextInt();
//
//        boolean monthValid;
//            monthValid = month >= 1 && month <= 12;
//
//        System.out.println("Please enter the year.");
//        int year = scanner.nextInt();
//        boolean yearValid;
//        yearValid = year >= 1000 && year <= 1999;
//
//        boolean leapYear;
//        leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
//        System.out.println("The month entered is valid: " + monthValid + ".");
//        System.out.println("The year entered is valid: " + yearValid + ".");
//
//        if (yearValid) {
//            System.out.println("The year entered is a leap year: " + leapYear + ".");
//        }
//        else {
//            System.out.println("The year entered is an invalid year.");
//        }

            System.out.println("Please enter the day.");
            int day = scanner.nextInt();
            System.out.println("Please enter the month (number).");
            int month = scanner.nextInt();
            System.out.println("Please enter the year.");
            int year = scanner.nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ((day>=1 && day <=31) && (year>= 1000 && year <= 1999)) {
                        System.out.println("The date entered is valid.");
                    }
                    else {
                        System.out.println("The date entered is invalid.");
                    }
                    break;
                case 2:
                    if ((day==29) && (year>= 1000 && year <= 1999) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                        System.out.println("The date entered is valid.");
                    }
                    else if ((day>=1 && day <=28) && (year>= 1000 && year <= 1999)) {
                        System.out.println("The date entered is valid.");
                    }
                    else {
                        System.out.println("The date entered is invalid.");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if ((day>=1 && day <=30) && (year>= 1000 && year <= 1999)) {
                    System.out.println("The date entered is valid.");
                    }
                    else {
                    System.out.println("The date entered is invalid.");
                    }
                    break;
                default:
                    System.out.println("Please rerun the programme.");
            }

        }
}
