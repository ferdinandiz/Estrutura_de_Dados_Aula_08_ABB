package com.aula;

import com.aula.classes.AVLTree;
import com.aula.classes.BinarySearchTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        AVLTree<Integer> avl = new AVLTree<>(Integer::compare);
        for (int v : Arrays.asList(9,7,15,3,1,10,19,14,2,5)){
            bst.add(v);
            avl.insert(v);
        }
        System.out.println("-------- Árvore Binária de Busca --------");
        System.out.println("Valores em Ordem: "+bst);
        System.out.println("Tamanho: "+bst.size());
        System.out.println("Altura: "+bst.height());
        System.out.println("Maximo: "+bst.max());
        System.out.println("Minimo: "+bst.min());
        System.out.println();
        System.out.println("-------- Árvore AVL --------");

        System.out.println("Valores em Ordem: ");
        avl.printInOrder();
        System.out.print("Pre Ordem: ");
        avl.printPreOrder();
        System.out.print("Pos Ordem: ");
        avl.printPostOrder();
        System.out.println();
        System.out.println();
        System.out.println("Contem 15? "+avl.search(15));
        System.out.println("Contem 8? "+avl.search(8));
        avl.printTree();
        bst.remove(9);
        System.out.println("Apos remover o 9:");
        System.out.println();
        System.out.println();
        avl.printTree();
        avl.remove(10);
        avl.remove(15);
        avl.remove(5);
        avl.remove(3);
        System.out.println();
        System.out.println("Apos remoção!");
        avl.printTree();

    }
}