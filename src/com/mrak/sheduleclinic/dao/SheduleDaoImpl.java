package com.mrak.sheduleclinic.dao;

import com.mrak.sheduleclinic.model.Shedule;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

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
    public List<Shedule> listShedules() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Shedule> sheduleList = session.createQuery("from Shedule").list();
        return sheduleList;
    }

    @Override
    public void addShedule(Shedule shedule) {
        System.out.println(shedule);
        Session session = this.sessionFactory.getCurrentSession();
        session.save(shedule);
    }

    @Override
    public Shedule getSheduleById(int shedule_id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Shedule.class);
        criteria.add(Restrictions.eq("id", shedule_id));
        return (Shedule) criteria.uniqueResult();
    }

    @Override
    public void deleteSheduleById(int shedule_id) {
        Shedule shedule = getSheduleById(shedule_id);
        final Session session = sessionFactory.getCurrentSession();
        session.delete(shedule);
        session.flush();
    }
}
