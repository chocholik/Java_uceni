package com;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int num[];
//        int num1[]= {10,20,30,40};
//        System.out.println(num1);
////        System.out.println(num1[0]);
////        System.out.println(num1[1]);
////        System.out.println(num1[2]);
////        System.out.println(num1[3]);
////        System.out.println(num1[4]);
//        for (int i=1, n=3; i<=n; i++) {
//            System.out.println("i = "+i);
//        }
//        System.out.println("Size of array "+num1.length);
//        System.out.println("retriece value from array using loop");
//        for(int i=0;i<num1.length;i++){
//            System.out.println("array value is "+num1[i]);
//        }
//        int abc[]=new int[10];
////        for (int i=0;i<abc.length;i++){
////            System.out.println("ABC array value ["+i+"] is: "+abc[i]);
////        }
//        System.out.println("abc[].length = "+abc.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to store?");
        int size = sc.nextInt();
        int data[]=new int[size];
        System.out.println("Plz enter the "+size+" number one by one");
        for(int i=0;i<data.length;i++) {
            data[i]=sc.nextInt();
        }
        // business logic.
        int sumOfNaturalNumber=0;
        int sumOfEven =0;
        int sumoOfOdd = 0;
        for(int i=0;i<data.length;i++) {
            sumOfNaturalNumber = sumOfNaturalNumber+data[i];
            if(data[i]%2==0) {
                sumOfEven = sumOfEven+data[i];
            }else {
                sumoOfOdd = sumoOfOdd+data[i];
            }
        }
        System.out.println("Sum of natural number is "+sumOfNaturalNumber);
        System.out.println("Sum of even "+sumOfEven);
        System.out.println("Sum of odd "+sumoOfOdd);
        System.out.println("All elements are");
        for(int i=0;i<data.length;i++) {
            System.out.println("Value is "+data[i]);
        }
        sc.close();
    }
}
