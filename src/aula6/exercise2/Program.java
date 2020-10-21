package aula6.exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		HashMap<Character, FormaPagamento> formasDePagamento = new HashMap<>();
		
	    formasDePagamento.put('1', new Dinheiro());
	    formasDePagamento.put('2', new Debito());
	    formasDePagamento.put('3', new Credito());
	    formasDePagamento.put('4', new Cheque());
	    formasDePagamento.put('5', new Deposito());
	    
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		
		Double valor = scn.nextDouble();
		
		System.out.println("Digite: 1 - Dinheiro, 2 - Cartão Debito, "
				+ "3 - Cartão de Crédito, 4 - Cheque, 5 - Depósito");
		
		System.out.print("Digite a forma de pagamento: ");
		
		String formaPagamento = scn.next();
		
		System.out.println(formasDePagamento.get(formaPagamento.charAt(0)).informacao(valor));
		
		
		
	}

}
