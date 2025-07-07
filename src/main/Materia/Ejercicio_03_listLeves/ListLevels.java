package main.Materia.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {  

    public List<List<Node>> listLevels(Node raiz) { 
        List<List<Node>> resultado = new ArrayList<>();
        if (raiz == null) return resultado;

        Queue<Node> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            int nivelTam = cola.size();
            List<Node> nivel = new ArrayList<>();

            for (int i = 0; i < nivelTam; i++) {
                Node actual = cola.poll();
                nivel.add(actual);

                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }

            resultado.add(nivel);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Node raiz = new Node(4);
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getRight().setLeft(new Node(6));
        raiz.getRight().setRight(new Node(9));

        ListLevels ln = new ListLevels();
        List<List<Node>> niveles = ln.listLevels(raiz);

        for (List<Node> nivel : niveles) {
            for (Node nodo : nivel) {
                System.out.print(nodo.getValue() + " -> ");
            }
            System.out.println("null");
        }
    }
}
