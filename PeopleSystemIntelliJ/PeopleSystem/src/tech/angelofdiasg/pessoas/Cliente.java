package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicao.Profissao;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;
    private String tipoProfissaoOutros;
    private Scanner leitor = new Scanner(System.in);



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o código do cliente: ");
        this.codigo = leitor.nextLine();
        System.out.println("Informe a profissão do cliente: ");
        Profissao profissao = Profissao.valueOf(leitor.nextLine());
        if(profissao == Profissao.OUTROS){
            System.out.println(("Informe sua profissão: "));
            this.tipoProfissaoOutros = leitor.nextLine();
        }

    }

    public void atualizarInformacoes(){
        System.out.println("Deseja atualizar as informações pessoais? (S/N)");
        String resposta = leitor.nextLine();
        if(resposta.equalsIgnoreCase("S")){
            System.out.println("Informe o nome atualizado: ");
            this.setNome(leitor.nextLine());

            System.out.println("Deseja atualizar a data de nascimento? (S/N)");
            resposta = leitor.nextLine();
            if(resposta.equalsIgnoreCase("S")){
                System.out.println("Informe o dia de nascimento: ");
                int dia = leitor.nextInt();
                System.out.println("Informe o mês de nascimento: ");
                int mes = leitor.nextInt();
                System.out.println("Informe o ano de nascimento: ");
                int ano = leitor.nextInt();
                leitor.nextLine();
                this.setDataNascimento(LocalDate.of(ano, mes, dia));
            }
            System.out.println("Deseja atualizar o endereço? (S/N)");
            resposta = leitor.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                this.getEndereco().cadastrar();
            }
            System.out.println("Deseja atualizar o telefone de contato? (S/N)");
            resposta = leitor.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                this.getTelsContato().cadastrar();
            }
        }
        System.out.println("Deseja atualizar o código do cliente? (S/N)");
        resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Informe o novo código: ");
            this.codigo = leitor.nextLine();
        }
        System.out.println("Deseja atualizar a profissão do cliente? (S/N)");
        resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Informe a nova profissão: ");
            Profissao novaProfissao = Profissao.valueOf(leitor.nextLine());
            this.setProfissao(novaProfissao);

            if (novaProfissao == Profissao.OUTROS) {
                System.out.println("Informe a nova profissão personalizada: ");
                this.tipoProfissaoOutros = leitor.nextLine();
            } else {
                this.tipoProfissaoOutros = null;
            }
        }

    }

    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao +
                ", tipoProfissaoOutros='" + tipoProfissaoOutros + '\'' +
                "} ";
    }
}
