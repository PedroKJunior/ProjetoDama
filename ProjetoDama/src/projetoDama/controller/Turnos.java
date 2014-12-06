/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDama.controller;

/**
 * @author Victor 146905
 * @author Junior 107855
 */
public class Turnos {
    
    
    private  Jogador[] jogadores;
    private int Qtd;
    private int Vez;
    
    
    public Turnos(int max) {
        jogadores=new Jogador[max];
        Qtd=0;
        Vez=0;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }
    
    public void addJogador(Jogador J)
     {
        if (Qtd<jogadores.length)
         jogadores[Qtd]=J;
      Qtd++;
      }

    public Jogador getJogadorDavez()
    {
    
    return jogadores[Vez];
    }
    public void passavez()
    {
      if(Vez==Qtd-1)
      {Vez=0;
      return;
      }
      Vez++;
        
    }
    
public void reinicia()
{

Vez=0;
}    

}
