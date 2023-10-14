package LinkedList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;


    public void addFirst(int item){
        Node node =  new Node(item);

        if(isEmpty()){
            first = last = node;
        } else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item){
       Node node =  new Node(item);

       if(isEmpty())
           first = last = node;
       else{
           last.next = node;
           last = node;
       }
       size++;
    }

    public void deleteFirst(){
        if(isEmpty()) return;

        if(first == last)
            first = last = null;
        else{
            first = first.next;
        }
        size--;
    }

    public void deleteLast(){
        if(isEmpty()) return;

        if(first == last)
            first = last = null;
        else{
           Node previous =  getPrevious(last);
            previous.next = null;
            last = previous;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public boolean contains(int value){
        Node current = first;
        while (current != null){
            if(current.value == value) return true;
            current = current.next;
        }

        return false;
    }

    public int indexOf(int value){
        int index = 0;
        Node current = first;
        while (current != null){
            if(current.value == value) return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        var current = first;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse(){
        Node previous = null;
        Node current = first;
        Node temp;

        while (current != null){
            temp = current.next;
            current.next = previous;
            previous = current;

            current = temp;
        }

        last = first;
        first = previous;
        System.out.println();
    }

    public int getKthNodeFromEnd(int k){
        var a = first;
        var b = first;
        for (int i = 0; i < k; i++){
            b = b.next;
            if(b == null)
                throw new IllegalArgumentException();
        }

        while (b != null){
            a = a.next;
            b = b.next;
        }

        return  a.value;
    }

    public void middle(){
        var fast = first;
        var slow = first;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;         // Keep track of the node before the slow pointer
            slow = slow.next;    // Move slow by one step
            fast = fast.next.next; // Move fast by two steps
        }

        if (prev != null) {
            prev.next = null; // Disconnect the list at the middle to get two separate lists
        }

        if (fast == null) {
            // Even number of nodes
            System.out.println("EVEN : " + prev.value + " " + slow.value);
        } else {
            // Odd number of nodes
            System.out.println("ODD : " + slow.value );
        }
    }

    public boolean hasLoop() {
        var fast = first;
        var slow = first;

        while (fast != null && fast.next != null){
            if(fast != first && fast == slow) return true;

            fast = fast.next.next;
            slow = slow.next;

        }

        return  false;
    }

    /**
     * @return a linked list that contains a loop.
     */
    public static LinkedList createWithLoop(){
        var list = new LinkedList();
        list.addLast(32);
        list.addLast(4);
        list.addLast(1);

        // get reference to a node in the middle
        var node = list.last;

        list.addLast(7);
        list.addLast(9);

        // loop tail to mid node.
        list.last.next = node;

        return list;
    }

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrevious(Node node){
        Node current = first;

        while (current != null){
            if(current.next == node) break;
            current = current.next;
        }

        return current;

    }

}
