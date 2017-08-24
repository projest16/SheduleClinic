package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.model.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PatientDaoImpl implements PatientDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Patient> listPatients() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Patient> patientList = session.createQuery("from Patient").list();
        return patientList;
    }
}
