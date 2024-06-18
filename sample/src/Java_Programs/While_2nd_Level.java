package Java_Programs;

public class While_2nd_Level {
    public static void main(String[] args) {
        While_2nd_Level obj =new While_2nd_Level();
         obj.First_5odd_number();
        System.out.println("--------------------------------------------------");
        obj.Find_oddnum_300to250_divisible_by_9();
        System.out.println("--------------------------------------------------");
        obj.print1to100_divby_3and5();
        System.out.println("--------------------------------------------------");
        obj.divisibleby_9_count_given_range();
        System.out.println("-------------------------------------------------");
        obj.divisor_of_7_from_100to500();
    }

    // This method is used for
    // To find first 5 odd number's
    // Using WHILE-LOOP
    public void First_5odd_number(){
        System.out.println("******First 5 odd number*****");
        int i=1;
        int num=1;
        while(i<=5){
            System.out.println(num);
             num=num+2;
             i++;
        }
    }

    // This method is used for
    // To finding the 300 to 250 range number that divisible by 9
    // Using WHILE-LOOP (while+if)

    void Find_oddnum_300to250_divisible_by_9(){
        System.out.println("*****Finding the 300 to 250 range number that divisible by 9*******");
        int i=250;
        while(i<=300){
            if(i%9==0){
                System.out.println(i);
            }
            i++;
        }
    }

    // This method is used for
    // To printing the 1-100 that divisible by 3 and 5
    // Using WHILE-LOOP (while+if)

    void print1to100_divby_3and5(){
        System.out.println("printing the 1-100 that divisible by 3 and 5");
        System.out.println();
        int i=1;
        while(i<=100){
            if(i%3==0 || i%5==0){
                System.out.print(i+",");
            }
            i++;
        }
        System.out.println("--------------------------------------------------");

    }

    // This method is used for
    // print count of divisor(9) given range is 1-100
    // Using WHILE-LOOP (while+if)
    void divisibleby_9_count_given_range(){
        System.out.println("******divisible by 9 1 to 100 count*********");
        System.out.println();
        int i=1;
        int count=0;
        while(i<=100){
            if(i%9==0){
                count+=1;
            }
            i++;
        }
        System.out.println("divisibleby_9_count_given_range: "+count);
        System.out.println("--------------------------------------------------");

    }
    // This method used for
    // print the divisor of 7 from 100-500 then which are greaterthan 450
    // Using WHILE-LOOP (while+if)
    void divisor_of_7_from_100to500(){
        System.out.println("divisible by 7, 100 to  500 which are greaterthan 450");
        System.out.println();
        int i=100;
        while(i<=500){
            if(i>=450){
                if(i%7==0){
                    System.out.println("greaterthan 450 divisible by 7 values :"+i);
                }
            }

            i++;
        }
    }


}
