package loja.pedido.acoes;

import loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    // Padrão Observer, classes que estão observando, são ouvintes, listeners, estão aguardando serem chamadas.
    // Assim que forem chamadas irão executar o código.
    // É um exemplo de inversão de controle quando usamos esse padrão.

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados");
    }

}

