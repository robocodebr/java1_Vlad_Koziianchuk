package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        boolean b =scanner.hasNextLine();
//        boolean b2 = scanner.hasNextInt();
//        System.out.println(b2);
//        Random random = new Random();
//        System.out.println(random.nextInt(65)-55);

        Random random = new Random();
//        float f = random.nextFloat();
//        boolean b = random.nextBoolean();
//        double d = random.nextDouble();
//        System.out.println(d);
//        int i =-20;
//        while(i<20) {
//            System.out.println(random.nextInt(40));
//            i++;
//        }
//        int i = 100;
//        do{
//            System.out.println(random.nextInt(100)+100);
//            i++;
//        }
//        while (i<200);
//        for(int i =0;i<20;i+=2){
//            System.out.println(i);
//        }
//        int n = scanner.nextInt();
//        int i = 0;
//        while(i<n){
//            i++;
//            System.out.println(random.nextInt(100));
//        }
//        int n = scanner.nextInt();
//        for(int i = 0;i<n;i++){
//            System.out.println(random.nextInt(20)-10);
//        }

        int n = scanner.nextInt();
        int i = 0;
        int i1 = 1;
        while(i<10){
            System.out.println(i+"*"+n+"="+i*n);
            i++;
        }

        while(i1<10){
            System.out.println(n+"/"+i1+"="+n/i1);
            i1++;
        }
        i = 0;
        while(i<10){
            System.out.println(i+"-"+n+"="+(i-n));
            i++;
        }
        i = 0;
        while(i<10){
            System.out.println(i+"+"+n+"="+(i+n));
            i++;
        }
    }
}
