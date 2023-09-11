package br.com.alura.Loja.imposto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);

}
