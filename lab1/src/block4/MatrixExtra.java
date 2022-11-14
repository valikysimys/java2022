package block4;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of matrix (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter a size of matrix (m): ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        printMatrix(matrix);
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        int indexOne = 0; //індекс по рядками
        int indexTwo = 0; //індекс по стовпчикам
        int maxElem = matrix[0][0]; //максимальний елемент
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(matrix[i][j] > maxElem){ //якщо поточний елемент більше максимального
                    indexOne = i; //записуємо індекс
                    indexTwo = j;
                    maxElem = matrix[i][j]; // оновлюємо значення максимального елементу
                }
            }
        }
        System.out.println("Max element: " + maxElem + ", indexes: " + indexOne + ", " + indexTwo);

        //двома циикладми проходимо до цих індексів, замінюючи значення
        for(int i = 0; i < indexOne; i+=2){
            for(int j  = 1; j < indexTwo; j += 2){
                matrix[i][j] = matrix[i][j] * k;
            }
        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix){
        for(int[] m : matrix){
            System.out.println(Arrays.toString(m));
        }
    }
}
