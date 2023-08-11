package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import entità.Prestito;

public class PrestitoDao {
	private static Logger logger = (Logger) LoggerFactory.getLogger(PrestitoDao.class);
	
	private final EntityManager em;

	public PrestitoDao(EntityManager em) {
		this.em = em;
	}
	
	
	public void savePrestito(Prestito a) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(a);
		t.commit();
		logger.info("Prestito salvato!!");
	}
	
	public Prestito findById(String id) {
		Prestito found = em.find(Prestito.class, UUID.fromString(id));
		return found;
	}
}
