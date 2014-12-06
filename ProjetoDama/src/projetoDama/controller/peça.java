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
public class peça {

    private static String COR;
    private Icon icone;
    private int lado;

    public peça(Icon icone, int lado, String Cor) {
        this.icone = icone;
        this.lado = lado;
        COR = Cor;
    }

    public peça(Icon I, String Cor) {
        this(I, 0, Cor);

    }

    public static void setCOR(String COR) {
        peça.COR = COR;
    }

    public static String getCOR() {
        return COR;
    }

    public peça() {
        this(null, "vazio");
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Icon getIcone() {
        return icone;
    }

    public void setIcone(Icon X) {
        icone = X;

    }

    @Override
    public String toString() {

        return (lado == 1) ? "A"
                : (lado == 2) ? "B"
                        : "o";
    }
}
