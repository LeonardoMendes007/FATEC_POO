package aula2.exercise.dinossauro.model;

public class Dinossauro {

	private int energia;
	private int velocidade;
	private int temperatura;
	private int humor;

	public Dinossauro() {
		this.energia = 5;
		this.velocidade = 5;
		this.temperatura = 5;
		this.humor = 5;
	}

	public void pular() {

		if (energia > 0) {

			energia--;

			if (humor < 10) {

				humor++;

				System.out.println("O humor do dinossauro está em: " + humor);

			} else {
				System.out.println("O humor está no máximo de felicidade");
			}

			System.out.println("A tarefa custou 1 ponto de energia.");

		} else {
			System.out.println("O dinossauro não tem energia para essa tarefa");
		}
		
	}

	public void correr() {

		if (energia > 0) {

			energia--;

			if (humor < 10) {

				humor++;

				System.out.println("O humor do dinossauro está em: " + humor);

			} else {
				System.out.println("O humor está no máximo de felicidade");
			}

			System.out.println("A tarefa custou 1 ponto de energia.");

		} else {
			System.out.println("O dinossauro não tem energia para essa tarefa");
		}
	}

	public void comer() {

		if (energia < 10) {

			energia++;

			if (humor < 10) {

				humor++;

				System.out.println("O humor do dinossauro está em: " + humor);

			} else {
				System.out.println("O humor está no máximo de felicidade");
			}

			System.out.println("A energia do dinossauro está em: " + energia);
		} else {
			System.out.println("O dinossauro atingiu o máximo de energia");
		}

	}

	public void atirar() {
		
		if (energia > 0) {
			if (humor < 10) {

				humor++;

				System.out.println("O humor do dinossauro está em: " + humor);

			} else {
				System.out.println("O humor está no máximo de felicidade");
			}

			System.out.println("A tarefa custou 1 ponto de energia.");

		} else {
			System.out.println("O dinossauro não tem energia para essa tarefa");
		}

	}

	public void tomarSol() {

		if (energia > 0) {
			if (velocidade < 10) {

				velocidade++;
				energia--;

				System.out.println("A velocidade do dinossauro está em: " + velocidade);

			} else {
				System.out.println("O dinossauro atingiu a velocidade máxima");
			}

			if (humor < 10) {

				humor++;

				System.out.println("O humor do dinossauro está em: " + humor);

			} else {
				System.out.println("O humor está no máximo de felicidade");
			}

			System.out.println("A tarefa custou 1 ponto de energia.");

		} else {
			System.out.println("O dinossauro não tem energia para essa tarefa");
		}

	}

	public void ficarNaSombra() {

		if (energia < 10) {

			energia++;

			System.out.println("A energia do dinossauro está em: " + energia);

		} else {
			System.out.println("O dinossauro não tem energia para essa tarefa");
		}

		if (humor > -10) {

			humor--;

			System.out.println("O humor do dinossauro está em: " + humor);

		} else {
			System.out.println("O humor está no minimo");
		}

	}

}
