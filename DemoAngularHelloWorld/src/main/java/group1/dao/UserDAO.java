package group1.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import group1.model.User;
import group1.util.HibernateUtil;


public class UserDAO {

		Session session = null;
		public List<User> getUser(){
			session = HibernateUtil.getSessionFactory().openSession();
	        String sql = " FROM User";
	        Query query = session.createQuery(sql);
	        List<User>  list = query.list();
	        if (list.size() > 0) {
	            return list;
	        }
	        session.close();
	        return null;
		}
}
