package aula6.exercise3;

public class Program {

	public static void main(String[] args) {
		
		RH rh = new RH();
		
		Funcionario f1 = new Funcionario("Alicia",3000.0,20);
		Funcionario f2 = new Funcionario("Roberto",4000.0,2);
		Funcionario f3 = new Funcionario("Adriano",2000.0,3);
		Funcionario f4 = new Funcionario("Gustavo",10000.0,0);
		
		rh.adicionarFuncionario(f1);
		rh.adicionarFuncionario(f2);
		rh.adicionarFuncionario(f3);
		rh.adicionarFuncionario(f4);
		
		rh.adicionarFuncionario(f4);
		
		rh.mostrarBonusTodosFuncionarios();
		
		rh.removerFuncionario(f4);
		rh.removerFuncionario(f4);
	}
}
