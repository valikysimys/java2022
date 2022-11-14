package block2;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        System.out.print("Enter a size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        //заповнення масиву випадковими числами
        for(int i = 0; i < n; i++){
            array[i] =  (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        double a = array[0]; // початкове число а
        double b = array[1]; // початкове число б
        double closest = (a + b) / 2; //початкова найближча до секреднього арифметичного сума
        double way = Math.abs(x - closest); //різниця від знайденого до заданого

        //алгоритм пошуку таких двох чисел
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                double result = (array[i] + array[j]) / 2;
                System.out.println("(" + array[i] + " + " + array[j] + ") / " + "2" + " = " + result);
                double temp = Math.abs(x - result);
                if(temp < way){
                    way = temp;
                    a = array[i];
                    b = array[j];
                }
            }
        }

        System.out.println("Closest to " + x + " is: " + "a = " + a + "; b = " + b);
    }
}
