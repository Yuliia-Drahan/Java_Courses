package com.week.one;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int K;
        boolean P;
        do {
            P = false;
            for (int i=0; i < length-1; i++) {
                if (array[i]>array[i+1]) {
                    K = array[i];
                    array[i]=array[i+1];
                    array[i+1]=K;
                    P=true;
                }
            }
        } while (P);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
