import interfacesAndAbstracClasses.AbstractClass;
import tasks.MyFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
        String text = "1,2,3,4,6";
//
        String[] res = text.split(",");
        for (int i = 0; i < res.length; i++) {
            System.out.println(i + ") " + res[i]);
        }

        Scanner scanner = new Scanner(System.in);


        String s;
//        while(true){
//            String str = scanner.nextLine();
//            if(str.equals("#close")){
//                break;
//            }
//        }


        do{
            s = scanner.nextLine();

        }while(!s.equals("#close"));












//        try{
//
//            System.out.println("divide = " + num1/ num2);
//
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//
//
//
//        System.out.println("gajhdkgd");
//        System.out.println("gajhdkgd");
//        System.out.println("gajhdkgd");
//        System.out.println("gajhdkgd");
//        System.out.println("gajhdkgd");

    }
}
