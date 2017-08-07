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

    @Override
    public Doctor getDoctorById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        //Doctor doctor = (Doctor) session.load(Doctor.class, new Integer(id));
        Doctor doctor = (Doctor)session.get(Doctor.class,new Integer(id));
        return doctor;
    }

    @Override
    public void addDoctor(Doctor doctor) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(doctor);
    }
}
