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
}
