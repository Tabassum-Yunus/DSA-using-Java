package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class B_Generate_numbers {
    
    public static String[] genBinaryNos(int n){
        Queue<String> q = new LinkedList<>();
        String[] arr = new String[n];
        q.offer("1");   String  n1, n2;
        for (int i = 0; i < n; i++) {
            arr[i] = q.poll();
            n1 = arr[i]+"0";
            n2 = arr[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return arr;  
    }
    
    public static void main(String[] args) {
        String[] arr ;
        arr = genBinaryNos(30);
        for(String i:arr){
            System.out.print(i+"  ");
        }
    }

    
}
