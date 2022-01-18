package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{8, 3, 7, 9, 1, 2, 4};
        Main.sort(numbers);
    }

    public static int indexofsmallestfrom(int[] numbers, int startindex) {
        int a = numbers[startindex];
        int b = 0;
        for (int i = startindex; i < numbers.length; i++) {
            if (numbers[i] <= a) {
                a = numbers[i];
                b = i;
            }
        }
        return b;
    }
    public static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        int temp2 = numbers[index2];
        numbers[index1] = temp2;
        numbers[index2] = temp;
    }
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));
            swap(numbers, indexofsmallestfrom(numbers, i), i);
        }
    }
}