package Java_Programs;

import java.util.Scanner;

public class methods {
    void addition(){
        int a=10,b=30,c;
        c=a+b;
        System.out.println("total:"+c);
    }
    void sub(int a,int b){
        int c=a-b;
        System.out.println("sub:"+c);
    }
    int multi(int a,int b){
        int c =a*b;
        return c;
    }
    float div(int a,int b){
        float c =a/b;
        return c;
    }

    public String para(String a, String b) {
        return a + b;
    }

    String OddorEver(int a){
        if(a%2==0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        methods caller = new methods();
        caller.addition();
        caller.sub(30,20);
        int d = caller.multi(20,30);
        System.out.println("multi values:"+d+"   divvalues is :"+caller.div(10,5));
        String data=caller.para("I'm Premkumar   ","I a software Developer");

        System.out.println(data);
        System.out.print("Enter the number:");
        int number= console.nextInt();
        String result= caller.OddorEver(number);
        System.out.println(result);
    }


}
