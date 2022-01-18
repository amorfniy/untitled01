package newpackage2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        int factorial = 1;

        for(int i = 1; i <= input; i++) {
            factorial=factorial * i;
        }
        System.out.println(factorial);

    }
}
