package com.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

    private List<Person> filterList = new ArrayList<>();


    public List<Person> addList() {

        filterList.add(new Person("Alex", 22, "male"));
        filterList.add(new Person("Max", 24, "male"));
        filterList.add(new Person("George", 32, "male"));
        filterList.add(new Person("Lilia", 22, "female"));
        filterList.add(new Person("Katya", 42, "female"));
        filterList.add(new Person("Sophia", 35, "female"));

        return filterList;

    }

    public void checkMenForService() {

        List<Person> list = filterList.stream()
                .filter(x -> x.getGender().equals("male"))
                .filter(x -> x.getAge() > 18 && x.getAge() < 25)
                .collect(Collectors.toList());
        System.out.println(" The men for military service: " + list);
    }

    public void countAverageWomanYear() {

        Double averageYear = filterList.stream()
                .filter(x -> x.getGender().equals("female"))
                .mapToDouble(x -> x.getAge()).average().orElse(0);
        System.out.println(" Average year of women: " + averageYear);
    }
}
