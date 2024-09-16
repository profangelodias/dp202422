package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta {
	private double limite;
	
   public boolean sacar(double quantidade) {
		   double QtdEspecial = quantidade * 0.99;
		   return super.sacar(QtdEspecial);
   }
}
