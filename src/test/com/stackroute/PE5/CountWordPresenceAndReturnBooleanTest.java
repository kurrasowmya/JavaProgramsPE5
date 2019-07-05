package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountWordPresenceAndReturnBooleanTest {
    CountWordPresenceAndReturnBoolean obj;
    @Before
    public void setUp() throws Exception {
        obj=new CountWordPresenceAndReturnBoolean();
    }
    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void givenStringArrayShouldReturnsGreaterThandTwoTimesCountwithTrueAndFalseForNotGreaterThanTwo()
    {
        String[] array={"a","b","c","d","a","c","c"};
        Map<String,Boolean> result=obj.countingWordsInString(array);
        Map<String,Boolean> booleanMap=new HashMap<>();
        booleanMap.put("a",true);
        booleanMap.put("b",false);
        booleanMap.put("c",true);
        booleanMap.put("d",false);
        assertEquals(booleanMap,result);
    }
    @Test
    public void givenStringArrayShouldNotReturnsGreaterThandTwoTimesCountwithTrueAndFalseForNotGreaterThanTwo()
    {
        String[] array={"a"," "," "," ","a","c"};
        Map<String,Boolean> result=obj.countingWordsInString(array);
        Map<String,Boolean> booleanMap=new HashMap<>();
        booleanMap.put("a",false);
        booleanMap.put(" ",false);
        booleanMap.put("c",true);
        assertNotNull(result);
    }
    @Test
    public void givenNullStringArrayIsTakenIsCheckedAndItShouldReturnNull()
    {
        String[] array={};
        Map<String,Boolean> result=obj.countingWordsInString(array);
        assertNotEquals("false",result);
    }
}