package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double taxaSaque = 0.2;
		super.saca(valor + taxaSaque);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
}
