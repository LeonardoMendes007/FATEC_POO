package aula6.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Dicionario implements IDicionario{
	 
	private Map<String, String> definicoes = new HashMap<>();

	@Override
	public void registrarPalavra(String palavra, String definicao) {
		
		palavra = palavra.toLowerCase();
		
		if (!definicoes.containsKey(palavra)) {
			definicoes.put(palavra, definicao);
		}else {
			System.out.println("A palavra já existe no dicionário!!!");
		}
	
	}

	@Override
	public void removerPalavra(String palavra) {
		
		palavra = palavra.toLowerCase();
		
		if (definicoes.remove(palavra) != null) {
			System.out.println("A palavra foi apagada com sucesso!!!");
		}else {
			System.out.println("A palavra não existe!!!");
		}
		
	}

	@Override
	public void atualizarPalavra(String palavra, String definicao) {
		
		palavra = palavra.toLowerCase();
		
		if (definicoes.containsKey(palavra)) {
			definicoes.replace(palavra, definicao);
			System.out.println("A palavra foi atualizada!!!");
		}else {
			System.out.println("A palavra não existe!!!");
		}
		
	}

	@Override
	public String buscarDefinicao(String palavra) {
		
		palavra = palavra.toLowerCase();

		if (definicoes.containsKey(palavra)) {
			return definicoes.get(palavra);
		}else {
			return "A palavra não existe no dicionário";
		}
		
	
       
	}

	
	

}
