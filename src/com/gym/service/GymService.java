package com.gym.service;

import com.gym.model.Slot;
import com.gym.model.User;
import com.gym.model.WorkOutReservation;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GymService {

    public static User userRegistration(int id, String name, int age, char gender){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setGender(gender);
        return user;
    }

    public static List<Slot> getSlots(String day,List<Slot> slots){
        /*1. Remove slot which are already booked
        * 2. Return available slots*/
        List<Slot> slotFoorThatDay =   slots
                .stream()
                .filter(slot1 -> slot1.getDateTime().getDayOfMonth() == Integer.parseInt(day))
                .filter(slot1 -> !slot1.isBooked())
                .collect(Collectors.toList());
           return slotFoorThatDay;
    }

    public static WorkOutReservation chooseWorkout(final Slot slot, final List<Slot> slots, final User  user) {
        final WorkOutReservation workOutReservation  =    new WorkOutReservation();
       workOutReservation.setSlot(slot);
       workOutReservation.setUser(user);
       /*Iterate slots and booked it to true*/
        slots.stream()
                .filter(slot1 -> Objects.equals(slot, slot1))
                .forEach(slot1 -> {
                    slot1.setBooked(true);
                });
       return workOutReservation;
    }


}
