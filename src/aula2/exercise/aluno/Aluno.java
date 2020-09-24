package aula2.exercise.aluno;

import java.util.Date;

public class Aluno {

	private long id;
	private String nome;
	private String ra;
	private Date nascimento;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public void exibir() {
		
		System.out.println("id=" + id + ", nome=" + nome + ", ra=" + ra + ", nascimento=" + nascimento); 
		
	}
	
	
}
