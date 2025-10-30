package com.aula;

import com.aula.classes.BinarySearchTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int v : Arrays.asList(9,7,15,3,1,10,19,14,2,5)){
            bst.add(v);
        }
        System.out.println("Valores em Ordem: "+bst);
        System.out.println("Tamanho: "+bst.size());
        System.out.println("Altura: "+bst.height());
        System.out.println("Maximo: "+bst.max());
        System.out.println("Minimo: "+bst.min());
        System.out.print("Pre Ordem: ");
        bst.preOrder(x-> System.out.print(x+" "));
        System.out.println();
        System.out.print("Pos Ordem: ");
        bst.postOrder(x-> System.out.print(x+" "));
        System.out.println();
        System.out.print("Em largura (BFS): ");
        bst.levelOrder(x-> System.out.print(x+" "));
        System.out.println();
        bst.printArvore(0);
        bst.remove(9);
        System.out.println();
        bst.printArvore(0);
        bst.remove(10);
        bst.remove(15);
        bst.remove(2);
        bst.remove(5);
        System.out.println();
        System.out.println();
        System.out.println("Apos remoção!");
        System.out.println("Valores em Ordem: "+bst);
        System.out.print("Pre Ordem: ");
        bst.preOrder(x-> System.out.print(x+" "));
        System.out.println();
        System.out.print("Pos Ordem: ");
        bst.postOrder(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println();
        bst.printArvore(0);

    }
}