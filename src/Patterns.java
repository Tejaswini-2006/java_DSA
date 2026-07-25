import java.util.*;
public class Patterns {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for to draw square: ");
        int a = sc.nextInt();
        /*for(int i =a ;i >= 1; i--){
            for(int j = 1; j < i;j++){
                System.out.print(j);
            }
            System.out.println(i);
        }*/
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
