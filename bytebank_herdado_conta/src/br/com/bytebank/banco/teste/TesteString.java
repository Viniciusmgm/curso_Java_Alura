package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " Alura    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio.isEmpty());
		
		//Object literal
		String nome = "Alura";
		
		//String outro = new String("Alura");
		//String � imut�vel
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		String outra = nome.replace("Al", "aL");
		
//		String outra = nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}
}
