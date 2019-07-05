package com.stackroute.PE5;
import java.util.*;

public class SortIngWithSetInterface {
        public Set<String> sortArraySet(Set<String> set) {
        List<String> list = new ArrayList<String>();
        //add all the elements to list
        list.addAll(set);
        //sort the list
        Collections.sort(list);
        Set<String> newSet=new LinkedHashSet<String>(list);
        return newSet;
    }
    }

