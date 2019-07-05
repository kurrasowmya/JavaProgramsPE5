package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfStringByMapTest {
    CountOfStringByMap obj;
    @Before
    public void setUp() throws Exception {
        obj=new CountOfStringByMap();
    }
    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void givenStringistakenForWordCountAndWordWithCountIsreturned()
    {
        String result=obj.countingWordsInString("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",result);
    }
    @Test
    public void givenNullStringistakenForWorsCountAndNullIsReturned()
    {
        String result=obj.countingWordsInString("");
        assertNotEquals("=1",result);
    }
    @Test
    public void givenStringWithAllSpecialCharcatersIsTakenForWordCountAndEmptySetIsReturned()
    {
        String result=obj.countingWordsInString("@!*");
        assertNotNull(result);
    }
}