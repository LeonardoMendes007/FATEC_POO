package aula6.exercise4;

import aula6.exercise3.Funcionario;

public interface IRH {
	
	double valorBonus(Funcionario funcionario);
	void mostrarBonusTodosFuncionarios();
	void adicionarFuncionario(Funcionario funcionario);
	void removerFuncionario(Funcionario funcionario);

}
