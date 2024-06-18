package Java_Programs;

public class Geometric {
    public static void main(String[] args) {
        Geometric obj = new Geometric();
        obj.geometric(5);
    }
    // This method is for find a GEOMETRIC NUMBER
    // The sum of the term is geometric series
    // 5 10 20 40 80......

    void geometric(int a){
        System.out.println("---------Geometric--------");
        for(int i=0;i<10;i++){
            int sum=0;  
            sum=a+a;
            System.out.println(sum);
            a=sum;}

    }

    }

