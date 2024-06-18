package Java_Programs;

import java.util.Scanner;

public class While_program {
    public static void main(String[] args) {
        While_program obj = new While_program();
        obj.WhileProgram_print_Hi5Times();
        System.out.println("--------------");
        obj.WhileProgram_print_100AS_10times();
        System.out.println("---------------");
        obj.WhileProgram_print_1to10();
        System.out.println("---------------");
        obj.WhileProgram_print_5Even_number();
        obj.print_first_5even_num();
    }
    // This method is used for
    // Print HI as 5-times
    // Using WHILE-LOOPING
    public void WhileProgram_print_Hi5Times(){
        System.out.println("*****While Program Print 5 Times Hi*****");
        System.out.println();

        int i=0;
        while(i<=4){
            System.out.println("Hi");
            i++;
        }
    }

    // This method is used for
    // Print 100 as 10-times
    // Using WHILE-LOOPING

    public void WhileProgram_print_100AS_10times(){

        System.out.println("*****While Program Print 100 as 10 Times ******");

        System.out.println();

        int i=1;
        while(i<=10){
            System.out.println(i+". "+100);
            i++;
        }
    }

    // This method is used for
    // Print 1 to 10 numbers
    // Using WHILE-LOOPING
    public void WhileProgram_print_1to10(){
        System.out.println("Print 1 to 10 numbers");
        System.out.println();
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("********Give one number to print 1 to you given number******");
        int j=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int k=sc.nextInt();
        while(j<=k){
                System.out.print(j+",");
                j++;
        }

    }

    // This method is used for
    // Print first 5-even numbers
    // Using WHILE-LOOPING

    public void WhileProgram_print_5Even_number(){
        System.out.println("**********Print 1st 5 Even numbers**********");
        System.out.println();
        int i=1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i);

            }
            i++;
        }

    }

    public void print_first_5even_num()
    {
        System.out.println("Print first 5-even numbers");
        System.out.println(" ");
        int num = 10;
        int i = 1;
        while(i<=5)
        {
            System.out.println(i + " -- " + num);
            num = num - 2;
            i++;
        }
    }
}
