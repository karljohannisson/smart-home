package com.karljohannisson.smarthome;

import java.util.Objects;

public class UpdateMessage {
    int deviceId;
    String deviceName   ;
    double size;
    String unit;
    public UpdateMessage(int deviceId, String deviceName, double size, String unit) {
        this.deviceId=deviceId;
        this.deviceName=deviceName;
        this.size=size;
        this.unit=unit;
    }

    public Integer getId() {
        return this.deviceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, deviceName, size, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateMessage that = (UpdateMessage) o;
        return deviceId == that.deviceId && Double.compare(size, that.size) == 0 && Objects.equals(deviceName, that.deviceName) && Objects.equals(unit, that.unit);
    }
}
