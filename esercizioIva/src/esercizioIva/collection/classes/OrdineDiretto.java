package esercizioIva.collection.classes;

import java.util.Collection;
import java.util.stream.Collectors;

import esercizioIva.collection.interfaces.OrderCollection;

public class OrdineDiretto implements OrderCollection{

	
	public Collection<Prodotto> ordNome(Collection<Prodotto> lista) {
		return lista.stream().sorted(    (a,b)    ->    a.getNomeProdotto().compareTo(b.getNomeProdotto())  ).collect(Collectors.toList());
		
	}


	public Collection<Prodotto> ordIva(Collection<Prodotto> lista) {
		return lista.stream().sorted(    (a,b)    ->    a.getIvaProdotto() - b.getIvaProdotto()  ).collect(Collectors.toList());
		
	}

}
