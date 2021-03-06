/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDama.view;

import javax.swing.Icon;
import javax.swing.JFrame;
import projetoDama.controller.Tabuleiro;
import projetoDama.controller.Turnos;
import projetoDama.controller.RegrasDojogo;
import projetoDama.controller.Jogador;



import javax.swing.JOptionPane;


/**
 * @author Victor 146905
 * @author Junior 107855
 */
public class Interface extends javax.swing.JFrame {

//Atributos
    //  private Icon peçaazul;
    //  private Icon peçavermelha;
    private Icon iconOk;
    private Tabuleiro meutab;
    private boolean click;
    private int[] anterior;
    private Jogador jogador1;
    private Jogador jogador2;
    private String nomes;
    private Turnos Turno;
    //cores das peças
    public static final String[] pecas = {"azul", "vermelha"};

    public Interface() {
        initComponents();

        criajogadores();

        iconOk = new javax.swing.ImageIcon(getClass().getResource("/imagens/iconcerto.png"));



       
        meutab = new Tabuleiro();

        click = false;

        anterior = new int[2];

        meutab.adicionaPeças1(jogador1.getCorPeça(),jogador1.getCOR());
        meutab.adicionaPeças2(jogador2.getCorPeça(),jogador2.getCOR());
       
        montatabuleiro();

        Ljogador.setIcon(Turno.getJogadorDavez().getCorPeça());

        Ljogador.setText(Turno.getJogadorDavez() + "");


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C14 = new javax.swing.JLabel();
        C15 = new javax.swing.JLabel();
        C16 = new javax.swing.JLabel();
        C17 = new javax.swing.JLabel();
        C18 = new javax.swing.JLabel();
        C19 = new javax.swing.JLabel();
        C20 = new javax.swing.JLabel();
        C21 = new javax.swing.JLabel();
        C22 = new javax.swing.JLabel();
        C23 = new javax.swing.JLabel();
        C24 = new javax.swing.JLabel();
        C25 = new javax.swing.JLabel();
        C26 = new javax.swing.JLabel();
        C27 = new javax.swing.JLabel();
        C28 = new javax.swing.JLabel();
        C29 = new javax.swing.JLabel();
        C30 = new javax.swing.JLabel();
        C31 = new javax.swing.JLabel();
        C32 = new javax.swing.JLabel();
        relatorio = new javax.swing.JLabel();
        Ljogador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Tabuleiro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(907, 610));
        getContentPane().setLayout(null);

        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(90, 20, 53, 50);

        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        getContentPane().add(C2);
        C2.setBounds(227, 20, 53, 50);

        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        getContentPane().add(C3);
        C3.setBounds(365, 20, 53, 50);

        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });
        getContentPane().add(C4);
        C4.setBounds(502, 20, 53, 50);

        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });
        getContentPane().add(C5);
        C5.setBounds(20, 90, 53, 50);

        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });
        getContentPane().add(C6);
        C6.setBounds(159, 90, 53, 50);

        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });
        getContentPane().add(C7);
        C7.setBounds(298, 90, 53, 50);

        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });
        getContentPane().add(C8);
        C8.setBounds(435, 90, 53, 50);

        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C9MouseClicked(evt);
            }
        });
        getContentPane().add(C9);
        C9.setBounds(90, 160, 53, 50);

        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C10MouseExited(evt);
            }
        });
        getContentPane().add(C10);
        C10.setBounds(227, 160, 53, 50);

        C11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C11MouseClicked(evt);
            }
        });
        getContentPane().add(C11);
        C11.setBounds(365, 160, 53, 50);

        C12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C12MouseClicked(evt);
            }
        });
        getContentPane().add(C12);
        C12.setBounds(502, 160, 53, 50);

        C13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C13MouseClicked(evt);
            }
        });
        getContentPane().add(C13);
        C13.setBounds(20, 227, 53, 50);

        C14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C14MouseClicked(evt);
            }
        });
        getContentPane().add(C14);
        C14.setBounds(159, 227, 53, 50);

        C15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C15MouseClicked(evt);
            }
        });
        getContentPane().add(C15);
        C15.setBounds(298, 227, 53, 50);

        C16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C16MouseClicked(evt);
            }
        });
        getContentPane().add(C16);
        C16.setBounds(435, 227, 53, 50);

        C17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C17MouseClicked(evt);
            }
        });
        getContentPane().add(C17);
        C17.setBounds(90, 295, 53, 50);

        C18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C18MouseClicked(evt);
            }
        });
        getContentPane().add(C18);
        C18.setBounds(227, 295, 53, 50);

        C19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C19MouseClicked(evt);
            }
        });
        getContentPane().add(C19);
        C19.setBounds(365, 295, 53, 50);

        C20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C20MouseClicked(evt);
            }
        });
        getContentPane().add(C20);
        C20.setBounds(502, 295, 53, 50);

        C21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C21MouseClicked(evt);
            }
        });
        getContentPane().add(C21);
        C21.setBounds(20, 364, 53, 50);

        C22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                C22MouseEntered(evt);
            }
        });
        getContentPane().add(C22);
        C22.setBounds(159, 364, 53, 50);

        C23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C23MouseClicked(evt);
            }
        });
        getContentPane().add(C23);
        C23.setBounds(298, 364, 53, 50);

        C24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C24MouseClicked(evt);
            }
        });
        getContentPane().add(C24);
        C24.setBounds(435, 364, 53, 50);

        C25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C25MouseClicked(evt);
            }
        });
        getContentPane().add(C25);
        C25.setBounds(90, 433, 53, 50);

        C26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C26MouseClicked(evt);
            }
        });
        getContentPane().add(C26);
        C26.setBounds(227, 433, 53, 50);

        C27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C27MouseClicked(evt);
            }
        });
        getContentPane().add(C27);
        C27.setBounds(365, 433, 53, 50);

        C28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C28MouseClicked(evt);
            }
        });
        getContentPane().add(C28);
        C28.setBounds(502, 433, 53, 50);

        C29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C29MouseClicked(evt);
            }
        });
        getContentPane().add(C29);
        C29.setBounds(20, 502, 53, 50);

        C30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C30MouseClicked(evt);
            }
        });
        getContentPane().add(C30);
        C30.setBounds(159, 502, 53, 50);

        C31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C31MouseClicked(evt);
            }
        });
        getContentPane().add(C31);
        C31.setBounds(298, 502, 53, 50);

        C32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C32MouseClicked(evt);
            }
        });
        getContentPane().add(C32);
        C32.setBounds(435, 502, 53, 50);

        relatorio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        getContentPane().add(relatorio);
        relatorio.setBounds(600, 250, 290, 110);

        Ljogador.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(Ljogador);
        Ljogador.setBounds(600, 120, 290, 120);

        jButton1.setText("Nova Partida");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 380, 120, 30);

        jButton2.setText("Reiniciar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 380, 110, 30);

        Tabuleiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        Tabuleiro.setAlignmentY(0.0F);
        getContentPane().add(Tabuleiro);
        Tabuleiro.setBounds(0, -8, 900, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criajogadores() {
        JFrame frame = new JFrame("Escolha da Cor");

        nomes = JOptionPane.showInputDialog("NOME DO JOGADOR 1 ");

   
        Icon peça = new javax.swing.ImageIcon(getClass().getResource("/imagens/Pvermelha.png"));
        jogador1 = new Jogador(nomes, peça,"vermelha");



        nomes = JOptionPane.showInputDialog("NOME DO OUTRO JOGADOR ");

        
        Icon peça2 = new javax.swing.ImageIcon(getClass().getResource("/imagens/Pazul.png"));
        jogador2 = new Jogador(nomes, peça2,"azul");

         Turno = new Turnos(2);
        Turno.addJogador(jogador1);
        Turno.addJogador(jogador2);

    
    
    }

    //JOGA O TABULEIRO NA TELA
    private void montatabuleiro() {



        System.out.print(meutab);
        C1.setIcon(meutab.getCasa(0, 1));
        C2.setIcon(meutab.getCasa(0, 3));
        C3.setIcon(meutab.getCasa(0, 5));
        C4.setIcon(meutab.getCasa(0, 7));

        C5.setIcon(meutab.getCasa(1, 0));
        C6.setIcon(meutab.getCasa(1, 2));
        C7.setIcon(meutab.getCasa(1, 4));
        C8.setIcon(meutab.getCasa(1, 6));

        C9.setIcon(meutab.getCasa(2, 1));
        C10.setIcon(meutab.getCasa(2, 3));
        C11.setIcon(meutab.getCasa(2, 5));
        C12.setIcon(meutab.getCasa(2, 7));

        C13.setIcon(meutab.getCasa(3, 0));
        C14.setIcon(meutab.getCasa(3, 2));
        C15.setIcon(meutab.getCasa(3, 4));
        C16.setIcon(meutab.getCasa(3, 6));

        C17.setIcon(meutab.getCasa(4, 1));
        C18.setIcon(meutab.getCasa(4, 3));
        C19.setIcon(meutab.getCasa(4, 5));
        C20.setIcon(meutab.getCasa(4, 7));

        C21.setIcon(meutab.getCasa(5, 0));
        C22.setIcon(meutab.getCasa(5, 2));
        C23.setIcon(meutab.getCasa(5, 4));
        C24.setIcon(meutab.getCasa(5, 6));

        C25.setIcon(meutab.getCasa(6, 1));
        C26.setIcon(meutab.getCasa(6, 3));
        C27.setIcon(meutab.getCasa(6, 5));
        C28.setIcon(meutab.getCasa(6, 7));

        C29.setIcon(meutab.getCasa(7, 0));
        C30.setIcon(meutab.getCasa(7, 2));
        C31.setIcon(meutab.getCasa(7, 4));
        C32.setIcon(meutab.getCasa(7, 6));

    }
    //REINICIA O JOGO

    private void reiniciar() {



        criajogadores();
        Turno.reinicia();
        rodada();
        
        
        meutab= new Tabuleiro();
        meutab.adicionaPeças1(jogador1.getCorPeça(),jogador1.getCOR());
        meutab.adicionaPeças2(jogador2.getCorPeça(),jogador2.getCOR());
        montatabuleiro();
    }

    private boolean qualvez(int[] posição) {

        return (meutab.getpeça(posição[0], posição[1]).getIcone() == Turno.getJogadorDavez().getCorPeça());

    }

    private void validaclick(int[] posição) throws ClickinvalidoException {

        if (!click) {

            if (meutab.getCasa(posição[0], posição[1]) == null) {
                throw new ClickinvalidoException("Clique em uma peça !!");
            }
            if (!qualvez(posição)) {
                throw new ClickinvalidoException("Peça do Inimigo !!");
            }
        } else {

            if (meutab.getCasa(posição[0], posição[1]) != null) {

                throw new ClickinvalidoException("Casa Invalida !!");
            }


        }


    }

    private void jogada(int[] posição) {
        if (!click) {
            try {

                anterior = posição;
                validaclick(posição);


                relatorio.setIcon(iconOk);
                relatorio.setText("click 1 OK  ");
                click = !click;

            } catch (ClickinvalidoException e) {


                relatorio.setIcon(e.getIcone());
                relatorio.setText(e.getMessage());

            }

        } else {
            try {

                validaclick(posição);
                
  atualizajogador(posição);
                meutab = RegrasDojogo.fazjogada(meutab, anterior, posição);

                relatorio.setIcon(iconOk);
                relatorio.setText("click 2 OK !! ");


                verificaseganhou();

                
                click = !click;

            /*  if(!continuajogada(posição))
              {
            
                  rodada();
              }*/
                rodada();
              
                
                
            } catch (ClickinvalidoException e) {

                relatorio.setIcon(e.getIcone());
                relatorio.setText(e.getMessage());
                click = !click;

            } catch (MovimentoinvalidoException e) {

                relatorio.setIcon(e.getIcone());
                relatorio.setText(e.getMessage());
                click = !click;
            }




        }
        montatabuleiro();
        




    }

    private boolean continuajogada(int[] atual)
    {
        int[] alvo1 = new int[2];     
        int[]alvo2=new int[2];
        
      
        
        alvo1[0] = (meutab.getpeça(atual[0],atual[1]).getLado()==1) ? atual[0]+2:atual[0]-2;
        alvo1[1] = atual[1]+2;
        
        alvo2[0] = (meutab.getpeça(atual[0],atual[1]).getLado()==1) ? atual[0]+2:atual[0]-2;
        alvo2[1] = atual[1]-2;
            
        
        if((
         (alvo1[0]>7)||
         (alvo1[0]<0)||
         (alvo1[1]>7)||
         (alvo1[1]<0))||
         (alvo2[0]>7)||
         (alvo2[0]<0)||
         (alvo2[1]>7)||
         (alvo2[1]<0))
        {return false;}
                
                
        System.out.print("\n\n\n"+RegrasDojogo.validajogada(atual,alvo1)[0]+""+
                RegrasDojogo.validajogada(atual,alvo1)[1]);
                
        
 return ((RegrasDojogo.validajogada(atual,alvo1)!=null)&&(meutab.getpeça(alvo1[0],alvo1[1]).getIcone()==null))? true:
    ((RegrasDojogo.validajogada(atual,alvo2)!=null)&&(meutab.getpeça(alvo1[0],alvo1[1]).getIcone()==null))? true:
                                                               false;
      
    
    }
    
    public void rodada() {
        Turno.passavez();

        Ljogador.setIcon(Turno.getJogadorDavez().getCorPeça());

        Ljogador.setText(Turno.getJogadorDavez() + "");

    }

    private void verificaseganhou() {

        if (jogador1.getQtdpeças() == 0) {

            JOptionPane.showMessageDialog(null, "O jogador : " + jogador2.getNome() + " GANHOU !!!");

            reiniciar();

        } else {
            if (jogador2.getQtdpeças() == 0) {
                JOptionPane.showMessageDialog(null, "O jogador : " + jogador1.getNome() + " GANHOU !!!");
                reiniciar();
            }

        }
    }

   public void atualizajogador(int[] atual) {
        if (RegrasDojogo.validajogada(anterior, atual) == null) {

            return;
        }

        int[] peça = RegrasDojogo.validajogada(anterior, atual);
        //VALIDA O PRIMEIRO JOGADOR

        if ((meutab.getCasa(peça[0], peça[1]) == jogador1.getCorPeça())
                && (meutab.getCasa(anterior[0], anterior[1]) != jogador1.getCorPeça())) {
            jogador1.setQtdpeças();
         

        }
        //VALIDA O SEGUNDO JOGADOR
        if ((meutab.getCasa(peça[0], peça[1]) == jogador2.getCorPeça())
                && (meutab.getCasa(anterior[0], anterior[1]) != jogador2.getCorPeça())) {
            jogador2.setQtdpeças();
         

        }


    }

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked

        int[] casa = {0, 1};
        jogada(casa);


    }//GEN-LAST:event_C1MouseClicked

private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked

    int[] casa = {0, 3};
    jogada(casa);

}//GEN-LAST:event_C2MouseClicked

