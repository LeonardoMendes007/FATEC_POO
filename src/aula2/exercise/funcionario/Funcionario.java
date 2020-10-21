package aula2.exercise.funcionario;

import java.text.SimpleDateFormat;
import java.util.Date;

import aula2.exercise.aluno.GestaoAlunos;

public class Funcionario {
	
	private long id;
	private String nome;
	private String matricula;
	private Date admissao;
	private Date demissao;
	private float salario;
	private String horario;
	
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public Date getDemissao() {
		return demissao;
	}
	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void exibir() {
		
		System.out.println("id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", admissao=" + GestaoAlunos.formato.format(admissao)
				+ ", demissao=" + GestaoAlunos.formato.format(demissao) + ", salario=" + salario + ", horario=" + horario);
	}
	
	
	
}
