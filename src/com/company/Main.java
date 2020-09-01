package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "yinyavorokzeB yirtimD";
        char[] reverseArray1 = s.toCharArray();
        System.out.println("1. Массив в обратном порядке: ");
        for (int i = reverseArray1.length-1; i >= 0; i--) System.out.print(reverseArray1[i]);

        int[] reverseArray2 = {1, 9, 11, 23};
        System.out.println("\n2. Массив в обратном порядке: ");
        for (int i = reverseArray2.length-1; i >= 0; i--) {
            System.out.print(reverseArray2[i] + " ");



    }
    }

}
