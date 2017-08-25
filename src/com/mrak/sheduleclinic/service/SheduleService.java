package com.mrak.sheduleclinic.service;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.model.Shedule;

import java.util.List;

public interface SheduleService {
    public List<Shedule> listShedule(int doctor_id);
    public List<Shedule> listShedules();
    public void addShedule(Shedule shedule);
}
