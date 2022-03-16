package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(seguro);
		
		System.out.println(ci.getTotalImposto());
	}
}
