package ony.store.dao;

import ony.store.entities.Part;
import ony.store.entities.TestEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PartDAOHibernate implements PartDAO{

    SessionFactory factory;

    @Autowired
    public PartDAOHibernate(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public int create(Part part) {
        System.out.println("Behold! DAO method called");
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(part);
        session.getTransaction().commit();
        session.close();
        return part.getId();
    }

    @Override
    public List<Part> searchByName(String query) {
        return null;
    }

    @Override
    public Part gedById(int id){
        return null;
    }

    @Override
    public void update(Part part) {

    }

    @Override
    public void delete(int id) {

    }


}
