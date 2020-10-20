package aula2.exercise.banco;

import java.util.Date;

public class Transacao {
	
	private float valor;
	private Date data;
	
	
	public Transacao(float valor, Date data) {
		super();
		this.valor = valor;
		this.data = data;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
