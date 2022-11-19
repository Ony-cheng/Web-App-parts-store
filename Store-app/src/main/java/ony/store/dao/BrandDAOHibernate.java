package ony.store.dao;

import ony.store.entities.Brand;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrandDAOHibernate implements BrandDAO{

    SessionFactory factory;

    @Autowired
    public BrandDAOHibernate(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<Brand> getAll() {


        Session session = factory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("From Brand");
        List<Brand> brands = query.list();
        session.getTransaction().commit();
        session.close();

        return brands;
    }
}
