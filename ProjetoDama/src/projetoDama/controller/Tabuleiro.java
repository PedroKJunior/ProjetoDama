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

public class Tabuleiro {

    
    private static Peca INIMIGO;        
    
            
    private Peca Tabuleiroo[][];
   
    public Tabuleiro() {
       
        Tabuleiroo = new Peca[8][8];
        
        for (int i = 0; i < 8; i++) {
            for (int a = 0; a < 8; a++) {
                Tabuleiroo[i][a] = new Peca();
            }
        }
    }
    
private boolean alterna;    

    public void adicionaPeças1(Icon I,String Cor) {
        alterna= false;
        
        for (int i = 0; i < 3; i++) {
            for (int ii = 0; ii < 8; ii++) {
                
                Tabuleiroo[i][ii].setIcone((alterna)?I:null);
                Tabuleiroo[i][ii].setLado(1);
                Tabuleiroo[i][ii].setCOR(Cor);
                
           alterna= !alterna;
            }
        alterna= !alterna;
        }
       
        
    }

       public void adicionaPeças2(Icon I,String Cor) {
        alterna= true;
           for (int i = 5; i < 8; i++) {
            for (int ii = 0; ii < 8; ii++) {
            Tabuleiroo[i][ii].setIcone((alterna)?I:null);
            Tabuleiroo[i][ii].setLado(2);
            Tabuleiroo[i][ii].setCOR(Cor);
            alterna= !alterna;
            }
        alterna= !alterna;
       }
    }

public void moverpeça(int[] casa1,int[] casa2)
 {
    
     
     Tabuleiroo[casa2[0]][casa2[1]]=Tabuleiroo[casa1[0]][casa1[1]];
     Tabuleiroo[casa1[0]][casa1[1]]=new Peca();

        if ((casa2[0]==0)||(casa2[0]==7))
         {
        
          
         Tabuleiroo[casa2[0]][casa2[1]].setLado(3);
          
         }
}

public void retirapeça(int[] x){
    
    
    Tabuleiroo[x[0]][x[1]] = new Peca();
    
}

public void setCasa(int x,int y,Icon X){Tabuleiroo[x][y].setIcone(X);}
    
public Icon getCasa(int x,int y){return Tabuleiroo[x][y].getIcone();}  


public Peca getpeça(int x,int y){return Tabuleiroo[x][y];}  


public void dama(int[] X)
{
    
//Tabuleiroo[X[0]][X[1]].setLado(3);
        
/*
if (Tabuleiroo[X[0]][X[1]].getCOR().equals("azul")){Tabuleiroo[X[0]][X[1]].setIcone(new javax.swing.ImageIcon(getClass().getResource("/imagens/PazulDama.png")));}
if (Tabuleiroo[X[0]][X[1]].getCOR().equals("vermelha")){Tabuleiroo[X[0]][X[1]].setIcone(new javax.swing.ImageIcon(getClass().getResource("/imagens/PvermelhaDama.png")));}
 */  
}

    @Override
    public String toString()
{
    String retorno="    TABULEIRO  \n ";
   for (int i = 0; i < 8; i++) {
            for (int a = 0; a < 8; a++) {
              retorno += Tabuleiroo[i][a]+" ";
            }
        retorno +="\n";
   }
return retorno;
}
}

