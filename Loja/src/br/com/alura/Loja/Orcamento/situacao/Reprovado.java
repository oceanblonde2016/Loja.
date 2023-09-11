package br.com.alura.Loja.Orcamento.situacao;


import br.com.alura.Loja.Orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	
	

	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}



