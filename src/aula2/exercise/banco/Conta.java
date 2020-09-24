package aula2.exercise.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Conta {

	private double saldo;
	private String numero;
	private String senha;
	private Transacao[] historico;
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Transacao[] getHistorico() {
		return historico;
	}

	public void setHistorico(Transacao[] historico) {
		this.historico = historico;
	}

	public boolean efetuarSaque(double valor) {
		
		if(saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}else {
            return false;			
		}
	}
	
	public boolean efetuarDeposito(double valor) {
		
		saldo += valor;
		return true;
		
	}
    
	public boolean efetuarPagamento(String boleto, double valor) {
		
		if(saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}else {
            return false;			
		}
		
	}
	
	public Transacao[] extrato(Date inicio, Date fim) {
		
		List<Transacao> transacoes = new ArrayList<>();
		
		for (int i = 0; i < historico.length; i++) {
			if(historico[i].getData().after(inicio) && historico[i].getData().before(fim)) {
				transacoes.add(historico[i]);
			}
		}
		
		return (Transacao[]) transacoes.toArray();
		
	}
	
	

}
