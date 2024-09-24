package tech.angelofdiasg.pessoas;

import java.util.Scanner;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.composicao.Telefone;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;
	private Scanner leitor = new Scanner(System.in);
	
	public void cadastrar() {
		System.out.println("Informe o nome: ");
		this.nome = leitor.nextLine();
		System.out.println("Informe a data de nascimento: ");
		this.dataNascimento = leitor.nextLine();
		this.endereco = new Endereco();
		this.endereco.cadastrar();
		
	}
	
	public String obterIdade(){
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
