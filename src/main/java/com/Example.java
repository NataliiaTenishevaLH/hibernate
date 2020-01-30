package com;


import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.util.List;
import java.util.Queue;

public class Example {

      public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

    }
}
