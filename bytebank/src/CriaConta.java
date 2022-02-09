
public class CriaConta {
	
	public static void main(String[] args) {
		//Instanciação de objeto
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 2500;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 504;
		
		System.out.println("A primeira cona tem " + primeiraConta.saldo);
		System.out.println("A segunda cona tem " + segundaConta.saldo);
	}
}
