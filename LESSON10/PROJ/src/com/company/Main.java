package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
int [] [] arr1 = new int[][]{{1,23,3},{4,5,6},{6,7,8}};
int [] [] arr2 = new int[][]{{1,34,4},{23,23,23},{1,2,3}};
int [][] arr3 = Arrays.copyOf(arr1, arr1.length);
System.out.println(Arrays.deepEquals(arr2,arr1));
        System.out.println(Arrays.deepToString(arr3));
//  int arr2 [] [] = {{4,7,2},{3,8,3},{8,2,6}};
//  for(int i = 0; i<arr1.length;i++){
//      for(int j = 0; j<arr1.length;j++){
//          arr1[i][j]= random.nextInt();
//          System.out.println(arr1[i][j]+"\t");
//      }
//
//      System.out.println();
////      System.out.println(Arrays.toString(arr1[i]));
//      //arr1[i][j]=0;
//
//  }
//        for(int i1 = 0; i1< arr1.length; i1++){
//            System.out.print(arr1[arr1.length-1-i1][i1]+" ");
//        }

//        method1();
    }

//   public static void method1() {
//        Random random = new Random();
//        int[][] arr1 = new int[3][3];
//       int[][] arr2 = new int[3][3];

//        System.out.println(Arrays.deepEquals(arr2,arr1));
//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {
//
//            for (int j = 0; j < arr1.length; j++) {
//                arr1[i][j] = random.nextInt(10);
               // System.out.print(arr1[i][j]+"\t");

//            }
//            sum += arr1[arr1.length-1-i][i];
//
//        }
//        System.out.print(sum);
//

}