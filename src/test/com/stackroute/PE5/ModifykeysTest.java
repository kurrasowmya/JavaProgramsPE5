package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifykeysTest {
    Modifykeys object;

    @Before
    public void setUp() throws Exception {
        object=new Modifykeys();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void modifyKeyValueInMap() {
        Map<String,String> input=new HashMap<String, String>();
        input.put("value1","mars");
        input.put("value2","saturn");
        Map<String,String> result=new HashMap<String, String>();
        result.put("value1","mars");
        result.put("value2","saturn");
        assertEquals(result,object.modifyKeyValueInMap(input));
    }
    @Test
    public void modifyKeyValueInMap1() {
        Map<String,String> input=new HashMap<String, String>();
        input.put("value1","JAVA");
        input.put("value2","C++");
        Map<String,String> result=new HashMap<String, String>();
        result.put("value1","JAVA");
        result.put("value2","C++");
        assertEquals(result,object.modifyKeyValueInMap(input));
    }

}