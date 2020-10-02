package edu.java.smarthouse.service.validator;

import edu.java.smarthouse.common.validation.ValidationNotification;
import edu.java.smarthouse.domain.DeviceEvent;

public interface DeviceEventValidatorChain {
    void validate(DeviceEvent deviceEvent, ValidationNotification validationNotification);
}
