package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int temp = 0; //лічильник для чисел, які діляться на 3
        //у випадку, якщо лічильник залишиться рівним 0 після проходженням по всім елементам,
        //викидається власне виключення
        int max = 0;

        //заповнення масиву числами
        for(int i = 0; i < n; i++){
            try { //перевірка, чи користувач ввів число, якщо введено не число, повідомляємо користувача
                //програма при цьому не переривається
                System.out.print("Enter number #" + (i + 1) + ": ");
                arr[i] = Integer.parseInt(scanner.nextLine());
                if(arr[i] % 3 == 0)
                    temp++;

                if(temp > 0 && arr[i] % 3 == 0 && arr[i] > max)
                    max = arr[i];
            }catch (Exception e){
                System.out.println(e.getMessage());
                i--;
            }
        }

        try {
            checkMax(max); //метод для перевірки, чи є в масиві число, яке ділиться на 3
            System.out.println("Max number: " + max);
        } catch (MaxNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void checkMax(int max) throws MaxNotFoundException {
        if(max == 0){
            throw new MaxNotFoundException("Number not found.");
        }
    }
}
