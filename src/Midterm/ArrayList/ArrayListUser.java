package Midterm.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUser<E> {
    private int  size = 0;
    private int capacity;
    private E[] data;
    private static final int INITIAL_CAPACITY =10;


    public ArrayListUser(){
        capacity = INITIAL_CAPACITY;
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    public ArrayListUser(int capacity){
        this.capacity = capacity;
        data = (E[]) new Object[capacity];
    }
    public void reallocate(){
        capacity = 2*capacity;
        data = Arrays.copyOf(data,capacity);
    }

    public void add(E item){
        if(size == capacity){
            reallocate();
        }
        data[size++] = item;
    }

    public void add(int index, E item){
        if(index<0 || index>= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        for (int i = size; i >index ; i--) {
            data[i] = data[i-1];
        }
        data[index] = item;
        size++;
    }

    public E get(int index){
        if(index<0 || index>= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
       return data[index];
    }

    public E set(int index, E item){
        if(index<0 || index>= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E old = data[index];
        data[index] = item;
        return old;
    }
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E old = data[index];
        for (int i = index+1; i <size ; i++) {
            data[i-1] = data[i];
        }
        size--;
        return old;
    }
    public int getIndexOf(E item){
        for (int i = 0; i < size; i++) {
            if(data[i] == null && item == null){
                return i;
            }
            if(data[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

}
