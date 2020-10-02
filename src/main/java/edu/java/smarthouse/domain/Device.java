package edu.java.smarthouse.domain;

import edu.java.smarthouse.common.type.DeviceState;
import edu.java.smarthouse.common.type.DeviceType;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Device {

    private String houseReference;
    private String deviceReference;
    private DeviceState deviceState;
    private DeviceType deviceType;
    private Map<String, String> deviceData;

}