private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
    int[] casa = {0, 5};
    jogada(casa);
}//GEN-LAST:event_C3MouseClicked

private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
    int[] casa = {0, 7};
    jogada(casa);
}//GEN-LAST:event_C4MouseClicked

private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
    int[] casa = {1, 0};
    jogada(casa);
}//GEN-LAST:event_C5MouseClicked

private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
    int[] casa = {1, 2};
    jogada(casa);

}//GEN-LAST:event_C6MouseClicked

private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
    int[] casa = {1, 4};
    jogada(casa);
}//GEN-LAST:event_C7MouseClicked

private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
    int[] casa = {1, 6};
    jogada(casa);
}//GEN-LAST:event_C8MouseClicked

private void C9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseClicked
    int[] casa = {2, 1};
    jogada(casa);
}//GEN-LAST:event_C9MouseClicked

private void C10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseClicked
    int[] casa = {2, 3};
    jogada(casa);
}//GEN-LAST:event_C10MouseClicked

private void C11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C11MouseClicked
    int[] casa = {2, 5};
    jogada(casa);
}//GEN-LAST:event_C11MouseClicked

private void C12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C12MouseClicked
    int[] casa = {2, 7};
    jogada(casa);
}//GEN-LAST:event_C12MouseClicked

private void C13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C13MouseClicked
    int[] casa = {3, 0};
    jogada(casa);
}//GEN-LAST:event_C13MouseClicked

