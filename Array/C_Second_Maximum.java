package Array;

public class C_Second_Maximum {
    
    public static int secMax(int[] arr){
        int max = arr[0], smax=max;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
            {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] != max)
            {
                smax = arr[i];
            }
        }
        return smax;
    }
        
    public static void main(String[] args) {
        int[] arr = new int[]{12,34,2,34,33,1};
        System.out.println("Second max: "+ secMax(arr));
    }
}
