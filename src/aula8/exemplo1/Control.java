package aula8.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Control {

	private List<Contato> lista = new ArrayList<>();
	
	public void addContato(Contato c) {
		
		lista.add(c);
		
	}
	
	public Contato pesquisar(String nome) {
		for(Contato c : lista) {
			if(c.getNome().contains(nome)) {
				return c
			}
		}
		return null;
	}
}
