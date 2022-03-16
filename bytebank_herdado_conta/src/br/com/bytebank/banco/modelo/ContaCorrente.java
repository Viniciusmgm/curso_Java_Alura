package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double taxaSaque = 0.2;
		return super.saca(valor + taxaSaque);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}
