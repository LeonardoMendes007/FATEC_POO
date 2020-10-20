package aula6.exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		HashMap<Character, Double> mapHash = new HashMap<>();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		
		Double valor = scn.nextDouble();
		
		System.out.print("Digite a forma de pagamento: ");
		
		String pagamento = scn.next();
		
		mapHash.put('', valor);
	}

}
