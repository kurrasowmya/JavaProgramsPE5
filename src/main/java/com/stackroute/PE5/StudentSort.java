package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class StudentSort implements Comparator<Student> {

    public int compare(Student stu1,Student stu2) {
        if(stu1.getAge()>stu2.getAge())
            return stu1.getAge()-stu2.getAge();
        else if(stu1.getAge()==stu2.getAge()&&!stu1.getName().equals(stu2.getName()))
            return stu1.getName().compareToIgnoreCase(stu2.getName());
        else
            return stu1.getId()-stu2.getId();
    }

}
