package com.stackroute.PE5;

import java.util.ArrayList;

public class ReplaceArrayListElements {
    public ArrayList<String> myArray() {
        //Add elemnet
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Apple");
        ar.add("Grape");
        ar.add("Melon");
        ar.add("Berry");
        return ar;
    }
    public ArrayList<String> arrayUpdate()
    {
        ArrayList<String> array=myArray();
        //update the elements at particular index
        //Add element at 0 index
        array.set(0, "Kiwi");
        array.set(2,"Mango");
        return array;
    }
    public ArrayList<String> removeArrayElement()
    {
        //Empty the arraylist
        ArrayList<String> empty=arrayUpdate();
        empty.clear();
        return empty;
    }

}
