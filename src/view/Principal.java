package view;

import model.ContaBancaria;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente("12345", 1000.0, 800.0);
		ContaPoupanca contaPoupanca = new ContaPoupanca("54321", 2000.0, 0.01);

		contaCorrente.depositar(500.0);
		contaPoupanca.depositar(700.0);

		contaCorrente.sacar(800.0);
		contaPoupanca.sacar(2500.0);

		System.out.println("------- Conta Corrente --------");
		contaCorrente.mostrarDados();
		System.out.println("------- Conta Poupança --------");
		contaPoupanca.mostrarDados();
	}
}
