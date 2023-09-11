package br.com.alura.Loja;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;
import br.com.alura.Loja.imposto.CalculadoraDeImposto;
import br.com.alura.Loja.imposto.ICMS;
import br.com.alura.Loja.imposto.ISS;
import br.com.alura.Loja.imposto.Imposto;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento (new BigDecimal("100"), 1);
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		System.out.println(calculadora.calcula(orcamento, new ICMS()));
		
		// TODO Auto-generated method stub

	}

}
