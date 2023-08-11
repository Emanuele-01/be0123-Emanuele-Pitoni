package entità;


import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
@NamedQuery(name = "books.findByAutore", query = "SELECT a FROM books  a WHERE a.autore = :autore ")
public class books extends carta{
	
	
	
	protected String autore;
	protected String genere;
	
	public books() {
		   
		}
	
	public books(String title, String yearProduction, int numPage, String autore, String genere) {
		super(title, yearProduction, numPage);
		this.autore = autore;
		this.genere = genere;
	}
	
	  @Override
	    public String toString() {
	        return "Book{" +
	                "title: '" + title + "'" +
	                ", author: '" + autore + "'"+
	                ", year: " + yearProduction +
	                '}';
	    }
}
