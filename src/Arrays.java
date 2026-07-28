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
        int t = arr[0];
        /*for(int i = 0 ; i < size ; i++){
            if(arr[i]>t){
                t = arr[i];
            }
        }System.out.println("Array largest elements " + t);*/
        for(int i = 0;i < size;i++){
            if(arr[i]<t){
                t = arr[i];
            }
        }System.out.println("Smallest array element: " + t);
    }
}
