package loja.desconto;

import loja.impostos.Imposto;
import loja.orcamento.Orcamento;

import javax.swing.*;
import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public  BigDecimal calcular(Orcamento orcamento) {

        // Padrão cadeia de responsabilidade. Chain of Responsability . Utilizado quando
        // vc nao sabe qual regra de negócio será aplicada em cada situação.
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentocomMaisDeCincoItens(new
                DescontoParaOrcamentoAcimaDeQuinhentos(
                new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);

    }
}
