package edu.java.smarthouse.service.validator.impl;

import edu.java.smarthouse.common.type.Command;
import edu.java.smarthouse.common.validation.ValidationNotification;
import edu.java.smarthouse.dao.DeviceEventsDao;
import edu.java.smarthouse.domain.DeviceEvent;
import edu.java.smarthouse.service.validator.DeviceEventValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static edu.java.smarthouse.common.type.ErrorType.ALREADY_EXISTENT_PRIMARY_KEY;

@Component
public class ConsistencyDeviceEventValidator implements DeviceEventValidator {


    private final DeviceEventsDao deviceEventsDao;

    @Autowired
    public ConsistencyDeviceEventValidator(DeviceEventsDao deviceEventsDao) {
        this.deviceEventsDao = deviceEventsDao;
    }

    @Override
    public void validate(DeviceEvent deviceEvent, ValidationNotification validationNotification) {
        if (!deviceEventsDao.getDeviceEvents(deviceEvent.getHouseReference(), deviceEvent.getDeviceReference()).isEmpty()) {
            validationNotification.addError(ALREADY_EXISTENT_PRIMARY_KEY);
        }
    }

    @Override
    public List<Command> supportedCommands() {
        return Arrays.asList(Command.CREATE);
    }

}
