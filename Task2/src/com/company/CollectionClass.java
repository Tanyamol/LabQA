package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClass {

    private int length;
    private int max;
    private int min;


    public CollectionClass(int length, int max, int min) {
        this.length = length;
        this.max = max;
        this.min = min;
    }

    public List<Integer> initialList() {
        List<Integer> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            list.add((int) (Math.random() * max) + min);
        }
        return list;
    }

    public Set<Integer> initialSet() {
        Set<Integer> set = new HashSet<>(length);
        do {
            int num = (int) (Math.random() * max) + min;
            set.add(num);
        } while (set.size() < length);
        return set;
    }

}
