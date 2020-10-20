package aula6.exercise3;

public class Funcionario {
	
	private long id;
	private String nome;
	private String matricula;
	private double salario;
	private int faltasNoAno;
	private float ultimaNotaAvaliacao;
    private int qtdPremiosRecebidosAno;
    private boolean graduado;
    private String nomeFaculdade;
    private String nomeCurso;
    
    
    
	public Funcionario(String nome, double salario, int faltasNoAno) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.faltasNoAno = faltasNoAno;
	}
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getFaltasNoAno() {
		return faltasNoAno;
	}
	public void setFaltasNoAno(int faltasNoAno) {
		this.faltasNoAno = faltasNoAno;
	}
	public float getUltimaNotaAvaliacao() {
		return ultimaNotaAvaliacao;
	}
	public void setUltimaNotaAvaliacao(float ultimaNotaAvaliacao) {
		this.ultimaNotaAvaliacao = ultimaNotaAvaliacao;
	}
	public int getQtdPremiosRecebidosAno() {
		return qtdPremiosRecebidosAno;
	}
	public void setQtdPremiosRecebidosAno(int qtdPremiosRecebidosAno) {
		this.qtdPremiosRecebidosAno = qtdPremiosRecebidosAno;
	}
	public boolean isGraduado() {
		return graduado;
	}
	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
	}
	public String getNomeFaculdade() {
		return nomeFaculdade;
	}
	public void setNomeFaculdade(String nomeFaculdade) {
		this.nomeFaculdade = nomeFaculdade;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
    
    
}
