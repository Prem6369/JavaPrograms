package Java_Programs;

import java.util.ArrayList;

public class array_example {

    void array(){
        String names[] ={"vivka","tamil","sathish","prem"};

        for (String i: names){
            System.out.println("From I:"+i);
        }
        for (String name : names) {
            System.out.println("From name:"+name);
        }

        for (int i=0;i<names.length;i++){
            System.out.println("person names:"+names[i]);
        }

        ArrayList<String> products =new ArrayList<>();
        products.add("soap");
        products.add("ghee");
        products.add("dal");

        for (int i=0;i<products.size();i++){
            System.out.println("product:"+products.get(i));
            products.remove("dal");
            System.out.println("product:"+products.get(i));
        }

    }

    //sum of integer
    void sum_of_array(){
        int [] a={2,3,3,2,3,4,21,2,3,4};
        int sum=0;
        for (int i =0;i<a.length;i++){
            sum+=a[i];
            System.out.println("Sum of total is:"+sum);
        }
    }

    public static void main(String[] args) {
        array_example obj = new array_example();
        obj.array();
        obj.sum_of_array();
        triangle_pattern obj1 = new triangle_pattern();
        obj1.trianglePattern();

    }

}
