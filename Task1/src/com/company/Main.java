package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        ArrayClass arrayObject = new ArrayClass();

        int size = arrayObject.setLength();

        Integer [] array = arrayObject.initArray(size);
        Integer [] sortArray = arrayObject.sortArray(array);

        System.out.println(Arrays.toString(sortArray));
        System.out.println(Arrays.toString(arrayObject.filterArray()));

        ListClass listObject = new ListClass();

        List<String> list = new ArrayList<>();

        list = listObject.createList();
        System.out.println(list);
        System.out.println(listObject.sortList(list));
        listObject.filterList();

           if(ConvertString.checkOnNull(list).isEmpty()) {
               System.out.println(" the list is null");

           }else {
               System.out.println(listObject.convertString(list));
               listObject.UpperCase();
           }


    }

}
