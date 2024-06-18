package Java_Programs;

import java.util.Scanner;

public class add_digit_until_singledigit {

    public static void main(String[] args) {
        add_digit_until_singledigit obj = new add_digit_until_singledigit();
        obj.Single_number();
        obj.Array_SumOfDigit();
    }

        ///this program find the sum of digits until become a single digit
        ///given one number means like
        ///INPUT-343 OUTPUT-3+4+3 =10 ->1+0=1 ,INPUT-232 OUTPUT-2+3+2=7


    public long Single_number() {
        long sum = 0;
        int local1;
        int local2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value  :");
        long a = sc.nextLong();

        int len_of_a = String.valueOf(a).length();
        local1 = len_of_a;


        if (local1 != 1) {
            for (int i = 0; i <= len_of_a; i++) {
                if (local1 != 0) {
                    sum = a % 10;
                    a = a / 10;
                    local2 += sum;
                    local1 = String.valueOf(a).length();
                }
            }
        } else {
            System.out.print("this is one digit number :" + a);
            return a;
        }
        System.out.println("Sorted value is :" + local2);
        System.out.println();
        return local2;
    }



        ///given one ARRAY means that value also sort the until single digit
        ///same as above but this time all elements in the array
    public long Array_SumOfDigit() {

        System.out.println("*******SUM OF VALUE BECOME UNTIL SINGLE DIGIT***********");
        long array1[];
        System.out.println("Enter the Array size:");
        Scanner sc = new Scanner(System.in);
        array1 = new long[(int) sc.nextInt()];
        int local1 = 0;
        int local2 = 0;
        long sum = 0;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("enter the digit :" + i);
            array1[i] = sc.nextLong();
            System.out.println("given array is : " + array1[i]);
        }
        System.out.println("given array is : ");
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array1.length; i++) {

            int len_of_value = String.valueOf(array1[i]).length();
            local1 = len_of_value;
            if (len_of_value != 1) {
                for (int j = 0; j <= len_of_value; j++) {
                    if (local1 != 0) {
                        sum = array1[i] % 10;
                        array1[i] = array1[i] / 10;
                        local2 += sum;
                        local1 += String.valueOf(array1[i]).length();
                    }

                }

            } else {
                return array1[i];
            }
            System.out.println("final value" + local2);
            local2 = 0;
        }

        return local2;
    }
}
