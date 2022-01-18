package problem6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] numbers = reader.nextLine();

        for(int i = 0; i <= n; i++){
            if (numbers[i] == 0) {
                int b = n-1;
                numbers[i] = numbers[b];
                numbers[b] = numbers[i];
                b--;
            }
        }
        numbers.toString();
        System.out.println(numbers);


    }
}
