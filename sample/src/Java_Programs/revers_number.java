package Java_Programs;

public class revers_number {

    public static void main(String[] args) {
        revers_number obj = new revers_number();
        obj.reversnumber();

        System.out.println("reverse number :"+obj.reversenumber(93942343));
    }

    public void reversnumber() {
        int i [] ={1,2,3,4,5,6};
        for (int a=6;a>=0;a--){
            System.out.print(a);
        }
        System.out.println();
    }

    public int reversenumber(int a){
        System.out.println("Given Number :"+a);
        int reverse=0;
        while (a!=0){
            int lastdigit=a%10;
            reverse=reverse*10+lastdigit;
            a=a/10;


        }
        return reverse;
    }
}
