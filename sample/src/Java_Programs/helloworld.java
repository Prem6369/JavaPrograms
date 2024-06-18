package Java_Programs;

import java.util.Scanner;

public class helloworld {
    public static void main (String[] args){
        System.out.println("Helllo world");
        String heloo="Hello World";
//        for (int i=10;i<=100;i++){
//            System.out.println("hi"+i+heloo);
//        }
        Scanner console= new Scanner(System.in);
        int a,b,c;
        System.out.print("enter the 1st number:");
        a=console.nextInt();
        System.out.print("enter the 2nd nuber:");
        b=console.nextInt();
        System.out.println("total:"+(a+b));

    }


}
