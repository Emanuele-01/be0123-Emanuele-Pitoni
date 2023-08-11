package entità;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.Setter;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@NamedQuery(name = "carta.findByYear", query = "SELECT anno FROM carta anno WHERE anno.yearProduction = :yearProduction ")
@NamedQuery(name = "carta.findByTitle", query = "SELECT t FROM carta t WHERE t.title = :title ")



public abstract class carta {
	
	@Id
	@GeneratedValue
	protected UUID Id;
	
	protected String title;
	protected String yearProduction;
	protected int numPage;
	
	 public carta() {
	        
	    }
	
	public carta(String title, String yearProduction, int numPage) {
		this.title = title;
		this.yearProduction = yearProduction;
		this.numPage = numPage;
	};
	

}
