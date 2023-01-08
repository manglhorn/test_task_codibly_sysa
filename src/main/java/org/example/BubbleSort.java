package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class BubbleSort {
    public List<?> checkForNull(List<?> list) {
        if (list == null) {
            throw new RuntimeException("input param is null");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                list.remove(null);
            }
        }
        return list;
    }

    public List<?> sortGeneral(List<?> list) {
        List<?> objects = checkForNull(list);
        return objects.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
