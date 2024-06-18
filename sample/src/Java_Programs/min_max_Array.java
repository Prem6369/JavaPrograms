package Java_Programs;

import java.util.Scanner;

public class min_max_Array {
    public static void main(String[] args) {
        min_max_Array obj = new min_max_Array();
        obj.maximum();
        obj.minimum();
        obj.maximum_Dynamic();
        obj.minimum_Dynamic();
    }


                ////Static values ///

    void maximum(){
        int number [] = {22,33,12,22,3,35,67,53,2,4,6};
        int max = number[0];
        for (int i =1;i<number.length;i++){
            if(max<number[i]){
                max = number[i];
            }
        }
        System.out.println("maximum values is :"+max);

    }

    void minimum(){
        int numbers [] = {39,3,32,3,4,5,6,7,7,54,3,3,5,6,9,9,8,7,6,6,5,444,3,33,32,2};
        int min = numbers[0];
        for(int i =1;i<numbers.length;i++){
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("minimum values is :"+min);
    }


            ////Dynamic values////
    void maximum_Dynamic(){
        int numbers [];

        System.out.print("Enter the Array size:");
        Scanner sc = new Scanner(System.in);
        numbers = new int[sc.nextInt()];
        int max =numbers[0];
        for (int i=0;i<numbers.length;i++){
            System.out.print("Enter the array elements :");
            numbers[i]=sc.nextInt();
            if(max<numbers[i]){
                    max=numbers[i];
            }
//            System.out.println("Array is :"+numbers[i]);

        }
        for(int i : numbers){
            System.out.print(i+",");
        }
        System.out.println("");
        System.out.println("Maximum value is :"+max);

    }

    void minimum_Dynamic(){
        System.out.print("Enter the Array size:");
        Scanner sc = new Scanner(System.in);
        int numbers [];
        numbers = new int[sc.nextInt()];
        int min =Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            System.out.print("Enter the Array Element:");
            numbers[i]=sc.nextInt();
            if(min>numbers[i]){
                min=numbers[i];
            }

        }

        for(int i : numbers){
            System.out.print(i+",");
        }
        System.out.print("minumum values is :"+min);
    }

}
