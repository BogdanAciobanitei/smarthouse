package edu.java.smarthouse.service.business.command;

import edu.java.smarthouse.domain.DeviceEvent;

public interface DeviceEventDispatcher {

    void process(DeviceEvent deviceEvent);

}
