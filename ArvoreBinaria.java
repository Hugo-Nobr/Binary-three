package Arvore;


import java.util.Scanner;

public class ArvoreBinaria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Arvore arvore = new Arvore();

        System.out.println("Digite quantos nodos deseja inserir:");
        int numero = scan.nextInt();

        for(int i = 0; i <= numero; i++){
            System.out.println("Digite um n�mero:");
            int valorNodo = scan.nextInt();
            Nodo nodo = new Nodo(valorNodo);
            arvore.inserir(nodo);
        }
        
	        System.out.println("Arvore ordenada de maneira Pr�-Ordenada:");
	        arvore.arvorePreOrdenada(arvore.raiz);
	        System.out.println();

          
        

    }
}
