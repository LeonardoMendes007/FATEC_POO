package aula6.exercise2;

public class Debito implements FormaPagamento{

	@Override
	public String informacao(Double valor) {
		return "Pago R$"+valor+" em cart�o de d�bito";
	}

}
