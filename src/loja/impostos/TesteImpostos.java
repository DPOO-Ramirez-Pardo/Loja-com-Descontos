package loja.impostos;

import loja.orcamento.Orcamento;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }

}

// O padrão strategy reduz a quantidade de if elses.
// Cada classe possui a sua lógica.