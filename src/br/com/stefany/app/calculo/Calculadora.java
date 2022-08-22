package br.com.stefany.app.calculo;

import br.com.stefany.app.calculo.interno.OperacoesAritmeticas;
import br.com.stefany.app.logging.Logger;

public class Calculadora {

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }
}
