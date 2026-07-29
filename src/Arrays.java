import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size] ;
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse Array are : ");
        for(int i = size - 1; i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
        /*int t = arr[0];
        for(int i = 0 ; i < size ; i++){
            if(arr[i]>t){
                t = arr[i];
            }
        }System.out.println("Array largest elements " + t);
        for(int i = 0;i < size;i++){
            if(arr[i]<t){
                t = arr[i];
            }
        }System.out.println("Smallest array element: " + t);
        int sum = 0 ;
        for(int i = 0 ;i<size;i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of Array: "+ sum );
        int sum = 0 ;
        for(int i = 0; i< size; i++){
            sum = sum + arr[i];
        }
        int avg = sum / size;
        System.out.print("Average: "+ avg);*/
    }
}
