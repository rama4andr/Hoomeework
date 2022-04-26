package com.company;

public class Second_Arrays {
    public static void main (String [] args) {
        double [] array = {34, 52345, 56.43, 3256, 67.094, 65};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array [i];
            double lastElementArray = sum;
            System.out.println(lastElementArray);
        }

    }
}
