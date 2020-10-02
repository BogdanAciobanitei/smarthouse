package edu.java.smarthouse.dao;

import edu.java.smarthouse.domain.Device;
import edu.java.smarthouse.common.dto.DeviceQueryParameters;

import java.util.List;

public interface DeviceDao {

    void putDevice(Device device);

    Device getDevice(String houseReference, String deviceReference);

    List<Device> getFilteredDevice(String houseReference, DeviceQueryParameters deviceQueryParameters);

    List<Device> getDevices(String houseReference);

    void updateDevice(Device device);
}
