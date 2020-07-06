package aula.projeto.javamodular.core;

import aula.projeto.javamodular.utils.operacoes.Calculadora;

public class Runner {

    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(15, 3));

    }
}
