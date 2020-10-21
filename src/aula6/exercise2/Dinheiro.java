package aula6.exercise2;

public class Dinheiro implements FormaPagamento{

	@Override
	public String informacao(Double valor) {
		return "Pago R$" +valor+" em dinheiro";
	}

}
