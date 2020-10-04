package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    // int j = scanner.nextInt();
//     if(i%2 ==0){
//         System.out.println("even");
//        }else {
//         System.out.println("odd");
//     }
//          int i = 0;
//        for(int counter=1;counter<=j;counter++){
//            i++;
//            if(i==7){
//                i=0;
//            }
//        }
//        switch(i){
//             case 0:
//                System.out.println("Mon");
//                break;
//                case 1:
//                System.out.println("Tus");
//                break;
//                case 2:
//                System.out.println("Wed");
//                break;
//                case 3:
//                System.out.println("Thur");
//                break;
//                case 4:
//                System.out.println("Frid");
//                break;
//                case 5:
//                System.out.println("Suter");
//                break;
//                case 6:
//                System.out.println("Sun");
//                break;
//        }
        Random random = new Random();
//        int i = 0;
//        do{System.out.println(random.nextInt(100));
//        i++;
//        }
//        while(i<10);



//        for(int i =0; i<11;i++){
//            System.out.println(random.nextInt(100)-50);
//        }


//        int i = scanner.nextInt();
//        int d = scanner.nextInt();
//        while(i<d){
//            if(i%2 ==0){
//            System.out.println(i);}
//
//        }
//        i++;
        int i = scanner.nextInt();
        int n = scanner.nextInt();
         int sum = 0;
        while(i<n){

            sum += i;
            System.out.println(i);
            i++;
    }
        System.out.println(sum);
    }
}
