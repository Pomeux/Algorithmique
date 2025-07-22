package com.algo.tree;

public class BinarySearchTree<T> extends BinaryTree<T>{

    public BinarySearchTree(T val,BinarySearchTree<T> left,BinarySearchTree<T> right) {
        super(val,right,left);

    }
}
