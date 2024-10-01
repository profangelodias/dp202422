package tech.angelofdiasg.composicao;

import java.util.Scanner;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private Scanner leitor = new Scanner(System.in);
	
    public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void cadastrar() {
		System.out.println("Informe a rua: ");
		this.rua = leitor.nextLine();
		System.out.println("Informe o numero: ");
		this.numero = leitor.nextLine();
		System.out.println("Informe o CEP: ");
		this.cep = leitor.nextLine();
		System.out.println("Informe a cidade: ");
		this.cidade = leitor.nextLine();
		System.out.println("Informe o estado: ");
		this.estado = leitor.nextLine();
		System.out.println("Informe o Pais: ");
		this.pais = leitor.nextLine();
	}
    
    
}
