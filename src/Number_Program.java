import java.util.*;
public class Number_Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int og = sc.nextInt();
        /*System.out.print("Enter the power of number : ");
        int b = sc.nextInt();
        int p = 1 ;
        for(int i = 1 ; i<= b;i++){
            p = p * a ;
        }
        System.out.println(a+" power " + b + " is "+ p);*/
        int a = og ;
        int rev = 0 ;
        while(a != 0){
            int d = a % 10 ;
            rev = rev * 10 + d ;
            a = a / 10 ;
        }
        if ( og == rev ){
            System.out.println( og + " is a palindrome number.");
        }
        else{
            System.out.println( og + " is not a palindrome number.");
        }
        sc.close();
    }
}
