package br.cefetmg.inf.tiny.analisador;

import br.cefetmg.inf.tiny.analisador.analisadorSintatico.SeparadorCaracteres;
import br.cefetmg.inf.tiny.estruturasDados.Fila;
import br.cefetmg.inf.tiny.estruturasDados.Pilha;

public abstract class Analisador {
    protected static Fila filaExecucao;
    protected static Pilha pilhaComandos;
    protected static SeparadorCaracteres caracteresCodigo;
        
    public static Fila getFilaExecucao() {
        return filaExecucao;
    }

    public static void setFilaExecucao(Fila filaExecucao) {
        Analisador.filaExecucao = filaExecucao;
    }

    public static Pilha getPilhaComandos() {
        return pilhaComandos;
    }

    public static void setPilhaComandos(Pilha pilhaComandos) {
        Analisador.pilhaComandos = pilhaComandos;
    }

    public static SeparadorCaracteres getCaracteresCodigo() {
        return caracteresCodigo;
    }

    public static void setCaracteresCodigo(SeparadorCaracteres caracteresCodigo) {
        Analisador.caracteresCodigo = caracteresCodigo;
    }
    
    
}