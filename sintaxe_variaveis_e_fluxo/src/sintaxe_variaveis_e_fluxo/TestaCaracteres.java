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
		
		//Concatenação de Strings e inteiros
		String saudacao = "Olá, meu nome é ";
		String nome = "Rômulo ";
		String continuacao = "e minha idade é ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}
}
