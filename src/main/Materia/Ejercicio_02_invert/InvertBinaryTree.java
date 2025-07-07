package main.Materia.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertir(Node raiz) {
        if (raiz == null) return null;

        Node izquierda = invertir(raiz.getLeft());
        Node derecha = invertir(raiz.getRight());

        raiz.setLeft(derecha);
        raiz.setRight(izquierda);

        return raiz;
    }

    public void imprimirPreOrden(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValue() + " ");
            imprimirPreOrden(nodo.getLeft());
            imprimirPreOrden(nodo.getRight());
        }
    }

    public static void main(String[] args) {
        Node raiz = new Node(4);
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getRight().setLeft(new Node(6));
        raiz.getRight().setRight(new Node(9));

        InvertBinaryTree ai = new InvertBinaryTree();
        Node invertido = ai.invertir(raiz);
        ai.imprimirPreOrden(invertido);
    }
}
