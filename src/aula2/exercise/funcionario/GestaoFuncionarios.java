package aula2.exercise.funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.function.Predicate;

import javax.swing.JOptionPane;

public class GestaoFuncionarios {

	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner scan = new Scanner(System.in);

	Predicate<Funcionario> pred;
	private int indice;
	private Funcionario[] funcionarios = new Funcionario[50];

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void criar() {

		Funcionario novo = new Funcionario();

		System.out.print("Digite um ID : ");

		pred = a -> {

			long id = scan.nextInt();

			if (contains(x -> x.getId() == id)) {
				System.out.print("O Id já existe: ");
				return false;
			} else {
				a.setId(id);
				return true;
			}

		};

		validador(pred, novo);

		System.out.print("Digite o numero de Matricula: ");

		pred = a -> {

			String matricula = scan.next();

			if (contains(x -> x.getMatricula().equals(matricula))) {
				System.out.print("O Matricula já existe: ");
				return false;
			} else if (matricula.isEmpty()) {
				System.out.print("Digite um numero de matricula válido: ");
				return false;
			} else {
				a.setMatricula(matricula);
				return true;
			}

		};


		validador(pred, novo);
		
		preencherNome(novo);

		preencherAdmissaoDemissao(novo);
		
		preencherSalario(novo);
		
		preencherHorario(novo);

		funcionarios[indice] = novo;

		verificarProximaPosicaoLivre();
	}

	private void preencherHorario(Funcionario novo) {
		System.out.print("Digite o Horario: ");

		pred = a -> {
			String horario = scan.next();

			if (horario.isEmpty()) {
				System.out.println("O horario está em Branco: ");
				return false;
			} else {
				a.setHorario(horario);
				return true;
			}

		};

		validador(pred, novo);
		
	}

	private void preencherNome(Funcionario novo) {
		System.out.print("Digite o Nome: ");

		pred = a -> {
			String nome = scan.next();

			if (nome.isEmpty()) {
				System.out.println("O nome está em Branco: ");
				return false;
			} else {
				a.setNome(nome);
				return true;
			}

		};

		validador(pred, novo);
		
	}

	private void preencherSalario(Funcionario novo) {
		
		System.out.print("Digite o Salario: ");

		pred = a -> {
			float valor = scan.nextFloat();

			if (valor == 0) {
				System.out.println("O salario está em Zerado: ");
				return false;
			} else {
				a.setSalario(valor);
				return true;
			}

		};

		validador(pred, novo);
		
	}

	private void verificarProximaPosicaoLivre() {

		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] == null) {
				indice = i;
			}
		}
	}

	private boolean contains(Predicate<Funcionario> cont) {

		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null) {
				if (cont.test(funcionarios[i])) {
					return true;
				}
			}
		}

		return false;
	}

	public void atualizar() {

		System.out.print("Digite o Matricula para encontrar o funcionario a ser atulizado: ");
		String mat = scan.next();

		boolean ver = false;

		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null) {
				if (funcionarios[i].getMatricula().equals(mat)) {
					preencherNome(funcionarios[i]);

					preencherAdmissaoDemissao(funcionarios[i]);
					
					preencherSalario(funcionarios[i]);
					
					preencherHorario(funcionarios[i]);
					ver = true;
					break;
				}
			}
		}

		if (ver == false) {
			System.out.println("Nenhum usuario com esse Matricula encontrado");
		}
	}

	private void preencherAdmissaoDemissao(Funcionario funcionario) {
		
		System.out.print("Digite a Data de Admissao (dd/mm/yyyy): ");

		pred = a -> {
			try {
				a.setAdmissao(formato.parse(scan.next()));
			} catch (ParseException e) {
				System.out.print("Erro no formato da data ou não é uma data válida(dd/mm/yyyy):");
				return false;
			}
			return true;
		};

		validador(pred, funcionario);
		
		System.out.print("Digite a Data de Demissao (dd/mm/yyyy): ");

		pred = a -> {
			try {
				a.setDemissao(formato.parse(scan.next()));
			} catch (ParseException e) {
				System.out.print("Erro no formato da data ou não é uma data válida(dd/mm/yyyy):");
				return false;
			}
			return true;
		};

		validador(pred, funcionario);
	}

	public void exibir() {

		System.out.print("Digite o Matricula que você quer verificar:");
		String mat = scan.next();

		boolean enc = false;
		for (int i = 0; i < funcionarios.length; i++) {

			if (funcionarios[i] != null) {
				if (funcionarios[i].getMatricula().equals(mat)) {

					funcionarios[i].exibir();
					enc = true;

				}
			}

		}

		if (enc == false) {
			System.out.println("Nenhum usuario encontrado");
		}

	}

	public void excluir() {

		System.out.print("Digite o Matricula que você quer verificar:");
		String mat = scan.next();

		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null) {
				if (funcionarios[i].getMatricula().equals(mat)) {
					funcionarios[i] = null;
				}
			}
		}

		System.out.println("Todos os usuarios com esse Matricula foram excluidos");

	}

	public void menu() {

		System.out.println(
				"(C)riar           (E)xibir             (R)emover               \r\n" + "(A)tualizar          (S)air");
		System.out.print("Digite uma opção: ");

		String textoMaiusculo = scan.nextLine().toUpperCase();
		char letra = textoMaiusculo.charAt(0);

		while (letra != 'S') {

			switch (letra) {
			case 'R':
				excluir();
				break;
			case 'C':
				criar();
				break;
			case 'A':
				atualizar();
				break;
			case 'E':
				exibir();
				break;
			case 'S':
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

			System.out.println("(C)riar           (E)xibir             (R)emover               \r\n"
					+ "(A)tualizar          (S)air");
			System.out.print("Digite uma opção: ");
			textoMaiusculo = scan.next().toUpperCase();
			letra = textoMaiusculo.charAt(0);

		}

	}

	private void validador(Predicate<Funcionario> pred, Funcionario funcionario) {

		boolean val = false;

		while (!val) {

			try {
			    
				val = pred.test(funcionario);
			} catch (Exception e) {
				val = true;
				System.out.println("Algum erro de digitação ou conversão inválida ocorreu, tente novamente");
			}

		}
	}

}
