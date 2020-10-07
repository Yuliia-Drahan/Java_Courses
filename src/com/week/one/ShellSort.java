package com.week.one;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6, 22};
        int length = array.length;
        int i,j;
        for (i=0; i<length; i++){
            for (j=length-1; j>i; j--) {
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }

        }
        for (i=0; i<length; i++){
            System.out.print(array[i]+" ");
        }
    }

}
