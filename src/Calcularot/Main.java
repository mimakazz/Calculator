package Calcularot;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt1();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static int getInt1() {
        System.out.print("First num: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You make a mistake while entering a num. Try again.");
            scanner.next();
            num = getInt1();
        }
        return num;
    }

    public static int getInt() {
        System.out.print("Second num: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You make a mistake while entering a num. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Your operation: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You make a mistake while entering the operation. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operation not recognized. Re-enter.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

//Метод next () заканчивается, когда читает пустой символ.
//Cимвол метода nextLine () является только клавиша Enter.