package com.mrak.sheduleclinic.service;

import com.mrak.sheduleclinic.dao.SheduleDao;
import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.model.Shedule;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class SheduleServiceImpl implements SheduleService {

    private SheduleDao sheduleDao;

    public void setSheduleDao(SheduleDao sheduleDao) {
        this.sheduleDao = sheduleDao;
    }

    @Transactional
    @Override
    public List<Shedule> listShedule(int doctor_id) {
        return this.sheduleDao.listShedule(doctor_id);
    }

    @Transactional
    @Override
    public void addShedule(Shedule shedule) {
        this.sheduleDao.addShedule(shedule);
    }
}
