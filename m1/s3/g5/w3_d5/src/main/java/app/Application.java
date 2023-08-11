package app;

import dao.CartaDao;
import dao.UtenteDao;
import dao.PrestitoDao;
import dao.ApplicationDao;


import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import entità.books;
import entità.Utente;
import entità.Prestito;
import entità.periodicità;
import entità.riviste;
import utils.JpaUtil;
public class Application {

	private static Logger logger = (Logger) LoggerFactory.getLogger(Application.class);
	
	private static EntityManagerFactory  emf= JpaUtil.getEntityManagerFactory(); 
	
	public static void main(String[] args) {
		//EntityManager
		
				EntityManager em = emf.createEntityManager();
				CartaDao cd = new CartaDao(em);
				UtenteDao ud = new UtenteDao(em);
				PrestitoDao pd = new PrestitoDao(em);
				ApplicationDao ad = new ApplicationDao(em);
		
		// creazione libri
		
				books libro1 = new books("1984", "2017", 416, "George Orwell", "Distopia");
				
				books libro2 = new books("Il cacciatore di aquiloni", "2003", 368, "Khaled Hosseini", "Romanzo storico");
				
				books libro3 = new books("Orgoglio e pregiudizio", "2013", 416, "Jane Austen", "Romanzo d'amore");
				
				books libro4 = new books("La ragazza del treno", "2016", 408, "Paula Hawkins", "Thriller psicologico");
				
				books libro5 = new books("La verità sul caso Harry Quebert", "2012", 656, "Joël Dicker", "Thriller");
				
				books libro6 = new books("Harry Potter e la Pietra Filosofale", "2011", 256, "J.K. Rowling", "Fantasia per ragazzi");
				
				books libro7 = new books("Il nome della rosa", "2014", 592, "Umberto Eco", "Giallo storico");
				
				books libro8 = new books("Il signore degli anelli: La Compagnia dell'Anello", "2012", 560, ".R.R. Tolkien", "Fantasy epico");
				
				books libro9 = new books("Il vecchio e il mare", "2003", 144, "Ernest Hemingway", "Romanzo breve");
				
				books libro10 = new books("La caduta dei giganti", "2010", 1024, "Ken Follett", "Romanzo storico");
					
				
		// creazione riviste
				
				riviste rivista1 = new riviste( "Wired", "2022", 110, periodicità.MENSILE);
				
				riviste rivista2 = new riviste( "National Geographic", "2022", 120, periodicità.MENSILE);
				
				riviste rivista3 = new riviste( "Vogue", "2022", 350, periodicità.MENSILE);
				
				riviste rivista4 = new riviste( "The New Yorker", "2022", 80, periodicità.SETTIMANALE);
				
				riviste rivista5 = new riviste( "Time", "2022", 84, periodicità.SETTIMANALE);
				
				riviste rivista6 = new riviste("The Economist", "2021", 110, periodicità.SEMESTRALE);
				
				riviste rivista7 = new riviste( "National Geographic Traveler", "2020", 135, periodicità.SEMESTRALE);
				
		//creazione Utenti
				
				Utente pearson = new Utente("Mario", "Rossi", LocalDate.now());
				
				Utente pearson2 = new Utente("Camilla", "Giannini", LocalDate.now());
				
				Utente pearson3 = new Utente("Mario", "De Lillo", LocalDate.now());
				
				Utente pearson4 = new Utente("Giovanni", "Storti", LocalDate.now());
				
				Utente pearson5 = new Utente("Chiara", "Rossi", LocalDate.now());
				
		//Creazione Prestito
				
				Prestito pre = new Prestito(pearson, libro1, LocalDate.of(2023, 3, 15), LocalDate.of(2023, 3, 15),LocalDate.of(2023, 3, 30));
				
				Prestito pre2 = new Prestito(pearson, libro1, LocalDate.of(2023, 4, 5), LocalDate.of(2023, 4, 5),LocalDate.of(2023, 4, 20));
				
				Prestito pre3 = new Prestito(pearson, libro1, LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 15),LocalDate.of(2023, 7, 30));
				
				Prestito pre4 = new Prestito(pearson, libro1, LocalDate.of(2023, 1, 15), LocalDate.of(2023, 1, 15),LocalDate.of(2023, 1, 30));
				
				Prestito pre5 = new Prestito(pearson, libro1, LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 15),LocalDate.of(2023, 11, 30));
			
		// salvataggio DB libri
				
				ad.saveApplication(libro1);
				
				ad.saveApplication(libro2);
				
				ad.saveApplication(libro3);
				
				ad.saveApplication(libro4);
				
				ad.saveApplication(libro5);
				
				ad.saveApplication(libro6);
				
				ad.saveApplication(libro7);
				
				ad.saveApplication(libro8);
				
				ad.saveApplication(libro9);
				
				ad.saveApplication(libro10);
				
		// salvataggio DB libri
				
				ad.saveApplication(rivista1);
				
				ad.saveApplication(rivista2);
				
				ad.saveApplication(rivista3);
				
				ad.saveApplication(rivista4);
				
				ad.saveApplication(rivista5);
				
				ad.saveApplication(rivista6);

				ad.saveApplication(rivista7);
		// salvataggio DB Utenti
				
				ud.saveUtente(pearson);
				
				ud.saveUtente(pearson2);
				
				ud.saveUtente(pearson3);
				
				ud.saveUtente(pearson4);
				
				ud.saveUtente(pearson5);
				
		// salvataggio DB Prestiti
				
				pd.savePrestito(pre);
				
				pd.savePrestito(pre2);
				
				pd.savePrestito(pre3);
				
				pd.savePrestito(pre4);
				
				pd.savePrestito(pre5);
				
				
		// eliminazione tramite ISBN
				
				cd.findByIdAndDelete("181e2028-7f77-4d3e-a82d-46ae2b8c1a02");
				
		// 	ricerca per anno
				logger.info("anno libro: " + cd.findByYear("2017"));
				
		// ricerca per autore
				logger.info("autore del libro: " + cd.findByAutore("Paula Hawkins"));
				
		// ricerca per titolo
				logger.info("libro di: " + cd.findByTitle("La ragazza del treno"));
				
	}

}
