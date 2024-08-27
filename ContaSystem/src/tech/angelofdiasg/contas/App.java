package tech.angelofdiasg.contas;

public class App {
	public static void main(String[] args) {
		//Criação do objeto
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(2, "José", 1000, 5000);
		
		//Utilização dos estados
		conta1.limite = 10000;
		conta1.saldo = 5000;
		conta1.nome = "ELIDAWYDSON";
		conta1.numero = 01;
		//utilização do comportamento
		conta1.sacar(650);
		conta2.sacar(100);
		
		
		
	}

}
