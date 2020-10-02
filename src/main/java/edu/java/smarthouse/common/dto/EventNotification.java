package edu.java.smarthouse.common.dto;

import edu.java.smarthouse.common.type.MessageStatus;
import edu.java.smarthouse.common.validation.ValidationNotification;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EventNotification {

    private String houseReference;
    private String deviceReference;
    private MessageStatus messageStatus;
    private ValidationNotification validationNotification;

}
