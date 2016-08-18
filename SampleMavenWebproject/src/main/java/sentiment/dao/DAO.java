package sentiment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO {

	private SessionFactory sessionFactory;
	
	public DAO() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	@SuppressWarnings("unchecked")
	public <T> T save(final T o) throws Exception{
    	Session sess = sessionFactory.openSession();
   	 Transaction tx = null;
   	 try {
   	     tx = sess.beginTransaction();
   	     sess.save(o);
   	     tx.commit();
   	 }
   	 catch (Exception e) {
   	     if (tx!=null) tx.rollback();
   	     throw e;
   	 }
   	 finally {
   	     sess.close();
   	 }
   	 return o;
    }



    public void delete(final Object object){
      sessionFactory.getCurrentSession().delete(object);
    }

    /***/
    @SuppressWarnings("unchecked")
	public <T> T get(final Class<T> type, final String id){
    	Session sess = sessionFactory.openSession();
      T t= (T) sess.get(type, id);
      sess.close();
      return t;
    }

   
	
}
