package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Shedule;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class SheduleDaoImpl implements SheduleDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Shedule> listShedule(int doctor_id) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Shedule where doctor_id = :paramName");
        query.setParameter("paramName", doctor_id);
        List<Shedule> sheduleList = query.list();
        return sheduleList;
    }

    @Override
    public void addShedule(Shedule shedule) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(shedule);
    }
}
