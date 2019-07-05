package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CountWordPresenceAndReturnBoolean {
    public Map<String, Boolean> countingWordsInString(String[] array) {
        //Check for null string array
        if (array != null&&array.length>0) {
            Map<String, AtomicInteger> map = new HashMap<>();
            //Check the occurance
            for (String string : array) {
                map.putIfAbsent(string, new AtomicInteger(0));
                map.get(string).getAndIncrement();
            }
            Map<String, Boolean> stringBooleanMap = new HashMap<>();
            {
                //Iterate the map and set boolean values depending on the count of thet word
                map.forEach((key, value) ->
                {
                    //If word occurance greater than one print true
                    if (value.intValue() >= 2) {
                        stringBooleanMap.put(key, true);
                    }
                    //If word occurance less than two print false
                    else {
                        stringBooleanMap.put(key, false);
                    }
                });
                return stringBooleanMap;
            }
        } else
            return null;
    }
}
