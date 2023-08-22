package Assignment.DataStructures;

import java.util.Iterator;

public class ListArray {
    private String[] elements;
    private int size;
    private boolean isEmpty;
    private int element;

    public ListArray(){
        final int DEFAULT_CAPACITY = 10;
        elements = new String[DEFAULT_CAPACITY];
    }
    public boolean isEmpty(){
        if(size == 0) isEmpty = true;
        return isEmpty;
    }
    private String add;
    public void add(String element) {
        elements[size] = element;
        size++;
    }
    public String get(int index){
        return elements[index];
    }
//    public void clear(String element){
//
//        clear[element] = element;
//    }

}
