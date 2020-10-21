package aula2.exercise.aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.function.Predicate;

public class GestaoAlunos {

	public static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner scan = new Scanner(System.in);

	Predicate<Aluno> pred;
	private int indice;
	private Aluno[] alunos = new Aluno[50];

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void criar() {

		Aluno novo = new Aluno();

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

		enquantoFaca(pred, novo);

		System.out.print("Digite um Ra: ");

		pred = a -> {

			String ra = scan.next();

			if (contains(x -> x.getRa().equals(ra))) {
				System.out.print("O Ra já existe: ");
				return false;
			} else if (ra.isEmpty()) {
				System.out.print("Digite um ra válido: ");
				return false;
			} else {
				a.setRa(ra);
				return true;
			}

		};

		enquantoFaca(pred, novo);

		preencherNomeNascimento(novo);

		alunos[indice] = novo;

		verificarProximaPosicaoLivre();
	}

	private void verificarProximaPosicaoLivre() {

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				indice = i;
			}
		}
	}

	private boolean contains(Predicate<Aluno> cont) {

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (cont.test(alunos[i])) {
					return true;
				}
			}
		}

		return false;
	}

	public void atualizar() {

		System.out.print("Digite o Ra para encontrar o aluno a ser atulizado: ");
		String ra = scan.next();

		boolean ver = false;

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					preencherNomeNascimento(alunos[i]);
					ver = true;
					break;
				}
			}
		}

		if (ver == false) {
			System.out.println("Nenhum usuario com esse RA encontrado");
		}
	}

	private void preencherNomeNascimento(Aluno aluno) {

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

		enquantoFaca(pred, aluno);

		System.out.print("Digite a Data de Nascimento (dd/mm/yyyy): ");

		pred = a -> {
			try {
				a.setNascimento(formato.parse(scan.next()));
			} catch (ParseException e) {
				System.out.print("Erro no formato da data ou não é uma data válida(dd/mm/yyyy):");
				return false;
			}
			return true;
		};

		enquantoFaca(pred, aluno);
	}

	public void exibir() {

		System.out.print("Digite o RA que você quer verificar:");
		String ra = scan.next();

		boolean enc = false;
		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {

					alunos[i].exibir();
					enc = true;

				}
			}

		}

		if (enc == false) {
			System.out.println("Nenhum usuario encontrado");
		}

	}

	public void excluir() {

		System.out.print("Digite o RA que você quer verificar:");
		String ra = scan.next();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					alunos[i] = null;
				}
			}
		}

		System.out.println("Todos os usuarios com esse RA foram excluidos");

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

	private void enquantoFaca(Predicate<Aluno> pred, Aluno aluno) {

		while (!pred.test(aluno)) {

		}
	}

}
