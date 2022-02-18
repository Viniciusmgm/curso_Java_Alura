
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario vini = new Gerente();
		vini.setNome("Vinicius");
		vini.setCpf("238058043085");
		vini.setSalario(3040.00);
		
		System.out.println(vini.getNome());
		System.out.println(vini.getBonificacao());
	}
}
