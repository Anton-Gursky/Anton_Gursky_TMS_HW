package Task_16;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите выражение, которое хотите посчитать. \n" +
                "Выражение должно состоять из цифр и одинаковых знаков между ними");
        Calculator calculator = new Calculator(scanner.nextLine());
        calculator.toRomanDigits(calculator.calculate());
    }
}