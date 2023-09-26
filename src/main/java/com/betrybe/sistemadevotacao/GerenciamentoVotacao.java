package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private final ArrayList<PessoaCandidata> pessoasCandidatas;
  private final ArrayList<PessoaEleitora> pessoasEleitoras;
  private final ArrayList<String> cpfsComputados;

  /**
   * Construtor para GerenciamentoVotacao.
   */
  public GerenciamentoVotacao() {
    pessoasCandidatas = new ArrayList<>();
    pessoasEleitoras = new ArrayList<>();
    cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata c : pessoasCandidatas) {
      if (c.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata candidato = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(candidato);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora e : pessoasEleitoras) {
      if (cpf.equals(e.getCpf())) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora eleitor = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(eleitor);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }

}
