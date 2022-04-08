package Arvore;

public class Arvore {

    //Atributo raiz do Nodo
    public Nodo raiz;

    //Metodo para inserir um novo nodo na árvore
    public void inserir(Nodo novo) {
        //Verifica se existe uma raiz, caso não exista ele cria uma
        if (raiz == null) {
            this.raiz = novo;
        } else {
            Nodo aux = raiz;
            //Loop de repetição para enquanto a varivel auxiliar for diferente de null
            while (aux != null) {
                //Verifica se o número é menor que o número da raiz e o adiciona a esquerda da raiz
                if (novo.numero < aux.numero) {
                    //Verifica se a esquerda está vazia e define a aux como esquerda
                    if (aux.esquerda == null) {
                        aux.esquerda = novo;
                        break;
                    }
                    //Adiciona o um novo valor a variavel auxiliar
                    aux = aux.esquerda;
                } else {
                    //Se não, verifica se o valor a direita do nodo é null e preenche o valor a direita dele.
                    if (aux.direita == null) {
                        aux.direita = novo;
                        break;
                    }
                    //Adiciona um novo valor a variável auxiliar
                    aux = aux.direita;
                }
            }
        }
    }
    //Significado das letras que serão utilizadas abaixo:
    //D: Direita
    //E: Esquerda
    //R: Raiz

    //Metodo que retorna os valores da árvore de maneira pré-ordenada(R,E,D)
    public void arvorePreOrdenada(Nodo nodo){
        //se nodo nao for null
        if(nodo != null){
            System.out.print(nodo.numero + " ");
            //Faz uma chamada recursiva passando o nodo atual da esquerda como um novo valor até ser null
            arvorePreOrdenada(nodo.esquerda);
            //Faz uma chamada recursiva passando o nodo atual da direita como um novo valor até ser null
            arvorePreOrdenada(nodo.direita);
        }
    }

}
