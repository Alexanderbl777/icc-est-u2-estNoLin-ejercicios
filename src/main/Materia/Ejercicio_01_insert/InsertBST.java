package main.Materia.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
    private Node raiz;

    public Node insertar(Node nodo, int valor) {
        if (nodo == null) {
            return new Node(valor);
        }

        if (valor < nodo.getValue()) {
            nodo.setLeft(insertar(nodo.getLeft(), valor));
        } else if (valor > nodo.getValue()) {
            nodo.setRight(insertar(nodo.getRight(), valor));
        }

        return nodo;
    }

    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    public Node getRaiz() {
        return raiz;
    }

    public void imprimirEnOrden(Node nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.getLeft());
            System.out.print(nodo.getValue() + " ");
            imprimirEnOrden(nodo.getRight());
        }
    }

    public static void main(String[] args) {
        InsertBST arbol = new InsertBST();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int val : valores) {
            arbol.insertar(val);
        }
        arbol.imprimirEnOrden(arbol.getRaiz());
    }
}

