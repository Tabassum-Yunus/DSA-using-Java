package Array;
import java.util.Scanner;
public class H_Palindrome {
    
    public static boolean isPalindrome(String str){
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length/2; i++) {
            if(charArr[i] != charArr[charArr.length-1-i])
                return false;
        }
        return true;
    }
    
    public static boolean isPalindrom(String str){
        char[] charArr = str.toCharArray();
        int start = 0, end = charArr.length-1;
        while(start<end)
        {
            if(charArr[start] != charArr[end])
                return false;
            start++;
            end--;
        }
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        boolean is = isPalindrom(str);
        if(is)
            System.out.println("Yes, Palindrome");
        else
            System.out.println("Nope");
    }
}
