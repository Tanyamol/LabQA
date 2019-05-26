package com.company;

public class Main {

    public static void main(String[] args) {

        int max = 10;
        int min = 1;
        int size = 5;

        CollectionClass listObject = new CollectionClass(size, max, min);
        System.out.println(listObject.initialList());
        System.out.println(listObject.initialSet());
    }
}
