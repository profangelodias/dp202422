package tech.angelofdiasg.contas;

public class App {
	public static void main(String[] args) {
		//Criação do objeto
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(2, 1000);
		ContaEspecial contaE1 = new ContaEspecial();
		ContaInvestimento contaI1 = new ContaInvestimento();
		
		//Utilização dos estados
		conta1.saldo = 5000;
		conta1.numero = 01;
		//utilização do comportamento
		conta1.sacar(650);
		conta2.sacar(100);
		
		
	}

}
