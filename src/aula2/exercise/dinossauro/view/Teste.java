package aula2.exercise.dinossauro.view;

import java.util.Scanner;

import aula2.exercise.dinossauro.model.Dinossauro;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    Dinossauro skeep = new Dinossauro();
	    
	    System.out.println("Jogo iniciado :D");
	    
	    while(true) {
	    	
	    	System.out.println(" -(P)ular  -(C)orrer  -Co(M)er\r\n" + 
	    			" -(A)tirar  -Tomar (S)ol  -Ficar na S(O)mbra  (E)xit");
	    	System.out.println();
	    	System.out.print("Digite uma opção: ");

	    	String textoMaiusculo = scan.nextLine().toUpperCase();
	    	
	    	char letra = textoMaiusculo.charAt(0);
	    	
	    	switch (letra) {
	    	case 'P':
				skeep.pular();
				break;
	    	case 'C':
				skeep.correr();
				break;
	    	case 'M':
				skeep.comer();
				break;
	    	case 'A':
				skeep.atirar();
				break;
	    	case 'S':
				skeep.tomarSol();
				break;
	    	case 'O':
				skeep.ficarNaSombra();
				break;
			case 'E':
				System.out.println("O jogo foi finalizado :(");
				break;
			default:
                System.err.println("A opção não é válida");
			}

	    	System.out.println();
	    }
	}
}
