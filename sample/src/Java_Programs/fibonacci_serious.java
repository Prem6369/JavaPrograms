package Java_Programs;

public class fibonacci_serious {
    public static void main(String[] args) {
        fibonacci_serious obj =new fibonacci_serious();
        obj.fibonacci(10);
        obj.fibonacci2(0);
        obj.fibonacci3_2variable(10);
    }

    void fibonacci(int n) {
        int a=0;
        int b=1;
        int sum;
        System.out.println("********** Fibinocci Series **********");
        System.out.print("0, 1, ");

        for(int i = 1; i <= n; i++) {
            sum=a+b;
            System.out.print(sum+", ");
            a=b;
            b=sum;
        }
    }

    void fibonacci2(int n) {

        ////Logic... initial 2 value will be set 0,1
        ////add 1st and 2nd value store one varibale and print
        ////then swap the variable a=b,b=sum
        ////0 1 1 2 3 5 8=>0+1,1+1,1+2,2+3,3+5,5+8 like this
        System.out.println();
        System.out.println("-------fibonacii series-------");
        int firstnum=0;
        int secondnum=1;
        int sum;

        if(n==0){
            System.out.println(firstnum);
        }
        else{
            System.out.print("0, 1, ");
            for(int i=1; i<=n; i++) {
                sum=firstnum+secondnum;
                System.out.print(sum+", ");
                firstnum=secondnum;
                secondnum=sum;
            }
        }

    }

    void fibonacci3_2variable(int n) {
        int first=0;
        int second=1;
        if(n==0){
            System.out.println(first);
        } else {
            System.out.print(first+", "+second+", ");

            for(int i=1;i<=n;i++){
                System.out.print(first+second+", ");
                second=first+second;
                first=second-first;

            }
        }
    }
}
