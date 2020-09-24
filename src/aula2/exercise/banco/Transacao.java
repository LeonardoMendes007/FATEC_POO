package aula2.exercise.banco;

import java.util.Date;

public class Transacao {
	
	private float valor;
	private Date data;
	private Pagamento pagamento;
	private Deposito deposito;
	private Saque saque;
	
	
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
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public Deposito getDeposito() {
		return deposito;
	}
	
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
	
	public Saque getSaque() {
		return saque;
	}
	
	public void setSaque(Saque saque) {
		this.saque = saque;
	}

	
	
}
