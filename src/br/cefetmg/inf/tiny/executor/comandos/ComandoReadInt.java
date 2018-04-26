package br.cefetmg.inf.tiny.executor.comandos;

import java.util.Scanner;
import java.util.InputMismatchException;
import br.cefetmg.inf.tiny.memoria.EstruturaMemoria;
import br.cefetmg.inf.tiny.excecoes.ExcecaoExpressaoInvalida;

public final class ComandoReadInt extends Comando{
    Scanner entrada = new Scanner(System.in);
    int valorRecebido;
    String nomeVariavel = null;

    public ComandoReadInt(String parametro) throws ExcecaoExpressaoInvalida {
        super(parametro); 
        this.analisa();
        this.executaComando();
    }

    @Override
    public void executaComando() throws ExcecaoExpressaoInvalida {
        nomeVariavel = parametro.substring(1, parametro.length()-1); 
        variaveis = EstruturaMemoria.getInstancia();
        variaveis.armazenaVariavel(nomeVariavel, valorRecebido);
    }

    @Override
    public void analisa() throws ExcecaoExpressaoInvalida {
        try {
            valorRecebido = entrada.nextInt();   
        } catch(InputMismatchException e) {
            System.err.println("\nErro: A entrada recebida não é do tipo inteiro.");
            System.exit(0);
        } 
    }
    
}
