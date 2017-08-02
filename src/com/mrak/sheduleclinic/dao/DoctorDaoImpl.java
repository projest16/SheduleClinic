package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DoctorDaoImpl implements DoctorDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Doctor> listDoctors() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Doctor> doctorList = session.createQuery("from Doctor").list();

        return doctorList;
    }
}
