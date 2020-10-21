package aula2.exercise.funcionario;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		GestaoFuncionarios gestao = new GestaoFuncionarios();
		
		gestao.menu();
		
	}
}
