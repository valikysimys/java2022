package block3;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of matrix (n * n): ");
        int n = scanner.nextInt();
        //заповнення матриці випадковими числами
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        printMatrix(matrix);
        System.out.print("Enter k: ");
        int k = scanner.nextInt() - 1;

        //якщо к більше, ніж розмір матриці
        if(k > n){
            System.out.println("Error");
            System.exit(0);
        }
        int temp = matrix[k][k];

        // циклом віднімаємо від елементів число, яке стоїть в діагоналі
        for(int i = 0; i < n; i++){
            matrix[i][k] = matrix[i][k] - temp;
        }

        printMatrix(matrix);

    }

    //функція для друкування матриці
    static void printMatrix(int[][] matrix){
        for(int[] m : matrix){
            System.out.println(Arrays.toString(m));
        }
    }
}