private void C14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C14MouseClicked
    int[] casa = {3, 2};
    jogada(casa);
}//GEN-LAST:event_C14MouseClicked

private void C15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C15MouseClicked
    int[] casa = {3, 4};
    jogada(casa);
}//GEN-LAST:event_C15MouseClicked

private void C16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C16MouseClicked
    int[] casa = {3, 6};
    jogada(casa);
}//GEN-LAST:event_C16MouseClicked

private void C17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C17MouseClicked
    int[] casa = {4, 1};
    jogada(casa);



}//GEN-LAST:event_C17MouseClicked

private void C18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C18MouseClicked
    int[] casa = {4, 3};
    jogada(casa);
}//GEN-LAST:event_C18MouseClicked

private void C19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C19MouseClicked
    int[] casa = {4, 5};
    jogada(casa);
}//GEN-LAST:event_C19MouseClicked

private void C20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C20MouseClicked
    int[] casa = {4, 7};
    jogada(casa);
}//GEN-LAST:event_C20MouseClicked

private void C21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C21MouseClicked
    int[] casa = {5, 0};
    jogada(casa);
}//GEN-LAST:event_C21MouseClicked

private void C22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C22MouseClicked
    int[] casa = {5, 2};
    jogada(casa);
}//GEN-LAST:event_C22MouseClicked

