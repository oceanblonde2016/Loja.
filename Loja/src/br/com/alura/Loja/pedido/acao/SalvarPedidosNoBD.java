package br.com.alura.Loja.pedido.acao;

import br.com.alura.Loja.pedido.Pedido;

public class SalvarPedidosNoBD implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("salvando pedidos do banco de dados");
		
	}

}
