package sentiment.dao;

import setiment.model.Datagram;

public class DatagramDao {

	 private DAO dao;
	    
	    public DatagramDao() {
	    dao = new DAO();
	    }
	
	    public boolean find(Datagram d) {
	return dao.get(Datagram.class, d.getDatagramID())!=null;
	}

	public void save(Datagram d) {
	try {
		dao.save(d);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
}
