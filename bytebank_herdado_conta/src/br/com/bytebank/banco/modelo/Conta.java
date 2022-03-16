package br.com.bytebank.banco.modelo;

public abstract class Conta{
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public static int total;
	
	public Conta() {
		
	}
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da ag�ncia e n�mero
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor:" + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}