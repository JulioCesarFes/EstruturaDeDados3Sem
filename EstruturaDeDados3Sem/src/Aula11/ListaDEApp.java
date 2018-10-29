/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author aluno
 */
public class ListaDEApp {
    public static void main(String[] args) {

        ListaDE l = new ListaDE();

        System.out.println (" >>> Adicionando 8.99, 3.43, 8.56 e 5.5 no fim");
        l.insere_fim (8.99); l.insere_fim (3.43); l.insere_fim (8.56); l.insere_fim (5.5);
        System.out.print (" Imprimindo Lista inicio ao fim: "); l.imprime_inicio ();

        System.out.print (" Imprimindo Lista fim ao inicio: "); l.imprime_fim ();

        System.out.println (" >>> Adicionando 0 na posicao 2"); l.insere (2,0);
        System.out.println (" >>> Adicionando 15 no fim"); l.insere_fim (15);
        System.out.print (" Imprimindo Lista inicio ao fim: "); l.imprime_inicio ();

        System.out.print (" Imprimindo Lista fim ao inicio: "); l.imprime_fim ();

        System.out.println (" >>> Removendo todos os itens da lista do inicio ao fim:");
        while (!l.vazio () ) {
            System.out.println(" Apagado {" + l.item_frente() + "}");
            l.apaga(l.item_frente());
        }
    }
}
