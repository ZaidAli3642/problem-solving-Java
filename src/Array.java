public class Array {
    private int[] array;
    private int size = 0;

    public Array(){
        array = new int[5];
    }

    private void increaseArraySize(){
        if(size < array.length) return;

        int[] newArray = new int[size * 2];

        for(int i = 0; i < size; i++)
            newArray[i] = array[i];

        array = newArray;
    }

    public void insert(int value){

        increaseArraySize();
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

    public int max(){
        if(size == 0) return -1;
        if(size == 1) return array[0];

        int max = array[0];

        for(int i = 1; i < size; i++){
            if(array[i] > max) max = array[i];
        }
        return max;
    }

    public void reverse(){
        if(size == 0) return;

        int[] reversedArray = new int[size];
        for(int i = size - 1; i >= 0;i--)
            reversedArray[size - i - 1] = array[i];

        array = reversedArray;
    }

    public void insertAt(int value, int index){
        if(index < 0 || index > size) throw new IllegalArgumentException();

        increaseArraySize();

        for(int i = size - 1; i >= index; i--)
            array[i + 1] = array[i];

        array[index] = value;
        size++;

    }

    public void print(){
        for(int i = 0; i< size; i++)
            System.out.println(array[i]);
    }
}
