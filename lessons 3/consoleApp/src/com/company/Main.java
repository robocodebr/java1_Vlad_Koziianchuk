package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner;
        scanner = new Scanner(System.in);

        //String s = scanner.nextLine();
        //System.out.println(s);
        //String f = scanner.nextLine();
        //String l= scanner.nextLine();
        //System.out.println(s+" "+f+" "+l);
       // System.out.println(l+l+l);
//        int i = scanner.nextInt();
//        int j = scanner.nextInt();
//        System.out.println(i*j);
//        System.out.println(i-j);
//        System.out.println(i+j);
//        System.out.println(i/j);
//        String s = "text";
//        System.out.println(s.equals("text"));


        String s = scanner.nextLine();
        s.charAt(2);
        int i = Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
        int j = Integer.parseInt(""+s.charAt(3)+""+s.charAt(4));
        if("+".equals(""+s.charAt(2))){
            System.out.println(i+j);
        }else if("-".equals(""+s.charAt(2))){
            System.out.println(i-j);
        }else if("*".equals(""+s.charAt(2))){
            System.out.println(i*j);
        }else if("/".equals(""+s.charAt(2))){
            System.out.println(i/j);
        }


    }
}
