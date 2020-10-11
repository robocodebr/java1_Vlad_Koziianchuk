package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        String s = scanner.next();
        if (s.equals("+")){
            sum(i,j);
        } else if (s.equals("-")){
            substraction(i,j);
        } else if (s.equals("*")){
            multiplication(i,j);
        } else if (s.equals("/")){
            divide(i,j);
        }
        System.out.println( scan(i,s,j));

//        fun("fun");
//        String s = "tex";
//        fun(s);
//        println("text","text");
//        str(1,2);
    }


    public static int scan(int i,String s,int j){
    return i*j;
    }
public static int sum(int i,int j){
        return i+j;
}

public static int substraction(int i,int j){
        return i-j;
}
public static int multiplication(int i,int j){
        return i*j;
}
public static float divide(float i,float j){
        return i/j;
    }
    public static void fun(String name){
 System.out.println("hello" +name);
    }
   public static void println(String arg1,String arg2){
      System.out.println("arg1= "+arg1);
      System.out.println("arg2= "+arg2);
   }
}
