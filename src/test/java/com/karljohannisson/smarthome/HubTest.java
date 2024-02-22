package com.karljohannisson.smarthome;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HubTest {

    @Test
    void hubAcceptsPayload() {
        UpdateMessage payload = new UpdateMessage(1, "Thermometer", 23.1, "Celsius");
        Hub hub = new Hub();
        Map<Integer, UpdateMessage> map;
        hub.post(payload);
        hub.post(new UpdateMessage(2, "Stove Power Outlet", 431.1, "Watt"));
        hub.post(new UpdateMessage(1, "Thermometer", 19, "Celsius"));

        map = hub.get();


        assertEquals(map.get(2), new UpdateMessage(2, "Stove Power Outlet", 431.1, "Watt"));
        assertEquals(map.get(1), new UpdateMessage(1, "Thermometer", 19, "Celsius"));
    }

}