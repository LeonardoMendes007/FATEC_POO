package aula2.exercise.aluno;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		GestaoAlunos gestao = new GestaoAlunos();
		
		gestao.menu();
		
	}
}
