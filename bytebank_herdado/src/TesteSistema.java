
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(221);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);	
		}

}
