package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
        System.out.println(letra);

        char valor = 65;                   
        System.out.println(valor);

        valor = (char) (valor + 1);         
        System.out.println(valor);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);
		
		String frase = "Estou sempre disposto a aprender novas tecnologias";
		
		String parcela1 = "10";
		String parcela2 = "20";

		System.out.println(parcela1 + parcela2);
		
		//Concatena��o de Strings e inteiros
		String saudacao = "Ol�, meu nome � ";
		String nome = "R�mulo ";
		String continuacao = "e minha idade � ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}
}
