package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentsdetailsTest {
    MainTest obj;

    @Before
    public void setUp() throws Exception {
        obj=new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void studentInfo() {
        Student obj1 = new Student(101, "Sai", 23);
        Student obj3 = new Student(102, "Virat", 27);
        Student obj5 = new Student(103, "Pandu", 24);
        Student obj4 = new Student(104, "Dhoni", 23);
        Student obj2 = new Student(105, "Anjali", 25);
        List<Student> list=new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans=obj.studentInfo();
        String expected="",actual="";
        for(int i=0;i<list.size();i++) {
            expected+=list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" ";
        }
        for(int j=0;j<ans.size();j++){
            actual+=ans.get(j).getId()+" "+ans.get(j).getName()+" "+ans.get(j).getAge()+" ";

        }
        assertEquals(expected,actual);
    }

}