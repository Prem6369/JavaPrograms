package Java_Programs;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Pattern obj=new Pattern();
        //obj.patternone();
        //obj.patterntwo();
        obj.patternthree();
    }

    public void patternone(){

        int row=4;
        int col=4;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){ // Fixed: changed col to j
                System.out.print("* ");
            }
            System.out.println();
        }

        ///dynamic pattern

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row:");
        int row1=sc.nextInt();
        System.out.println("Enter the col:");
        int col1=sc.nextInt();

        System.out.println("the pattern is"+row1+"x"+col1);

        for(int i=0;i<row1;i++){
            for (int j=0;j<col1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void patterntwo(){

        ///box size
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row:");
        int row2=sc.nextInt();
        System.out.print("Enter the col:");
        int col2=sc.nextInt();

        System.out.println("the pattern is: "+row2+"x"+col2);

        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){

                if(i==0 || j==0|| i==row2-1 || j==col2-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }

    public void patternthree(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row:");
        int row3=sc.nextInt();

        for(int i=0;i<=row3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
