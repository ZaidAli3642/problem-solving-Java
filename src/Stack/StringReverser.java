package Stack;

import java.util.Stack;

public class StringReverser {

    public String reverse(String str){
        StringBuffer reversed = new StringBuffer();
        for(int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }

    public String reverseString(String str){

        if(str == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
