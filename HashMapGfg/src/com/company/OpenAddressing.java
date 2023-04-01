package com.company;

public class OpenAddressing {
    public static void main(String[] args) {
    MyHashh ob = new MyHashh(7);
    ob.storingTheValue();
//    ob.insert(49);

//        ob.insert(63);
//        ob.insert(56);
//        ob.insert(52);
//        ob.insert(54);
//        ob.insert(48);
        ob.insert(63);
        ob.insert(70);
        ob.insert(77);
        ob.delete(70);
        ob.insert(77);
        System.out.println(ob.search(15));
        System.out.println(ob.search(64));
        ob.printElement();




    }
}
class MyHashh {
    int storage ;
    int[] array;
    int size;

    MyHashh(int capacity){
        storage = capacity;
         array = new int[storage];

    }

    void storingTheValue(){
        for(int i=0;i<storage;i++){
            array[i] = -1;
        }
    }
    boolean search(int element){
        int h1 = element % storage;
        int start = h1;
        if(array[h1] == element){
            return true;
        }
        if(array[h1] == -1){
            return false;
        }
        h1 = (h1 + 1) % storage;
        while(array[h1] != element && array[h1] != -1){
            if(h1 == start){
                return false;
            }
            h1 = (h1 + 1) % storage;
        }
        if(array[h1] == element){
            return true;
        }
        if(array[h1] == -1){
            return false;
        }
        return false;

    }
    boolean insert(int element){
        int h1 = element % storage;
        int start = h1;
        if(size == storage){
            return false;
        }
        if(array[h1] == -1){
            array[h1] = element;
            size++;
            return true;
        }
        if(array[h1] == -2){
            array[h1] = element;
            size++;
            return true;
        }
        h1= (h1+1) % storage;
        while((array[h1] != -1)  && (array[h1] != -2) && (array[h1] != element)){// when the space is not empty and deleted


            h1= (h1+1) % storage;
        }
        if(array[h1] == element){
            return false;
        }
        if(array[h1] == -1){
            array[h1] = element;
            size++;
            return true;
        }
        if(array[h1] == -2){
            array[h1] = element;
            size++;
            return true;
        }
        return false;


    }
    boolean delete(int element){
        int h1 = element % storage;
        int start = h1;
        if(array[h1] == element){
            array[h1] = -2;
            size--;
            return true;
        }
        if(array[h1] == -1){
            return false;
        }
        h1 = (h1 + 1) % storage;
        while(array[h1] != element && array[h1] != -1){
            if(h1 == start){
                return false;
            }
            h1 = (h1 + 1) % storage;
        }
        if(array[h1] == element){
            array[h1] = -2;
            size--;
            return true;
        }
        if(array[h1] == -1){
            return false;
        }


        return false;
    }
    void printElement(){
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
