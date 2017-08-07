package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Doctor;

import java.util.List;

public interface DoctorDao {
    public List<Doctor> listDoctors();
    public Doctor getDoctorById(int id);
    public void addDoctor(Doctor doctor);
}
