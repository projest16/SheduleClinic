package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Shedule;

import java.util.List;

public interface SheduleDao {
    public List<Shedule> listShedule(int doctor_id);
    public List<Shedule> listShedules();
    public void addShedule(Shedule shedule);
}
