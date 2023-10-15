package Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int front = 0;
    private int rear = 0;
    private int capacity;

    private int size = 0;

    public ArrayQueue(int size){
        queue = new int[size];
        capacity = size;
    }

    public void enqueue(int item){
        if(isFull()) return;

        queue[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int peek(){
        if(isEmpty()) return -1;

        return queue[front];
    }

    public int dequeue(){
        if(isEmpty()) return -1;

        var item = queue[front];
        queue[front] = 0;
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(queue);
    }
}
