package br.com.alura.Loja.Orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.Loja.DomainException;
import br.com.alura.Loja.Orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
		
	}
	
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("orcamento nao pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("orcamento nao pode ser reprovado");
	}
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("orcamento nao pode ser finalizado");
	}


	
	}


	


