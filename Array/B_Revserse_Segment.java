package Array;

public class B_Revserse_Segment {
    public static int[] reverse(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        print(arr);
        arr = reverse(arr, 2,6);
        print(arr);
    }
}
