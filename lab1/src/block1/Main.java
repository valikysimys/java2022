package block1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ведення даних
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextInt();

        System.out.print("Enter b: ");
        double b = scanner.nextInt();

        System.out.print("Enter beta: ");
        double beta = scanner.nextInt();
        //якщо довжина а бета менше, ніж а б, точка 100 відсотків потрапить
        if(beta >= b) {
            System.out.println("Probability: 1");
            System.exit(0);
        }
        //рахуємо ймовірність
        System.out.println("Probability: " + (beta - a) / (b - a));
    }
}
