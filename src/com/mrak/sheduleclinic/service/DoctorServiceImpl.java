package com.mrak.sheduleclinic.service;

import com.mrak.sheduleclinic.dao.DoctorDao;
import com.mrak.sheduleclinic.model.Doctor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class DoctorServiceImpl implements DoctorService{
    public void setDoctorDao(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    private DoctorDao doctorDao;
    @Override
    @Transactional
    public List<Doctor> listDoctors() {
        return this.doctorDao.listDoctors();
    }

    @Override
    @Transactional
    public Doctor getDoctorById(int id) {
        return this.doctorDao.getDoctorById(id);
    }

    @Override
    @Transactional
    public void addDoctor(Doctor doctor) {
        this.doctorDao.addDoctor(doctor);
    }

    @Override
    @Transactional
    public void removeDoctor(Doctor doctor) {
        this.doctorDao.removeDoctor(doctor);
    }
}
