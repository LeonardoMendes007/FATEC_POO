package aula2.exercise.ex1;

public class Celular {
	
	private float tamanhoTela;
	private float espessura;
	private int ram;
	private int memoria;
	private String processador;
	
	public Celular() {
		
	}

	public Celular(float tamanhoTela, float espessura, int ram, int memoria, String processador) {
		super();
		this.tamanhoTela = tamanhoTela;
		this.espessura = espessura;
		this.ram = ram;
		this.memoria = memoria;
		this.processador = processador;
	}

	public float getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(float tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public float getEspessura() {
		return espessura;
	}

	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public void ligar() {

		System.out.print("Celular Iniciando.");
		
		try {
			
			for (int i = 0; i < 15; i++) {
				Thread.sleep(300);
				System.out.print(".");
			}
			
			System.out.println("Celular Ligado !!!");
		} catch (Exception e) {
			System.err.println("Erro ao ligar aparelho !!!");
		}
		
	}
	
	public void desligar() {

		System.out.print("Celular Encerrando.");
		
		try {
			
			for (int i = 0; i < 15; i++) {
				Thread.sleep(300);
				System.out.print(".");
			}
			
			System.out.println("Celular Desligado Com Sucesso!!!");
			
		} catch (Exception e) {
			System.err.println("Erro ao Desligar Aparelho !!!");
			System.err.println("O Desligamento foi forçado.");
		}
		
	}
	
	public void abrirAplicativo() {

		System.out.print("Abrindo Aplicativo.");
		
		try {
			
			for (int i = 0; i < 5; i++) {
				Thread.sleep(300);
				System.out.print(".");
			}
			
			System.out.println("Aplicativo Aberto!!!");
			
		} catch (Exception e) {
			System.err.println("Erro ao Abrir Aplicativo !!!");
		}
		
	}

}
