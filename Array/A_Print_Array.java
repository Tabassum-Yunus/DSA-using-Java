package Array;

class PrintArray{
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}

public class A_Print_Array {
    public static void main(String[] args) {
        PrintArray p = new PrintArray();
        p.print(new int[9]);        // pirnt 0 bydefault
        int[] a = new int[]{7,4,5,2};   // int[] a = {7,4,5,2};
        p.print(a);
    }
}


