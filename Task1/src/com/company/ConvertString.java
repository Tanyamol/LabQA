package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
public interface ConvertString {

    List<String> convertString(List<String> list);

    static List <String> checkOnNull(List <String> list) {
        return Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                ;
    }

}
