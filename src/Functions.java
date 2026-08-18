import java.util.*;
public class Functions {
    /*public static double average(int a,int b,int c){
        double avg = (a + b + c)/3 ;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println(average(a,b,c));
    }*/
    /*public static int SumOfOdd(int n){
        int sum = 0 ;
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 != 0){
                sum = sum + i ;
            }
        }
        return sum ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Sum of all odd numbers from 1 to " + n + " is " + SumOfOdd(n));

    }*/
    public static void GreaterNumber(int a , int b){
        if ( a > b)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(b + " is greater than " + a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int y = sc.nextInt();
        GreaterNumber(x,y);
    }
}
