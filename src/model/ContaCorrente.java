package model;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

	private double limite;

	public ContaCorrente(String numeroConta, double saldoInicial, double limite) {
		super(numeroConta, saldoInicial);
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= (saldo + limite)) {
			saldo -= valor;
		} else {
			throw new IllegalArgumentException("Valor do saque excede o limite disponível.");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public void mostrarDados() {
		System.out.println("------- Conta Corrente --------");
		System.out.println("Número da conta: " + getNumeroConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Limite: " + limite);
		System.out.println("------------------------------");
	}
}
