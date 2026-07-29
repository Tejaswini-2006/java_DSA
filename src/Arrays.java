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
        System.out.print("Enter the element which you want to search in array: ");
        int e = sc.nextInt();
        int flag = 0;
        int t = 0;
        for(int i = 0;i < size;i++ ){
            if (arr[i] == e){
                flag = 1;
                t = i;
            }
        }
        if( flag == 1){
            System.out.print(e + " is present in array at " + t + " position");
        }
        else{
            System.out.print(e + " is not present in array");
        }
        /*System.out.println("Reverse Array are : ");
        for(int i = size - 1; i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
        int t = arr[0];
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
