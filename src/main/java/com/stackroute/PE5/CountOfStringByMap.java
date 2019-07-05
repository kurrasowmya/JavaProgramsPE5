package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class CountOfStringByMap {
    public String countingWordsInString(String string) {
        if(string!="") {
            //Replace special characters with space
            String alphaAndDigits = string.replaceAll("[^a-zA-Z0-9]+", " ");
            //Split the string based on space
            String[] splitstring = alphaAndDigits.split(" ");
            Map<String, Integer> hashmap = new HashMap<String, Integer>();
            for (int i = 0; i < splitstring.length; i++) {
                //check the occurance of the word and increase count accordingly
                if (hashmap.containsKey(splitstring[i])) {
                    int cont = hashmap.get(splitstring[i]);
                    hashmap.put(splitstring[i], cont + 1);
                } else {
                    hashmap.put(splitstring[i], 1);
                }
            }
            return hashmap.toString();
        }
        else
            return null;
    }
}

