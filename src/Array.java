public class Array {
    private int[] array;
    private int size = 0;

    public Array(){
        array = new int[3];
    }

    private void increaseArraySize(){
        int[] newArray = new int[size * 2];

        for(int i = 0; i < size; i++)
            newArray[i] = array[i];

        array = newArray;
    }

    public void insert(int value){
        if(size >= array.length) increaseArraySize();

        array[size++] = value;
    }
    
    public void removeAt(int index){
        if(index < 0 || index >= size) throw new IllegalArgumentException();
        
        for(int i = index; i < size; i++)
            array[i] = array[i+1];

        size--;
    }

    public int indexOf(int value){
        for(int i = 0; i < size; i++)
            if(array[i] == value) return i;

        return  -1;
    }

    public int length(){
        return size;
    }

    public void print(){
        for(int i = 0; i< size; i++)
            System.out.println(array[i]);
    }
}
