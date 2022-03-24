package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivo {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa com os valores padrões, ou seja, com 0

//		idades[0] = 19;
//		idades[1] = 19;
//		idades[2] = 19;
//		idades[3] = 19;
//		idades[4] = 19;
//		
//		//Gera uma exceção
//		int idade4 = idades[49];
//		
//		System.out.println(idade4);
//		
//		//Retorna o tamanho do array
//		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}

}
