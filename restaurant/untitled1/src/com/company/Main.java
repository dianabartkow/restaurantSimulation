package com.company;

public class Main {

    public static void main(String[] args) {
        int min;
        int[] array = {100, 5, 24, 243, 12, 11, 50};

        for (int i = 0; i < array.length; i++) {

            min = array[0];
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);


    }
}



