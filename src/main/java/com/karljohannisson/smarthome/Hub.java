package com.karljohannisson.smarthome;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hub {
    Map<Integer, UpdateMessage> map;

    public Hub() {
        map = new HashMap<Integer, UpdateMessage>();
    }

    public void post(UpdateMessage payload) {
        map.put(payload.getId(), payload);
    }

    public Map<Integer, UpdateMessage> get(){
     return map;
    }

}
