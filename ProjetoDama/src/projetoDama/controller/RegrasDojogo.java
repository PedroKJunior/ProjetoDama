/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */package projetoDama.controller;

import projetoDama.view.MovimentoinvalidoException;

/**
 * @author Victor 146905
 * @author Junior 107855
 */
public class RegrasDojogo {

    public static Tabuleiro fazjogada(Tabuleiro tab, int[] primeira, int[] segunda)
            throws MovimentoinvalidoException {

        if (!validadireção(tab, primeira, segunda)) {
            
            if (tab.getpeça(primeira[0],primeira[1]).getLado()!=3){
            throw new MovimentoinvalidoException("Movimento para traz proíbido");
            }System.out.print("Movimento De Dama \n\n");
            
            
        }


        //ver se ele pretente fazer jogada, se as peças estão em posição
        if (validajogada(primeira, segunda) != null) {
            int[] alvo = validajogada(primeira, segunda);

            //se as peças estão em posição, ver se a peça a ser comida 
            //é a peça do adversario
            if ((tab.getCasa(alvo[0], alvo[1]) != tab.getCasa(primeira[0], primeira[1]))
                    && (tab.getCasa(alvo[0], alvo[1]) != null)) {

                tab.retirapeça(alvo);
                tab.moverpeça(primeira, segunda);
                
            
                
                
            } else {
                throw new MovimentoinvalidoException("Jogada não pode ser realizada");
            }

        } else { //se não, ele pode fazer um movimento simples
            if (validamover(tab, primeira, segunda)) {
                tab.moverpeça(primeira, segunda);

            } else {
                throw new MovimentoinvalidoException("Movimento proíbido");
            }



        }



        return tab;


    }

    public static boolean validamover(Tabuleiro tab, int[] primeira, int[] segunda) {

        return ((segunda[0] == (primeira[0] + 1)) || ((segunda[0] == (primeira[0] - 1))))
                ? ((segunda[1] == (primeira[1] + 1)) || (segunda[1] == (primeira[1] - 1)))
                ? //     (tab.getpeça(primeira[0],primeira[1]).getLado()==1)?
                true : false : false;


    }

    public static int[] validajogada(int[] primeira, int[] segunda) {

        int[] retorno = new int[2];

        if (((segunda[0] == (primeira[0] + 2)) || (segunda[0] == (primeira[0] - 2)))
                && ((segunda[1] == (primeira[1] + 2)) || (segunda[1] == (primeira[1] - 2)))) {

            //ESQUERDA CIMA
            if ((((segunda[0] + 1) == (primeira[0] - 1))
                    && ((segunda[1] + 1) == (primeira[1] - 1)))) {
                retorno[0] = segunda[0] + 1;
                retorno[1] = segunda[1] + 1;
                return retorno;
            }

            //DIREITA CIMA
            if (((segunda[0] + 1) == (primeira[0] - 1))
                    && ((segunda[1] - 1) == (primeira[1] + 1))) {
                retorno[0] = segunda[0] + 1;
                retorno[1] = segunda[1] - 1;
                return retorno;
            }



            //ESQUERDA BAIXO
            if ((((segunda[0] - 1) == (primeira[0] + 1))
                    && ((segunda[1] + 1) == (primeira[1] - 1)))) {
                retorno[0] = segunda[0] - 1;
                retorno[1] = segunda[1] + 1;
                return retorno;

            }
            // DIREITA BAIXO
            if ((((segunda[0] - 1) == (primeira[0] + 1))
                    && ((segunda[1] - 1) == (primeira[1] + 1)))) {
                retorno[0] = segunda[0] - 1;
                retorno[1] = segunda[1] - 1;
                return retorno;
            }

            //end if validação
        }
        return null;

    }

    public static boolean validadireção(Tabuleiro tab, int[] primeira, int[] segunda) {
        return ((tab.getpeça(primeira[0], primeira[1]).getLado() == 2) && (primeira[0] > segunda[0]))
                ? true
                : ((tab.getpeça(primeira[0], primeira[1]).getLado() == 1) && (primeira[0] < segunda[0]))
                ? true : false;



    }

    public static int[] novomover(Tabuleiro tab, int[] p) {

        if (tab.getpeça(p[0], p[1]).getLado() == 2) {
            int[] aux1 = {((p[0] + 1) < 8) ? (p[0] + 1) : -10,
                ((p[1] + 1) < 8) ? (p[1] + 1) : -10};


            int[] aux2 = {((p[0] + 1) < 8) ? (p[0] + 1) : -10,
                ((p[1] - 1) > 0) ? (p[1] - 1) : -10};

            return ((aux1[0] >= 0) && (aux1[1] >= 0)) ? aux1
                    : ((aux2[0] >= 0) && (aux2[1] >= 0)) ? aux2
                    : null;
        } else {
            int[] aux1 = {((p[0] - 1) > 0) ? (p[0] - 1) : -10,
                ((p[1] + 1) > 0) ? (p[1] - 1) : -10};


            int[] aux2 = {((p[0] - 1) > 0) ? (p[0] - 1) : -10,
                ((p[1] + 1) < 8) ? (p[1] - 1) : -10};

            return ((aux1[0] >= 0) && (aux1[1] >= 0)) ? aux1
                    : ((aux2[0] >= 0) && (aux2[1] >= 0)) ? aux2
                    : null;

        }

    }

    public static Tabuleiro Moversozinho(Tabuleiro tab, int lado) {

        for (int i = 0; i < 8; i++) {
            for (int a = 0; a < 8; a++) {

             if (tab.getpeça(i, a).getLado() == lado) {
               int[] peça = {i, a};
               int[] alvo = novomover(tab, peça);

               if (alvo == null) {
                    tab.moverpeça(peça, alvo);
                     return tab;
                   }
                }
            }
       }


        return tab;

    }
}
