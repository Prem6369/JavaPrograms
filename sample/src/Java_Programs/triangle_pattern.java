package Java_Programs;

import java.util.Scanner;

public class triangle_pattern {

    public static void main(String[] args) {
         triangle_pattern obj = new triangle_pattern();
         obj.trianglePattern();
         obj.reversetriangle_patter();
    }
    public void trianglePattern() {
       for (int i=0;i<=6;i++){
           for(int j=0;j<=i;j++){
               if((i+j)%2==0){
                   System.out.print(0+" ");
               }
               else {
                   System.out.print(1+" ");
               }
           }
           System.out.println();
       }
    }

    public void reversetriangle_patter(){
        for(int i=0;i<=5;i++){
            for (int j =i;j<=5;j++){
                if((i+j)%2==0){
                    System.out.print(0+" ");
                }
                else {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
