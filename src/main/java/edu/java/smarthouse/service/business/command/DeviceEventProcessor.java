package edu.java.smarthouse.service.business.command;

import edu.java.smarthouse.domain.DeviceEvent;
import edu.java.smarthouse.common.type.Command;

public interface DeviceEventProcessor {

    void process(DeviceEvent deviceEventDTO);

    Command getCommand();

}
