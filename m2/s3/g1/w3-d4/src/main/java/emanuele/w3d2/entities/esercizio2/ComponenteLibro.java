package emanuele.w3d2.entities.esercizio2;

import java.util.List;

public abstract class ComponenteLibro {
	protected List<ComponenteLibro> listaComponenti;
	
	
	public abstract void stampa();
	
	public abstract int getNumeroPagine();

}
