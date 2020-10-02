package edu.java.smarthouse.service.validator;

import edu.java.smarthouse.common.type.Command;
import edu.java.smarthouse.common.validation.ValidationNotification;
import edu.java.smarthouse.domain.DeviceEvent;
import org.springframework.core.Ordered;

import java.util.List;

public interface DeviceEventValidator extends Ordered {

    void validate(DeviceEvent deviceEvent, ValidationNotification validationNotification);

    List<Command> supportedCommands();

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
