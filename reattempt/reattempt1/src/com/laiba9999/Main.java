package com.laiba9999;

public class Main {

    public static void main(String[] args) {

        //Exercise 1

        String[] ex1 = {"you", "are", "how", "Hello"};
        for (int i = ex1.length - 1; i >= 0; i--) {
            String almost = ex1[i] + " ";
            if (i == 1 || i == 2 || i == 3) {
                System.out.print(ex1[i] + " ");
            } else {
                System.out.print(ex1[i] + "?");
            }
        }

        //Exercise 2
        String numbers= "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] newArray = numbers.split(",");
        System.out.println(newArray);
//        for (int i=0; i < numbers.length; i++ );
//        System.out.println(numbers[i]);
        }

    }

