package loja.desconto;

import loja.impostos.CalculadoraDeImpostos;
import loja.impostos.ICMS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
