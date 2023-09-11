package br.com.alura.Loja.desconto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public class CalculadoraDeDesconto {
	public BigDecimal calcular (Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoGrande (
				new DescontoParaOrcamentoMaidDeQuinhentos (
						new SemDesconto ()));
			
		
		return desconto.efetuarCalculo(orcamento);

    }
}