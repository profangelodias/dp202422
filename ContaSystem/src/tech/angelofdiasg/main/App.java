package tech.angelofdiasg.main;

import java.util.Scanner;

import tech.angelofdiasg.contas.Conta;
import tech.angelofdiasg.contas.ContaEspecial;
import tech.angelofdiasg.contas.ContaInvestimento;

public class App {
	public static void main(String[] args) {
		//Criação do objeto
		Scanner leitor = new Scanner(System.in);
		double valor;
		Conta conta1 = new Conta(01);
		Conta conta2 = new Conta(2, 1000);
		ContaEspecial contaE1 = new ContaEspecial();
		ContaInvestimento contaI1 = new ContaInvestimento();
		
		//Utilização dos estados
		System.out.println("Informe o valor inicial de"
				+ " deposito da conta 01:");
		valor = leitor.nextDouble(); 
		conta1.depositar(valor);
		//utilização do comportamento
		conta1.sacar(650);
		conta2.sacar(100);
		
		
	}

}
