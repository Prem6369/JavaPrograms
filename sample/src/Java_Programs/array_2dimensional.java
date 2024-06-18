package Java_Programs;

import java.util.Scanner;

public class array_2dimensional {

    void TwoDimensionalArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int row = sc.nextInt();
        System.out.print("Enter the col:");
        int col = sc.nextInt();

        int numbers [] []= new int[row][col];



        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.println("Enter for"+i+","+j);
                numbers[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        array_2dimensional obj = new array_2dimensional();
        obj.TwoDimensionalArray();
    }


}
