package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBraces = Arrays.asList('(', '{', '[');
    private final List<Character> rightBraces = Arrays.asList(')', '}', ']');
    private int index = 0;



    public boolean isBalanced(String expression){
        Stack<Character> stack = new Stack();

        for(char ch : expression.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }

            if(isRightBracket(ch)) {
                if(stack.isEmpty()) return  false;

                char top =  stack.pop();
                if(!isBracketMatched(top, ch)) return  false;
            }
        }

        return stack.isEmpty();
    }




    private boolean isBracketMatched(char top, char ch){
        if(top != leftBraces.get(index)) return false;
        index++;
        return leftBraces.indexOf(top) == rightBraces.indexOf(ch);
    }

    private boolean isLeftBracket(char ch){
        return leftBraces.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBraces.contains(ch);
    }
}
