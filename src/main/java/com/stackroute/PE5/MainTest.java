package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public List<Student> studentInfo() {
        Student obj1 = new Student(101, "Sai", 23);
        Student obj2 = new Student(105, "Anjali", 25);
        Student obj3 = new Student(102, "Virat", 27);
        Student obj4 = new Student(104, "Dhoni", 23);
        Student obj5 = new Student(103, "Pandu", 24);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list, new StudentSort());
        return list;
    }


}
