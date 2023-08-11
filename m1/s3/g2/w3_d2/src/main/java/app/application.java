package app;
import entità.gestioneventiConstructor;
import dao.EventDao;
import utils.JpaUtil;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entità.TypeOfEvent;



public class application {
	
	private static Logger logger = LoggerFactory.getLogger(application.class);
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		EventDao sd = new EventDao(em);
		
		gestioneventiConstructor event = new gestioneventiConstructor("Maneskin", LocalDate.now(), TypeOfEvent.PUBBLICO, 2000);
		gestioneventiConstructor event2 = new gestioneventiConstructor("Jovanotti", LocalDate.now(), TypeOfEvent.PRIVATO, 60);
		gestioneventiConstructor event3 = new gestioneventiConstructor("Imagine Dragons", LocalDate.now(), TypeOfEvent.PUBBLICO, 1500);
		gestioneventiConstructor event4 = new gestioneventiConstructor("Dua Lipa", LocalDate.now(), TypeOfEvent.PRIVATO, 200);
		
		
//		sd.save(event);
//		sd.save(event2);
//		sd.save(event3);
//		sd.save(event4);
		
//		sd.Delete(3);
		
		sd.refresh(2);
		logger.info("Event: " + sd.findById(1).toString());
		
		em.close();
		emf.close();
	}

	

}
