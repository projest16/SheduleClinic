package com.mrak.sheduleclinic.service;

import com.mrak.sheduleclinic.dao.PatientDao;
import com.mrak.sheduleclinic.model.Patient;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PatientServiceImpl implements PatientService{
    private PatientDao patientDao;

    public void setPatientDao(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    @Transactional
    public List<Patient> listPatients() {
        return this.patientDao.listPatients();
    }

    @Override
    @Transactional
    public void addPatient(Patient patient) {
        this.patientDao.addPatient(patient);
    }
}
