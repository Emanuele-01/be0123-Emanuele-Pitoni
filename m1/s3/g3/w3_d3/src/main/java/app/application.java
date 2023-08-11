package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import dao.EventDao;
import dao.UserDao;
import utils.JpaUtil;

public class application {

	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		EventDao ed = new EventDao(em);
		UserDao ud = new UserDao();

	}

}
