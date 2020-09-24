package aula2.exercise.banco;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

	private List<Conta> contas = new ArrayList();

    public Conta autentica(String numeroConta, String senha){
    	
        for (Conta conta : contas) {
			if(conta.getNumero() == numeroConta && conta.getSenha() == senha ) {
				
				return conta;
				
			}
		}
        
        throw new IllegalAccessError("Acesso negado");
    	
    }
}
