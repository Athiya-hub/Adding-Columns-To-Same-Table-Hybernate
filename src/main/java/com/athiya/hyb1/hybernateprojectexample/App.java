package com.athiya.hyb1.hybernateprojectexample;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Name n=new Name();
    	n.setFname("Mohammed");
    	n.setLname("Athiya");
        Pojo pojo=new Pojo();
        pojo.setRollno(100);
        pojo.setName(n);
       
        
        Configuration con=new Configuration().configure("hybernate.cfg.xml").addAnnotatedClass(Pojo.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(pojo);
     
        tx.commit();
       //pojo=session.get(Pojo.class, 3);
        System.out.println(pojo);
    }
}
