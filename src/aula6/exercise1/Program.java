package aula6.exercise1;

public class Program {
	
	public static void main(String[] args) {
		
		Dicionario dic = new Dicionario();
		
		dic.registrarPalavra("Eletiva", "Algo opcional");
		dic.registrarPalavra("Programa��o", "Fazer algoritmos");
		dic.registrarPalavra("Ma�a", "Uma fruta vermelha de comer");
		dic.registrarPalavra("Batata", "Apelido de amigo, uma fruta para se comer.");
		dic.registrarPalavra("�gua", "Liqu�do transparente sem gosto.");
		
		dic.registrarPalavra("Ma�a", "Uma fruta vermelha de comer");
		
		dic.atualizarPalavra("ma�a", "Fruta Frutosa Frut�o");
		
		System.out.println(dic.buscarDefinicao("Ma�a"));
		
		System.out.println(dic.buscarDefinicao("batata"));
	}

}
