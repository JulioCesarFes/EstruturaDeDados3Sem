/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author Julio Ferreira
 */
public class No {
    public double item; // espaço para armazenamento de informação
    public No prox;     // Referência do próximo da fila
    public No ant;      // Referência do anterior da fila
    public No(){
        prox = null;
        ant = null;
    }
}