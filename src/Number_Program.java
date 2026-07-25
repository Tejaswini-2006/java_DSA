import java.util.*;
public class Number_Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power of number : ");
        int b = sc.nextInt();
        int p = 1 ;
        for(int i = 1 ; i<= b;i++){
            p = p * a ;
        }
        System.out.println(a+" power " + b + " is "+ p);
    }
}
