package edu.java.smarthouse.service.business.query;

import edu.java.smarthouse.domain.Device;
import edu.java.smarthouse.common.dto.DeviceQueryParameters;

import java.util.List;

public interface DeviceQueryService {


    Device getDevice(String houseReference, String deviceReference);

    List<Device> getDevices(String houseReference, DeviceQueryParameters queryParameters);

}
