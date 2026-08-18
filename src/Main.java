//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main ( String[] args){
        System.out.println("Hello World");
    }
} */
import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                        evenSum += num;
                    } else {
                        oddSum += num;
                    }
                }

                System.out.println("Sum of even integers: " + evenSum);
                System.out.println("Sum of odd integers: " + oddSum);

                sc.close();




        /*System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("My name is " + name + ".My age is " + age + ".I live in "+ city);
        sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b ;
        if (a > b){
            int diff = a - b ;
            System.out.println("Difference of "+ a + " - " + b + " is " + diff);
        }
        else {
            int diff = b - a ;
            System.out.println("Difference of "+ b + " - " + a + " is " + diff);
        }
        int diff = a - b ;
        System.out.println("Difference of "+ a + " - " + b + " is " + diff);
        int mul = a * b ;
        System.out.println("Multiplication of "+ a + " x " + b + " is " + mul);
        try {
            int div = a / b;
            System.out.println("Division of"+a+" / " + b + " is "+div);

        }
        catch(Exception f){
            System.out.println(f);
        }
        int rem = a % b ;
        System.out.println("Remainder : " + rem);
        System.out.println("Before Swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        int c = a ;
        a = b;
        b = c;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.print("Enter temperature in celsius : ");
        int a = sc.nextInt();
        int b = ((a * 9) / 5 ) + 32;
        System.out.println("temperature in farehnite: " +b);*/

    }
}