package aula6.exercise2;

public class Deposito implements FormaPagamento {

	@Override
	public String informacao(Double valor) {
		return "Pago R$"+ valor +" em deposito bancario";
	}

}
