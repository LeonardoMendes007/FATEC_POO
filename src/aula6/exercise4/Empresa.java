package aula6.exercise4;

import java.util.function.Consumer;

import javax.swing.JOptionPane;

public class Empresa {
	private RH rh;
	private int cod = 1;

	public Empresa() {
		this.rh = new RH();

	}

	public Funcionario contratarFuncionario() {
		Funcionario func = new Funcionario();
		func.setId(cod);
		validador(func, (f) -> {
			f.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		});
		validador(func, (f) -> {
			f.setMatricula(JOptionPane.showInputDialog("Digite o numero da matricula"));
		});
		validador(func, (f) -> {
			f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:")));
		});
		validador(func, (f) -> {
			f.setFaltasNoAno(Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas no ano:")));
		});
		validador(func, (f) -> {
			f.setUltimaNotaAvaliacao(
					Float.parseFloat(JOptionPane.showInputDialog("Digite a nota a ultima avaliacao:")));
		});
		validador(func, (f) -> {
			f.setQtdPremiosRecebidosAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a qnt o premios:")));
		});
		validador(func, (f) -> {
			if (Integer.parseInt(JOptionPane.showInputDialog("graduado 1 = sim 2 = nao")) == 1) {
				f.setGraduado(true);
			} else {
				f.setGraduado(false);
			}
		});
		validador(func, (f) -> {
			f.setNomeFaculdade(JOptionPane.showInputDialog("Digite o nome da faculdade:"));
		});
		validador(func, (f) -> {
			f.setNomeCurso(JOptionPane.showInputDialog("Digite o nome do curso:"));
		});	

		cod++;
		return func;

	}

	private void validador(Funcionario func, Consumer<Funcionario> registro) {

		boolean val = true;

		while (val) {

			try {

				registro.accept(func);
				val = false;
			} catch (Exception e) {
				val = true;
				JOptionPane.showMessageDialog(null, "Algum erro de digitação ou conversão inválida ocorreu, tente novamente");
			}

		}
	}

	public RH getRh() {
		return rh;
	}

	public void setRh(RH rh) {
		this.rh = rh;
	}

}
