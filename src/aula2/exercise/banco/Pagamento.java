package aula2.exercise.banco;

import java.util.Date;

public class Pagamento extends Transacao{

	private String boleto;
	
	public Pagamento(float valor, Date data) {
		super(valor, data);
	}

	public String getBoleto() {
		return boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}
	
	

}
