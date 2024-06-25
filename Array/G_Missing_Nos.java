package Array;

public class G_Missing_Nos {
    
    public static void missingNo(int[] arr){
        System.out.print("Missing Numbers: ");
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = arr[i]+1; j < arr[i+1]; j++) 
            {
                System.out.print((j)+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,5,8,9,10,15};
        missingNo(arr);
    }
}
