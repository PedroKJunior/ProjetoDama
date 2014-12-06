/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDama.view;

import javax.swing.Icon;

/**
 * @author Victor 146905
 * @author Junior 107855
 */
public class MovimentoinvalidoException extends Exception {

    
    
    private Icon icone;
    
    public MovimentoinvalidoException() {
    super();
    icone= new javax.swing.ImageIcon(getClass().getResource("/imagens/iconErro.png"));
    
    }

    public MovimentoinvalidoException(String message) {
        super(message);
    icone= new javax.swing.ImageIcon(getClass().getResource("/imagens/iconErro.png"));
    
    }
    

    public Icon getIcone() {
        return icone;
    }
    
    
    
}
