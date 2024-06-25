package Array;

public class E_Resize_Array {
    
    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Size of array: "+ arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        arr = resize(arr,10);
        System.out.println("Resized array: "+ arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
