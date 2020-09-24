package aula2.exercise.aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos {

	private Scanner scan = new Scanner(System.in);
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private int indice;
	private Aluno[] alunos = new Aluno[50];

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void criar() throws ParseException {

		Aluno novo = new Aluno();

		novo.setId(indice);

		System.out.print("Digite o RA: ");
		novo.setRa(scan.nextLine());

		preencherNomeNascimento(novo);

		alunos[indice] = novo;
		indice++;
	}

	public void atualizar() throws ParseException {

		System.out.println("Digite o Ra para encontrar o aluno a ser atulizado: ");
		String ra = scan.nextLine();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].getRa().equals(ra)) {
				preencherNomeNascimento(alunos[i]);
			}
		}

	}

	private void preencherNomeNascimento(Aluno aluno) throws ParseException {

		System.out.print("Digite o Nome: ");
		aluno.setNome(scan.nextLine());

		System.out.print("Digite a Data de Nascimento (dd/mm/yyyy): ");
		aluno.setNascimento(formato.parse(scan.nextLine()));

	}
}
