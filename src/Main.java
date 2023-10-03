public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);

        array.insertAt(25, 4);

        array.insertAt(25, 2);



        array.print();

    }

}