private void C23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C23MouseClicked
    int[] casa = {5, 4};
    jogada(casa);
}//GEN-LAST:event_C23MouseClicked

private void C24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C24MouseClicked
    int[] casa = {5, 6};
    jogada(casa);
}//GEN-LAST:event_C24MouseClicked

private void C25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C25MouseClicked
    int[] casa = {6, 1};
    jogada(casa);
}//GEN-LAST:event_C25MouseClicked

private void C26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C26MouseClicked
    int[] casa = {6, 3};
    jogada(casa);
}//GEN-LAST:event_C26MouseClicked

private void C27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C27MouseClicked
    int[] casa = {6, 5};
    jogada(casa);
}//GEN-LAST:event_C27MouseClicked

private void C28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C28MouseClicked
    int[] casa = {6, 7};
    jogada(casa);
}//GEN-LAST:event_C28MouseClicked

private void C29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C29MouseClicked
    int[] casa = {7, 0};
    jogada(casa);
}//GEN-LAST:event_C29MouseClicked

private void C30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C30MouseClicked
    int[] casa = {7, 2};
    jogada(casa);
}//GEN-LAST:event_C30MouseClicked

private void C31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C31MouseClicked
    int[] casa = {7, 4};
    jogada(casa);
}//GEN-LAST:event_C31MouseClicked

