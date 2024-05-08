package model;

public abstract class ContaBancaria {

	private String numeroConta;
	protected double saldo;

	public ContaBancaria(String numeroConta, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.saldo = saldoInicial;
	}

	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
}
