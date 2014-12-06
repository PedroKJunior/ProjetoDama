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
public class ClickinvalidoException extends Exception {

    private Icon icone;
    
  public ClickinvalidoException() {
    super();  
   icone=new javax.swing.ImageIcon(getClass().getResource("/imagens/IconAlert.png"));
     }

    public ClickinvalidoException(String message) {
        super(message);
     icone=new javax.swing.ImageIcon(getClass().getResource("/imagens/IconAlert.png"));
    }

    public Icon getIcone() {
        return icone;
    }
    
    
}
