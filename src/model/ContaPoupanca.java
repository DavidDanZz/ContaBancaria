package model;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

	private double taxaOperacao;

	public ContaPoupanca(String numeroConta, double saldoInicial, double taxaOperacao) {
		super(numeroConta, saldoInicial);
		this.taxaOperacao = taxaOperacao;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			saldo -= taxaOperacao;
		} else {
			throw new IllegalArgumentException("Valor do saque excede o saldo disponível.");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		saldo -= taxaOperacao;
	}

	public double getTaxaOperacao() {
		return taxaOperacao;
	}

	@Override
	public void mostrarDados() {
		System.out.println("------- Conta Poupança --------");
		System.out.println("Número da conta: " + getNumeroConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Taxa de Operação: " + taxaOperacao);
		System.out.println("------------------------------");
	}
}
