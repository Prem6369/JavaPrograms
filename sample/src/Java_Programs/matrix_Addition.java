package Java_Programs;

import java.util.Scanner;

public class matrix_Addition {

    public static void main(String[] args) {
    matrix_Addition obj = new matrix_Addition();
    obj.Addition_Matrix();
    }

    public void Addition_Matrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row1 = sc.nextInt();
        System.out.println("Enter the column:");
        int column1= sc.nextInt();
        int a [][] = new int [row1][column1];
        System.out.println("Enter the row:");
        int row2 = sc.nextInt();
        System.out.println("Enter the column:");
        int column2 = sc.nextInt();
        int b [][] = new int [row2][column2];
        int c[][] = new int [row1][column1];

        if((row1==row2)&&(column1==column2)){

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.println("Enter the 1st  elements:"+i+" "+j);
                    a[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    System.out.println("Enter the 2nd elements:"+i+" "+j);
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("Result:");
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
            }

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){

                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
