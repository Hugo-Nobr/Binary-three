package Arvore;

public class Nodo {

    //Atributos do objeto Nodo
    public int numero;
    public Nodo esquerda;
    public Nodo direita;

    //Construtor do Objeto nodo
    public Nodo(int numero) {
        this.numero = numero;
        this.esquerda = null;
        this.direita = null;

    }
}
