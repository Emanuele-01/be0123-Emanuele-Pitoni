package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.LoggerFactory;

import app.Application;
import ch.qos.logback.classic.Logger;
import entità.books;
import entità.carta;

public class ApplicationDao {
	private static Logger logger = (Logger) LoggerFactory.getLogger(ApplicationDao.class);
	
	private final EntityManager em;

	public ApplicationDao(EntityManager em) {
		this.em = em;
	}
	
	
	public void saveApplication(carta a) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(a);
		t.commit();
		logger.info("Utente salvato!!");
	}
	
	public carta findById(String id) {
		carta found = em.find(carta.class, UUID.fromString(id));
		return found;
	}
}
