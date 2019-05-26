package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListInteger listInteger = new ListInteger();
        System.out.println(listInteger.iterateInt());


        FilterList filterList = new FilterList();
        filterList.addList();
        filterList.checkMenForService();
        filterList.countAverageWomanYear();

    }

}
