package Array;

public class D_Move_Zeroes_atEnd {
    
    public static int[] move0s(int[] arr){
        int temp, j=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }      
        }
        return arr;
    }
    
//    public static int[] move0s(int[] arr){                // NOT WORKING
//        int temp, j=arr.length-1;
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] == 0 )
//            {
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j--;
//            }      
//        }
//        return arr;
//    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{8,1,0,2,1,0,0,3};
        print(arr);
        arr = move0s(arr);
        print(arr);
    }
}
