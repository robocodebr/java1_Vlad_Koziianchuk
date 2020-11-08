package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
       int len = scanner.nextInt();
       int[] p = new int[len];
       for (int i = 0; i<p.length;i++){
           p[i]= random.nextInt(30);
       }
       int key=scanner.nextInt();
       int count = 0;
       for (int i = 0; i< p.length;i++){
           if(p[i]==key){
            count++;

           }
       }
       int[] p2 = new int[p.length-count];
       int j = 0;
       for(int i = 0; i<p.length;i++){
           if (p[i] !=key){
               p2[j]=p[i];
               j++;
           }
       }
       System.out.println(Arrays.toString(p));
       System.out.println(Arrays.toString(p2));
//       for(int i = 0; i< p.length; i++){
////           p[i] = random.nextInt(40)-20;
//           int temp = p2[i];
//      }
//        System.out.println(Arrays.toString(p));
//       for(int i = 0; i<(int)p.length/2;i++){
//           int temp = p[i];
//           p[i]=p[p.length-1-i];
//           p[p.length-1-i]=temp;
//       }
//        System.out.println(Arrays.toString(p));
//        System.out.println(Arrays.toString(p2));
//        for(int j = 0; j<(int)p2.length;j++){
//            int temp = p2[j];
//            p2[j]=p2[p2.length-1-j];
//            p2[p2.length-1-j]=temp;
//        }
//        System.out.println(Arrays.toString(p2));
//        System.out.println(Arrays.toString(p));

//        for (int i = 0; i < p.length; i++) {
//            for (int j = 0; j < p.length - i-1; j++) {
//                if (p[i] < p[j]) {
//                    int temp = p[i];
//                    p[i] = p[j];
//                    p[j] = temp;
//                }
//            }
//        }
      // Arrays.sort(p);
//      System.out.println(Arrays.toString(p));

//        for (int i = 0; i< p.length; i++){
//            if(p[i]%2==0){
//                System.out.println(p[i]);
//            }
        }
//        int p = 10;
//        int u = 10;
//        if (s.equals("+")){
//            sum(23,23);
//        } else if (s.equals("-")){
//            min(45,456);
//        } else if (s.equals("*")){
//            multi(2453,444421);
//        } else if (s.equals("/")){
//            divi(4312342,325123);
//        }

    }
//    public static void sum(int p, int u){
//        System.out.println(p+u);
//    }
//    public static void multi(int p, int u){
//        System.out.println(p*u);
//    }
//    public static void min(int p, int u){
//        System.out.println(p-u);
//    }
//    public static void divi(int p, int u){
//        System.out.println(p/u);
//    }
