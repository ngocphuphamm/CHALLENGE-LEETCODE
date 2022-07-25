import java.util.Stack;

public class App {
    //https://leetcode.com/problems/valid-parentheses/
    public static boolean isValid(String s) {
        s.toCharArray();
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
            {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == '}' && stack.peek() == '{')
            {
                stack.pop();
            }
            if(s.charAt(i) == ']' && stack.peek() == '[')
            {
                stack.pop();
            }
            if(s.charAt(i) == ')' && stack.peek() == '(')
            {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        String s = "()";
        boolean f = isValid(s);
        System.out.println(f);

    }
}

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false; //base case, all elements need to have a pair. So total count should be even 
        }
        
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){  //push all opening braces to stack & compare them with closed ones later. 
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(' ){ //if top element in stack is ( and given element is ) then remove that pair. 
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else{
                return false; //when cases like }}, )), ([}}]) this will return false
            }  //stack.push(c)
        }
        return stack.isEmpty(); //when every pair is removed then stack becomes empty & it is true. else false
    }
}
