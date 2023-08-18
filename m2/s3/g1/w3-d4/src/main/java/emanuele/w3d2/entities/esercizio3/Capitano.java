package emanuele.w3d2.entities.esercizio3;

public class Capitano extends Ufficiale {
	 
    @Override
    public void check(int stipendio) {
        if ( stipendio > 1000)
        	superiore.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }
 
}