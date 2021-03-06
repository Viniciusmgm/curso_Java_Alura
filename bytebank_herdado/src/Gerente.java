
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticacao(int senha) {
		return this.autenticador.autenticacao(senha);
	}
	
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	

}
