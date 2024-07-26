package Stack;

import java.util.Stack;

public class E_Remove_Stars_From_String {
    
    public static String removeStars(String str){
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for(char c:ch){
            stk.push(c);
        }
   
        while(!stk.isEmpty()) {
            char p = stk.pop();
            if(p != '*')
                sb.append(p);
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String str = "M*y *Str**i*ng";
        System.out.println("Original: "+ str);
        System.out.println("Remove Stras: "+ removeStars(str));
    }
}
