package edu.java.smarthouse.common.dto;

import edu.java.smarthouse.common.type.DeviceState;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DeviceQueryParameters {
    private DeviceState deviceState;

    public boolean isEmpty() {
        return deviceState == null;
    }

}
