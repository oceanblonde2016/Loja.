package br.com.alura.Loja.desconto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public class DescontoParaOrcamentoMaidDeQuinhentos extends Desconto {
	
	public DescontoParaOrcamentoMaidDeQuinhentos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo (Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	
		

    }

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("500")) != null;
	}
}



