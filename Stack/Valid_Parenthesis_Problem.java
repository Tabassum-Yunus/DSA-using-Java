package Stack;

import java.util.Stack;

public class D_Valid_Parenthesis_Problem {
    
    public static boolean isReverse(char top, char curr){
        if(top == '(')
            return curr==')';
        if(top == '[')
            return curr==']';
        if(top == '{')
            return curr=='}';
        return false;
    }
    
    public static boolean isValid(String str){
        if(str.length() == 1)
            return false;
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if(stk.isEmpty())
                stk.push(curr);
            else
            {
                char topChar = stk.peek();
                if(isReverse(topChar, curr))
                    stk.pop();
                else
                    stk.push(curr);
            }
        }
        return stk.isEmpty();
    }
    
    public static void main(String[] args) {
        String str = "{()[()]}";
        System.out.println("Is string has valid parenthesis? "+ isValid(str));
    }
}
