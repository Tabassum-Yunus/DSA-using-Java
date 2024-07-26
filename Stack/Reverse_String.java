package Stack;

import java.util.Scanner;
import java.util.Stack;

public class B_Reverse_String {
    
    public static String reverse(String str){
        Stack<Character> stk = new Stack<>();
        char[] st = str.toCharArray();
        for (char c: st) {
            stk.push(c);
        }
        int i=0;
        while(!stk.isEmpty()){
            st[i++] = stk.pop();
        }
        return new String(st);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 = sc.nextLine();
        
        System.out.println("Original String: "+str1);
        System.out.println("Reversed String: "+ reverse(str1));
        
        System.out.print("\nEnter string: ");
        String str = sc.nextLine();
        
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+ reverse(str));
    }
}
