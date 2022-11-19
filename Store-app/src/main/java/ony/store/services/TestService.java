package ony.store.services;

import ony.store.entities.TestEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {


//    SessionFactory factory;
//
//    @Autowired
//    public TestService(SessionFactory factory) {
//        this.factory = factory;
//    }
//
//    public void testMethod(){
//
//
//
//        System.out.println("Testservice started hell eah");
//
//        Session session = factory.openSession();
//
//        session.beginTransaction();
//        for(int i =0;i<100;i++) {
//
//
//
//            session.save( new TestEntity("Tokio " + i));
//
//        }
//        session.getTransaction().commit();
//        session.close();

//    }


}
