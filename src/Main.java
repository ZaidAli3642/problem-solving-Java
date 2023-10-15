import LinkedList.LinkedList;
import Stack.Expression;
import Stack.StringReverser;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        System.out.println(expression.isBalanced("{a * (a+b) + b}"));
    }

}