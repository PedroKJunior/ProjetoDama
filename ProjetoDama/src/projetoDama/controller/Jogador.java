/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDama.controller;

import javax.swing.Icon;

/**
 * @author Victor 146905
 * @author Junior 107855
 */
public class Jogador {

    private String nome;
    private int qtdpeças;
    private Icon CorPeça;
    private String COR;

    public Jogador(String nome, Icon CorPeça,String Cor) {
        this.nome = nome;
        this.qtdpeças = 12;
        this.CorPeça = CorPeça;
        this.COR=Cor;
    }

    public String getCOR() {
        return COR;
    }

    public void setCOR(String COR) {
        this.COR = COR;
    }

    
    public void perderpeça() {
        qtdpeças--;

    }

    public Icon getCorPeça() {
        return CorPeça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCorPeça(Icon CorPeça) {
        this.CorPeça = CorPeça;
    }

    public int getQtdpeças() {
        return qtdpeças;
    }

    public void setQtdpeças() {
        this.qtdpeças--;
    }

    public void resetar() {
        qtdpeças = 12;

    }

    @Override
    public String toString() {
        return this.nome + "\n"
                + "  Peças : " + this.qtdpeças + "\n";


    }
}
