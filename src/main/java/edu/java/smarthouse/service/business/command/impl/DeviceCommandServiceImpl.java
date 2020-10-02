package edu.java.smarthouse.service.business.command.impl;

import edu.java.smarthouse.domain.DeviceEvent;
import edu.java.smarthouse.service.business.command.DeviceCommandService;
import edu.java.smarthouse.service.business.command.DeviceEventDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeviceCommandServiceImpl implements DeviceCommandService {

    private final DeviceEventDispatcher deviceEventDispatcher;

    @Autowired
    public DeviceCommandServiceImpl(DeviceEventDispatcher deviceEventDispatcher) {
        this.deviceEventDispatcher = deviceEventDispatcher;
    }

    @Override
    public void putDevice(DeviceEvent deviceEvent) {
        deviceEventDispatcher.process(deviceEvent);
    }

}
