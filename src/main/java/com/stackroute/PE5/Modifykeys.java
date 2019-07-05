package com.stackroute.PE5;

import java.util.Map;

public class Modifykeys {
    public Map<String,String> modifyKeyValueInMap(Map<String,String> map){
        //iterate for map entry
        for(Map.Entry<String,String> entry:map.entrySet()){
            //check one value equals other and value not equals null
            if(entry.getKey().equals("val1")&&entry.getValue()!=null){
                //store entry in value of type string
                String value=entry.getValue();
                map.put("val1"," ");
                map.put("val2",value);
            }
            else{
                continue;
            }
        }
        return map;
    }
}
