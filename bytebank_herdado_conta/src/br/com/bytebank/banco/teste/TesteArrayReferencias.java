package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new ContaCorrente[5]; 
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cp2 = new ContaPoupanca(22, 22);
		Cliente cliente = new Cliente();
		
		referencias[0] = cc1;
		referencias[1] = cp2;
		referencias[2] = cliente;
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
//		System.out.println(((Conta) contas[0]).getNumero());
		System.out.println(ref.getNumero());
	}
}
