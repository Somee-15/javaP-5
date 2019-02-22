package com.stackroute.unitTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortedNameTest {
    SortedName sn;

    @org.junit.Before
    public void setUp() throws Exception {
        sn=new SortedName();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void sortingName() {
        Set<String> names=new HashSet<String>();
        names.add("Harry");
        names.add("Olive");
        names.add("Alice");
        names.add("Bluto");
        names.add("Eugene");
        Set<String> nameList = new LinkedHashSet<String>();
        nameList.add("Alice");
        nameList.add("Bluto");
        nameList.add("Eugene");
        nameList.add("Harry");
        nameList.add("Olive");

        ArrayList<String> al = new ArrayList<>();
        al.addAll(nameList);

        Set<Object> objects = new LinkedHashSet<>();
        objects.add(nameList);
        objects.add(al);

        assertEquals(objects,sn.sortingName(names));
    }
}