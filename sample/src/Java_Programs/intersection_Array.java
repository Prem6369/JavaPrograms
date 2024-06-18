package Java_Programs;

public class intersection_Array {
    void intersection(){

        int a [] ={1,2,8,7,4,3};
        int b [] ={3,5,1,4};


        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    int a1 = a[i];
                    System.out.print(a1+" ");

                }
            }
        }
    }
    public static void main(String[] args) {
        intersection_Array obj = new intersection_Array();
//        obj.intersection();
        obj.triangle();
    }

    public void triangle(){
        int row = 5;


        for (int i = 1;i<=row;i++){
            for (int j = i;j<=row;j++){
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
