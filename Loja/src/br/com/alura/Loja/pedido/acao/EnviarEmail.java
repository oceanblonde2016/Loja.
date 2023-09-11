package br.com.alura.Loja.pedido.acao;

import br.com.alura.Loja.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("enviar email com dados do pedido");
		
	}

}
