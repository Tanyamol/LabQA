package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

    Integer[] array;
    Integer [] newArray;
    int count;

    public int setLength() {

        System.out.println("Input length of array");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        return count;
    }

    public Integer[] initArray(int length) {
        if (length < 0) {
            System.out.println("The length less then 0");
        }
        array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = ((int) (((Math.random() * 100) - 30)));
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public Integer[] sortArray(Integer[] array) {
        if (array == null) {
            System.out.println(" Array cannot be null");
        }
        newArray = Arrays.copyOf(array, count);
        Arrays.sort(newArray, ((o1, o2) ->
                o1.compareTo(o2) * -1)
        );
        return newArray;
    }

    public Integer[] filterArray(){

     return Arrays.stream(array)
             .filter(num -> num % 2 == 0)
             .toArray(Integer[]:: new);
    }

}
