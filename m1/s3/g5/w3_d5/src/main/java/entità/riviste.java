package entità;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "riviste")
@Getter
@Setter
public class riviste extends carta{
	
	
	private entità.periodicità periodicità;
	
	public riviste() {
		
	};
	
	
	public riviste(String title, String yearProduction, int numPage, periodicità periodicità) {
		super(title, yearProduction, numPage);
		this.periodicità = periodicità;
	}
	
	
	@Override
    public String toString() {
        return "Rivista{" +
                "title: '" + title + "'" +
                ", year: " + yearProduction + 
                ", periodicità: " + periodicità +
                '}';
    }
}
