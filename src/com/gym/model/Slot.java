package com.gym.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Slot {
    LocalDateTime dateTime;
    City city;
    WorkOutType workOutType;
    boolean isBooked;

    public WorkOutType getWorkOutType() {
        return workOutType;
    }

    public void setWorkOutType(WorkOutType workOutType) {
        this.workOutType = workOutType;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }



    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


}
