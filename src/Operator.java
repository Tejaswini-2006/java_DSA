import java.util.*;
public class Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int c = sc.nextInt();
        System.out.print("Enter operator (+ - *  / % ): ");
        char b = sc.next().charAt(0);
        switch(b){
            case '+':
                System.out.println("Addition: "+(a+c));
                break;
            case '-':
                System.out.println("Subtraction: "+(a-c));
                break;
            case '*':
                System.out.println("Multiplication: "+(a*c));
                break;
            case '%':
                System.out.println("Remainder: "+(a%c));
                break;
            case '/':
                if (c!= 0){
                    System.out.println("Division: " +(a/c));
                }else{
                    System.out.println("Zero cannot divide");
                }
                break;
            default:
                System.out.println("Invalid");
        }

        /*if (a%2 == 0){
            System.out.println(a + " is even number.");
        }
        else{
            System.out.println(a + " is a odd number.");
        }
        if (a == 0){
            System.out.println("number is zero");
        }
        else if(a > 0){
            System.out.println(a+" is positive");
        }
        else{
            System.out.println(a+" number is negative");
        }
        if (a>b && a > c){
            System.out.println(a + " is a largest number.");
        }
        else if(b > a && b > c){
            System.out.println(b + " ia a largest number.");
        }
        else{
            System.out.println(c + " ia a largest number.");
        }
        if ((a % 400) == 0 ||((a %4) == 0 && (a% 100 != 0) )){
            System.out.println(a + " is a leap year");
        }
        else {
            System.out.println(a + " is not a leap year");
        }
        System.out.print("Enter your character: ");
        char a = sc.next().charAt(0);
        if ( (a == 'a') || (a == 'e') ||(a == 'i') ||(a == 'o')
                ||(a == 'u') ||(a == 'A') ||(a == 'E') ||(a == 'I') ||(a == 'O') ||(a == 'U') ){
            System.out.println(a + " is a vowel.");
        }
        else{
            System.out.println(a + " is a consonant");
        }
        if (b < 0){
            int r = b * -1 ;
            System.out.println(r);
        }
        else{
            System.out.println(b);
        }
        if ( (b%5 == 0) && (b%11 == 0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if (b >= 'A' && b <= 'Z'){
            System.out.println(b + " is a uppercase letter.");
        }
        else if (b >= 'a' && b <= 'z'){
            System.out.println(b + " is a lowercase letter.");
        }
        else{
            System.out.println("Invalid");
        }*/

    }
}
