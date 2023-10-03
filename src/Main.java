public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);
        array.insert(70);
        array.insert(80);
        System.out.println(array.length());
        array.removeAt(4);
        System.out.println(array.length());
        array.print();
    }

}