package emanuele.w3d2.entities.esercizio3;

public class Tenente extends Ufficiale {
	 
    @Override
    public void check(int stipendio) {
        if ( stipendio > 3000)
        	superiore.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }
 
}
