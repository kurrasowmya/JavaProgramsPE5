package com.stackroute.PE5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceArrayListElementsTest {
    ReplaceArrayListElements obj;
    @org.junit.Before
    public void setUp() throws Exception {
        obj=new ReplaceArrayListElements();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void givenStringContainingdtIsCheckedForCharacterAndreplaceswithNewCharAndNewStringIsReturned()
    {
        String result=obj.arrayUpdate().toString();
        assertEquals("[Kiwi, Grape, Mango, Berry]",result);
    }
    @Test
    public void givenStringisemptyContainingdtIsCheckedForCharacterAndreplaceswithNewCharAndNewStringIsReturned()
    {
        String result=obj.removeArrayElement().toString();
        assertEquals("[]",result);
    }

}