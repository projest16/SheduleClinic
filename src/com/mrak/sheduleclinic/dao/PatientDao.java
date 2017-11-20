package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.model.Patient;

import java.util.List;

public interface PatientDao {
    public List<Patient> listPatients();
    //public Patient getPatientById(int id);
    public void addPatient(Patient patient);
}
