package aula2.exercise.ex1;

import java.util.Date;

public class AlcoolGel {
	
	private String marca;
	private float porcentagemAlcool;
	private int litros;
	private Date fabricacao;
	private Date validade;
	
	public AlcoolGel() {
		// TODO Auto-generated constructor stub
	}
	
	public AlcoolGel(String marca, float porcentagemAlcool, int litros, Date fabricacao, Date validade) {
		super();
		this.marca = marca;
		this.porcentagemAlcool = porcentagemAlcool;
		this.litros = litros;
		this.fabricacao = fabricacao;
		this.validade = validade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPorcentagemAlcool() {
		return porcentagemAlcool;
	}

	public void setPorcentagemAlcool(float porcentagemAlcool) {
		this.porcentagemAlcool = porcentagemAlcool;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public void matarCovid() {
		
		System.out.println("Você está Livre da Covid");

	}
	
    public void acenderChurrasqueira() {
		
		System.out.println("Sua Churrasqueira está acessa");

	}
    
    public <T> void fazerMolotov(T pano) {
    	
    	System.out.println("Molotov feito");
    	
    }

}
