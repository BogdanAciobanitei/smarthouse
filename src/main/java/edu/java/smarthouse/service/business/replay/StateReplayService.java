package edu.java.smarthouse.service.business.replay;

import edu.java.smarthouse.domain.Device;

import java.time.ZonedDateTime;
import java.util.List;

public interface StateReplayService {

    List<Device> getStateAtTime(String houseReference, ZonedDateTime timestamp);

}
