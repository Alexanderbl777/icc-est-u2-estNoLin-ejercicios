package main.Materia.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node nodo) {
        if (nodo == null) return 0;
        int izquierda = maxDepth(nodo.getLeft());
        int derecha = maxDepth(nodo.getRight());
        return Math.max(izquierda, derecha) + 1;
    }

    public static void main(String[] args) {
        Node raiz = new Node(4);
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getLeft().getLeft().setLeft(new Node(8)); // Profundidad = 4

        Depth depthCalc = new Depth();
        System.out.println("Profundidad máxima: " + depthCalc.maxDepth(raiz));
    }
}
