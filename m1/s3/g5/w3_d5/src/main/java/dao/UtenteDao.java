package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import entità.Utente;

public class UtenteDao {
	private static Logger logger = (Logger) LoggerFactory.getLogger(UtenteDao.class);
	
	private final EntityManager em;

	public UtenteDao(EntityManager em) {
		this.em = em;
	}
	
	
	public void saveUtente(Utente a) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(a);
		t.commit();
		logger.info("Utente salvato!!");
	}
	
	public Utente findById(String id) {
		Utente found = em.find(Utente.class, UUID.fromString(id));
		return found;
	}
}
