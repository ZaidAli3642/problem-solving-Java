import LinkedList.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      LinkedList linkedList =  new  LinkedList();
      linkedList.addLast(10);
      linkedList.addLast(20);
      linkedList.addLast(30);
      linkedList.addLast(40);
      linkedList.addLast(50);
      linkedList.addLast(60);

        var list = LinkedList.createWithLoop();
        System.out.println(list.hasLoop());
    }

}