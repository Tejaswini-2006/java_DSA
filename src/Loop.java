import java.util.*;
public class Loop {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int  n = sc.nextInt();
        int s = 0 ;
        while (n!= 0){
            s = s + 1;
            n = n / 10;
        }
        System.out.println("No. Of Digit: "+s);
        /*for (int i = 1; i < 11 ; i++){
            System.out.println(n+" x " + i + " = " + (n*i));
        }
        int s= 0 ;
       for (int i = 0 ; i <= n ; i++){
           s = s + i ;
       }
        System.out.println((s));
        for (int i = 1; i <=100;i++ ){
            if (i %2 != 0){
                System.out.println(i);
            }
        }
        for (int i = 1; i <=100;i++ ){
            if (i %2 == 0){
                System.out.println(i);
            }
        }
        for (int i = 100; i >= 1;i--){
            System.out.println(i);
        }
        for (int i = 1; i <= 100;i++){
            System.out.println(i);
        }*/
    }
}
