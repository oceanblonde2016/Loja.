package br.com.alura.Loja;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;
import br.com.alura.Loja.desconto.CalculadoraDeDesconto;
import br.com.alura.Loja.imposto.CalculadoraDeImposto;
import br.com.alura.Loja.imposto.ICMS;
import br.com.alura.Loja.imposto.ISS;
import br.com.alura.Loja.imposto.Imposto;

public class TestesDesconto {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento (new BigDecimal("300"), 6);
		Orcamento segundo = new Orcamento (new BigDecimal("1000"), 1);
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		
		// TODO Auto-generated method stub

	}

}
