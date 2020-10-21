package aula6.exercise2;

public class Credito implements FormaPagamento{

	@Override
	public String informacao(Double valor) {
		return "Foi utilizado R$"+ valor +" do limite do cartão de crédito";
	}

}