private void C32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C32MouseClicked
    int[] casa = {7, 6};
    jogada(casa);
}//GEN-LAST:event_C32MouseClicked

private void C22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C22MouseEntered
}//GEN-LAST:event_C22MouseEntered

private void C10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseEntered
}//GEN-LAST:event_C10MouseEntered

private void C10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseExited
}//GEN-LAST:event_C10MouseExited

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
jogador1.resetar();
jogador2.resetar();

meutab=new Tabuleiro();
meutab.adicionaPeças1(jogador1.getCorPeça(),jogador1.getCOR());
meutab.adicionaPeças2(jogador2.getCorPeça(),jogador2.getCOR());

montatabuleiro();

}//GEN-LAST:event_jButton2MouseClicked

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
reiniciar();

}//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Interface i = new Interface();
                i.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C11;
    private javax.swing.JLabel C12;
    private javax.swing.JLabel C13;
    private javax.swing.JLabel C14;
    private javax.swing.JLabel C15;
    private javax.swing.JLabel C16;
    private javax.swing.JLabel C17;
    private javax.swing.JLabel C18;
    private javax.swing.JLabel C19;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C20;
    private javax.swing.JLabel C21;
    private javax.swing.JLabel C22;
    private javax.swing.JLabel C23;
    private javax.swing.JLabel C24;
    private javax.swing.JLabel C25;
    private javax.swing.JLabel C26;
    private javax.swing.JLabel C27;
    private javax.swing.JLabel C28;
    private javax.swing.JLabel C29;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C30;
    private javax.swing.JLabel C31;
    private javax.swing.JLabel C32;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel Ljogador;
    private javax.swing.JLabel Tabuleiro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel relatorio;
    // End of variables declaration//GEN-END:variables
}
