package Array;
import java.util.Scanner;

public class F_A_Missing_No {
    
    public static int missingNo(int arr[], int n){
        int missNo, sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        missNo = n*(n+1)/2 - sum; 
        return missNo;
    }
    
    public static int misingNo(int[] arr, int n){
        int sum = n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of array: ");
        int range =  sc.nextInt();
        int[] arr = new int[range-1];
        System.out.println("Enter "+ (range-1) + " no in the range of "+ range+": ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing no: " + misingNo(arr,range));
    }
}
