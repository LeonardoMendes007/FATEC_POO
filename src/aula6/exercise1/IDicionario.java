package aula6.exercise1;

public interface IDicionario {

	
	void registrarPalavra(String palavra, String definicao);
	void removerPalavra(String palavra);
	void atualizarPalavra(String palavra, String definicao);
	String buscarDefinicao(String palavra);
	
}
