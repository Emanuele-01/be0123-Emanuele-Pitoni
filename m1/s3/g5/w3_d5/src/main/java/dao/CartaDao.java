package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import entità.books;
import entità.carta;

public class CartaDao {
	private static Logger logger = (Logger) LoggerFactory.getLogger(CartaDao.class);
	
	private final EntityManager em;

	public CartaDao(EntityManager em) {
		this.em = em;
	}
	

	public void saveCarta(carta a) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(a);
		t.commit();
		logger.info("Materiale Cartaceo salvato!");
	}
	
	public int findByIdAndDelete(String id) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        Query q = em.createQuery("DELETE FROM carta WHERE id = :id");
        q.setParameter("id", UUID.fromString(id));
        int n = q.executeUpdate();
        t.commit();
        if (n > 0) {
            logger.info("Materiale cartaceo cancellato");
        } else {
            logger.info("Materiale cartaceo non cancellato");
        }
        return n;
    }
	
	public carta findByYear(String yearProduction) {
        TypedQuery<carta> q = em.createNamedQuery("carta.findByYear", carta.class);
        q.setParameter("yearProduction", yearProduction);
        return q.getSingleResult();
    }
	
	public books findByAutore(String string) {
		TypedQuery<books> q = em.createNamedQuery("books.findByAutore", books.class);
		q.setParameter("autore", string);
		return q.getSingleResult();
	}
	public carta findByTitle(String title) {
		TypedQuery<carta> q = em.createNamedQuery("carta.findByTitle", carta.class);
		q.setParameter("title", title);
		return q.getSingleResult();
	}
	
	public carta findById(String id) {
		carta found = em.find(carta.class, UUID.fromString(id));
		return found;
	}
}
