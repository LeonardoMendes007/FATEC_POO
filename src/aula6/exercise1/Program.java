package aula6.exercise1;

public class Program {
	
	public static void main(String[] args) {
		
		Dicionario dic = new Dicionario();
		
		dic.registrarPalavra("Eletiva", "Algo opcional");
		dic.registrarPalavra("Programação", "Fazer algoritmos");
		dic.registrarPalavra("Maça", "Uma fruta vermelha de comer");
		dic.registrarPalavra("Batata", "Apelido de amigo, uma fruta para se comer.");
		dic.registrarPalavra("Água", "Liquído transparente sem gosto.");
		
		dic.registrarPalavra("Maça", "Uma fruta vermelha de comer");
		
		dic.atualizarPalavra("maça", "Fruta Frutosa Frutão");
		
		System.out.println(dic.buscarDefinicao("Maça"));
		
		System.out.println(dic.buscarDefinicao("batata"));
	}

}
