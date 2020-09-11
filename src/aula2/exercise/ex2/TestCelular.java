
package aula2.exercise.ex2;

import aula2.exercise.ex1.Celular;

public class TestCelular {

	public static void main(String[] args) {
		
		Celular cel = new Celular(6.2f, 2.0f, 8, 64, "Qualcomm Snapdragon");
		
		cel.ligar();
		
		cel.desligar();
		
		cel.abrirAplicativo();
		
		cel.setRam(12);
		
		cel.setTamanhoTela(7);
	}
}
