package aula6.exercise2;

public class Cheque implements FormaPagamento{

	@Override
	public String informacao(Double valor) {
		return "Pago R$"+ valor +" em cheque";
	}

}
