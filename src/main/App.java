package main;

import java.util.List;
import java.util.LinkedList;

import main.Materia.Ejercicio_01_insert.InsertBST;
import main.Materia.Ejercicio_02_invert.InvertBinaryTree;
import main.Materia.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import main.Materia.Ejercicio_03_listLeves.ListLevels; 
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        // Ejercicio 1
        System.out.println("\n Ejercicio 01: Insertar en BST");
        InsertBST bst = new InsertBST();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int val : valores) bst.insertar(val);
        bst.imprimirEnOrden(bst.getRaiz());

        // Ejercicio 2
        System.out.println("\n\n Ejercicio 02: Invertir Árbol");
        Node raiz = crearArbolBase();
        InvertBinaryTree ai = new InvertBinaryTree();
        Node invertido = ai.invertir(raiz);
        ai.imprimirPreOrden(invertido);

        // Ejercicio 3
        System.out.println("\n\n Ejercicio 03: Listar niveles");
        raiz = crearArbolBase();
        ListLevels ln = new ListLevels();
        List<List<Node>> niveles = ln.listLevels(raiz);
        for (List<Node> nivel : niveles) {
            for (Node nodo : nivel) System.out.print(nodo.getValue() + " -> ");
            System.out.println("null");
        }


        // Ejercicio 4
        System.out.println("\n Ejercicio 04: Profundidad");
        raiz = crearArbolBase();
        raiz.getLeft().getLeft().setLeft(new Node(8)); 
        Depth depth = new Depth();
        System.out.println("Profundidad máxima: " + depth.maxDepth(raiz));
    }

    public static Node crearArbolBase() {
        Node raiz = new Node(4);
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getRight().setLeft(new Node(6));
        raiz.getRight().setRight(new Node(9));
        return raiz;
    }

}
