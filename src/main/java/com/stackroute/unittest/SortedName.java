package com.stackroute.unitTest;

import java.util.*;

public class SortedName {
    public Set<Object> sortingName(Set name) {
        Set<String> value = new TreeSet<String>();
        value.addAll(name);


        ArrayList al = new ArrayList();
        al.addAll(value);

        Set<Object> objects = new LinkedHashSet<>();
        objects.add(value);
        objects.add(al);


        return objects;
    }
}
