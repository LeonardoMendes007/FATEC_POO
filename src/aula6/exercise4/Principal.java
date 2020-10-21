package aula6.exercise4;

public class Principal {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		for(int x = 0;x < 5;x++) {
			Funcionario f = e.contratarFuncionario();
			e.getRh().adicionarFuncionario(f);
		}
		e.getRh().mostrarBonusTodosFuncionarios();
	}
}
