package Stack;

public class Stack {
    private int[] stack;
    private int size = 0;

    public Stack(int size){
        stack = new int[size];
    }



    public void push(int item){
        increaseArraySize();
        stack[size++] = item;
    }

    public int pop(){
        if(isEmpty()) return -1;
        return  stack[--size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return stack[size - 1];
    }

    private void increaseArraySize(){
        if(size < stack.length) return;

        int[] newStack = new int[size * 2];

        for(int i = 0; i < size; i++)
            newStack[i] = stack[i];

        stack = newStack;
    }
}
