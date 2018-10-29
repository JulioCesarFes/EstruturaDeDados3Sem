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
public class ListaDE {
    private No primeiro;
    private No ultimo;
    
    public ListaDE(){
        primeiro = null;
        ultimo = null;
    }
    
    public boolean vazio(){return (primeiro == null && ultimo == null);}
    public double item_frente(){return primeiro.item;}
    public double item_fim(){return ultimo.item;}
    public void insere_fim(double value){
        No newNo = new No();
        newNo.item = value;
        if(vazio()){
            primeiro = newNo;
            ultimo = newNo;
        } else {
            ultimo.prox = newNo;
            newNo.ant = ultimo;
        }
        ultimo = newNo;
    }
    public boolean pesquisa(double chave){
        No atual = primeiro;
        while(atual != null){
            if(atual.item == chave) return true;
            atual = atual.prox;
        }
        return false;
    }
    public No pesquisa_referencia(double chave){
        No atual = primeiro;
        while(atual != null){
            if(atual.item == chave) return atual;
            atual = atual.prox;
        }
        return null;
    }
    public void imprime_inicio(){
        No atual = primeiro;
        while(atual != null){
            System.out.print("{" + atual.item + "} ");
            atual = atual.prox;
        }
        System.out.println("");
    }
    public void imprime_fim(){
        No atual = ultimo;
        while(atual != null){
            System.out.print("{" + atual.item + "} ");
            atual = atual.ant;
        }
        System.out.println("");
    }
    public void apaga(double valor){
        No atual = pesquisa_referencia(valor);
        
        if(atual == null) return;
        if(atual == primeiro && atual == ultimo){
            primeiro = null;
            ultimo = null;
            return;
        }
        if(atual == primeiro){
            primeiro = primeiro.prox;
            primeiro.ant = null;
            return;
        }
        if(atual == ultimo){
            ultimo = ultimo.ant;
            ultimo.prox = null;
            return;
        }
        No prox = atual.prox;
        No ant = atual.ant;
        prox.ant = ant;
        ant.prox = prox;
    }
    public void insere(int pos, double valor){
        if(pos < 0) return;
        No novo = new No();
        novo.item = valor;
        if(pos == 0){
            novo.prox = primeiro;
            primeiro.ant = novo;
            novo.ant = null;
            primeiro = novo;
            return;
        }
        for (int i = 0; i < pos; i++) {
            
        }
    }
}