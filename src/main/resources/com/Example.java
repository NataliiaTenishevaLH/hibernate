package com.hibernate;


import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.util.List;
import java.util.Queue;

public class Example {

    private static final String GET_COUNTRY_BY_NAME = "from Country where name = :stockName";

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
//        session.save(new Country("Italy", "IT"));
//        session.getTransaction().commit();

//        Query query = session.createQuery(GET_COUNTRY_BY_NAME);
//        query.setParameter("stockName", "Ukraine");
//        List list = query.list();
//
//        Country country =(Country) list.get(0);
//
//        System.out.println(country);
//
//        country.setAbr("UA");
//
//        session.update(country);
//        session.getTransaction().commit();

//
//        System.out.println("------------------->>>>");
//
   //     StudentDao dao = new StudentDao();

     //   List<Student> students = dao.getAllCities();

       // for (Student st : students) System.out.println(st.getFirstName() +  " " + st.getLastName()+  " from " + st.getCity().getCity());
    //}
}
