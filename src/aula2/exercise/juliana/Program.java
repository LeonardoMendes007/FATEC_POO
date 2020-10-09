package aula2.exercise.juliana;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		Integer dia = scn.nextInt();
        System.out.print("Digite o mes: ");
        Integer mes = scn.nextInt();
        System.out.println("Digite o ano: ");
        Integer ano = scn.nextInt();
        
        Integer data = dia + mes + ano;
        
        Integer base = 15 + 10 + 1582;
        
        if(mes < 3) {
        	ano -= 1;
        	mes += 12;
        }
        
        if(data >= base) {
        	Float a = (float) (ano / 100);
        	Float b = (float) (a/4);
        	Float c = (float) (2-a+b);
        	Float d = (float) (365.25)*(ano + 4716);
        	Float e = (float) (30.6001)*mes+1;
        	Float dataju = (float) (d + e + dia + 0.5 + c - 1524.5) + 30;
        	
        	if(dataju.intValue() == dataju) {
        		dataju -=1;
        	}
        	
        	System.out.println("Data convertida: " + dataju.intValue());
        }
		
	}

}
