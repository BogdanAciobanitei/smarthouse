package edu.java.smarthouse.service.business.query;

import edu.java.smarthouse.domain.Device;

public interface DeviceProcessor {

    void create(Device deviceEventDTO);
    void update(Device deviceEventDTO);
}
