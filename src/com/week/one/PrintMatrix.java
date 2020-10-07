package com.week.one;

public class PrintMatrix {
    public static void main(String args[]){
        int[][]mas = new int [][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){
                if (i==4-j || i==j) {
                    System.out.print(" * ");
                }
                else {
                    System.out.printf("%2d ",mas[i][j]);
                }
            }
            System.out.println();
        }
    }

}
