package edu.java.smarthouse.service.business.query.impl;

import edu.java.smarthouse.dao.DeviceDao;
import edu.java.smarthouse.domain.Device;
import edu.java.smarthouse.service.business.query.DeviceProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeviceProcessorImpl implements DeviceProcessor {

    private final DeviceDao deviceDao;

    @Autowired
    public DeviceProcessorImpl(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    public void create(Device device) {
        deviceDao.putDevice(device);
    }

    @Override
    public void update(Device device) {
        deviceDao.updateDevice(device);
    }

}
