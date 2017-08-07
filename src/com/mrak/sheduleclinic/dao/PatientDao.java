package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Patient;

public interface PatientDao {
    public Patient getPatientById(int id);
}
