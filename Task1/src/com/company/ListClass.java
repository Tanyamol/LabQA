package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListClass  implements ConvertString{

    List<String> list;

    public List<String> createList() {
        list = new ArrayList<>();
        list.add("QA");
        list.add("Dev");
        list.add("BA");
        list.add("PM");
        list.add("PO");
        return list;
    }

    public List<String> sortList(List<String> list) {
        List<String> sortList = list
                .stream()
                .sorted(Comparator.comparing(n -> n.toString()))
                .collect(Collectors.toList());
        return sortList;
    }

    public void filterList(){
       list.stream()
               .filter(l -> l.startsWith("P"))
               .forEach(System.out::println);
    }
    public List<String> convertString(List <String> list){
        List <String> newList = new ArrayList<>();
        String convertString = "";
        for(String str: list){
            char [] ch = str.toCharArray();
            for(int i = str.length() - 1; i >= 0; i--){
                convertString+= ch[i];
            }
            convertString = convertString + " ";
        } newList.add(convertString);
        return newList;
    }

    public void UpperCase() {
        list.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
    }

}
