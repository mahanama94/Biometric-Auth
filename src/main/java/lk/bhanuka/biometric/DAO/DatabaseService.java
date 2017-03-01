/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.DAO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import lk.bhanuka.biometric.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author bhanuka
 */
public class DatabaseService {

    private static Session getSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }
    
    public static List executeHQL(String hql){
        Session session = DatabaseService.getSession();
        session.beginTransaction();
        Query q;
        q = session.createQuery(hql);
        return q.list();
    }
    
    public static void save(Object o){
        Session session = DatabaseService.getSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
    }
    
    public static Object load(Class type, Serializable s){
       return DatabaseService.getSession().load(type, s);
    }
    
    public static List search(Class type, Map restrictions){
        Session session = DatabaseService.getSession();
        Criteria criteria = session.createCriteria(type);
        for(Object o :restrictions.keySet()){
            criteria.add(Restrictions.eq((String) o , restrictions.get(o)));
        }
        return criteria.list();
    }
}
