/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12;

/**
 *
 * @author aluno
 */
class HashTable {
    private ELEMENTO[] tabHash;
    private int tam_max;
    
    public HashTable(int tam) {
        tabHash = new ELEMENTO[tam];
        tam_max = tam;
        for(int i=0; i<tam_max; i++)
            tabHash[i] = new ELEMENTO(false);
    }
    private int funcaohash(double chave) {
        int v = (int) chave;
        return ( Math.abs(v) % tam_max );
    }

    public void insere(double valor) {
        int pos = funcaohash(valor);
        if ( !tabHash[pos].ocupado ) {
            tabHash[pos].item = valor;
            tabHash[pos].ocupado = true;
            System.out.print("-> Inseriu na posicao " + pos);
        }
        else
            System.out.print("-> Ocorreu uma colisao na posicao " + pos + ", item " + valor + " NAO inserido");
    }
    public int busca(double chave) {
        int pos = funcaohash(chave);
        if (tabHash[pos].ocupado && tabHash[pos].item == chave)
            return pos;
        return -1;
    }
    public void apaga(double chave) {
        int pos = busca(chave);
        if (pos != -1) {
            tabHash[pos].ocupado = false;
            System.out.print("-> Dados da posicao " + pos + " apagados");
        }
        else System.out.print("Item nao encontrado");
    }
    public void imprime() {
        for (int i=0; i<tam_max; i++)
            if ( tabHash[i].ocupado )
                System.out.print("\nHash[" + i + "] = " + tabHash[i].item);
    }
}