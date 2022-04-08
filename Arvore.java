package Arvore;

public class Arvore {

    //Atributo raiz do Nodo
    public Nodo raiz;

    //Metodo para inserir um novo nodo na �rvore
    public void inserir(Nodo novo) {
        //Verifica se existe uma raiz, caso n�o exista ele cria uma
        if (raiz == null) {
            this.raiz = novo;
        } else {
            Nodo aux = raiz;
            //Loop de repeti��o para enquanto a varivel auxiliar for diferente de null
            while (aux != null) {
                //Verifica se o n�mero � menor que o n�mero da raiz e o adiciona a esquerda da raiz
                if (novo.numero < aux.numero) {
                    //Verifica se a esquerda est� vazia e define a aux como esquerda
                    if (aux.esquerda == null) {
                        aux.esquerda = novo;
                        break;
                    }
                    //Adiciona o um novo valor a variavel auxiliar
                    aux = aux.esquerda;
                } else {
                    //Se n�o, verifica se o valor a direita do nodo � null e preenche o valor a direita dele.
                    if (aux.direita == null) {
                        aux.direita = novo;
                        break;
                    }
                    //Adiciona um novo valor a vari�vel auxiliar
                    aux = aux.direita;
                }
            }
        }
    }
    //Significado das letras que ser�o utilizadas abaixo:
    //D: Direita
    //E: Esquerda
    //R: Raiz

    //Metodo que retorna os valores da �rvore de maneira pr�-ordenada(R,E,D)
    public void arvorePreOrdenada(Nodo nodo){
        //se nodo nao for null
        if(nodo != null){
            System.out.print(nodo.numero + " ");
            //Faz uma chamada recursiva passando o nodo atual da esquerda como um novo valor at� ser null
            arvorePreOrdenada(nodo.esquerda);
            //Faz uma chamada recursiva passando o nodo atual da direita como um novo valor at� ser null
            arvorePreOrdenada(nodo.direita);
        }
    }

}
