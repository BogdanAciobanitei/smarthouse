package edu.java.smarthouse.service.listener;

import edu.java.smarthouse.domain.DeviceEvent;

public interface DeviceEventListener {
    void process(DeviceEvent deviceEvent);
}
