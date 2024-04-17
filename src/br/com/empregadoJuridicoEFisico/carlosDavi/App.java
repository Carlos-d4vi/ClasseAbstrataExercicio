package br.com.empregadoJuridicoEFisico.carlosDavi;

public class App {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pf.setNome("Pessoa Fisica");
        pf.setEndereco("Rua Java - 74");
        pf.setCpf("273.849.587-76");

        pj.setNome("Pessoa Juridica");
        pj.setEndereco("Rua Java - 47");
        pj.setCnpj("25.389.261/0001-76");
    }
}