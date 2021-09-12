package com.practice.main.oops;

import java.util.HashMap;
import java.util.Map;

public enum Status {

    ACTIVE("Active", 1), IN_ACTIVE("In Active", 2);

    private final String key;
    private final Integer value;

    private static Map<Integer, Status> valueToTextMapping;

    Status(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public static Status getStatus(String i){
        if(valueToTextMapping == null){
            initMapping();
        }
        return valueToTextMapping.get(i);
    }

    private static void initMapping(){
        valueToTextMapping = new HashMap<>();
        for(Status s : values()){
            valueToTextMapping.put(s.value, s);
        }
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "Status:"+getKey()+" and value:"+getValue();
    }
}
