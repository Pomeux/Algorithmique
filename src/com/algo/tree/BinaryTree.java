package com.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private BinaryTree<T> left;
    private BinaryTree<T> right;
    private int size=1;
    private T val;

    public BinaryTree(T val) {

        this.val=val;

    }

    public BinaryTree(T val,BinaryTree<T> left,BinaryTree<T> right) {
        this.val=val;
        this.left=left;
        this.right=right;
    }
    public boolean is_leaf() {
        return left==null && right==null;
    }
    public boolean right_is_null() {
        return right==null;
    }
    public boolean left_is_null() {
        return left==null;
    }
    public T getVal() {
        return val;
    }
    private int get_size() {
        return size;
    }
    public T getValRight() {
        if(right==null)
            throw new IllegalArgumentException("à changer");
        return right.val;
    }
    public T getValLeft() {
        if(left==null)
            throw new IllegalArgumentException("aa");
        return left.val;
    }
    public BinaryTree<T> sub_tree_right() {
        return right;
    }
    public BinaryTree<T> sub_tree_left() {
        return left;
    }

    public List<T> post_fix() {
        return post_fix(this,new ArrayList<T>(size));
    }
    public List<T> pre_fix() {
        return pre_fix(this,new ArrayList<T>(size));
    }
    public List<T> infix() {
        return infix(this,new ArrayList<T>(size));
    }
    private List<T> post_fix(BinaryTree<T> tree,List<T> tab) {
        post_fix(tree.sub_tree_left(),tab);
        post_fix(tree.sub_tree_right(),tab);
        tab.addLast(tree.getVal());
        return tab;
    }
    private List<T> pre_fix(BinaryTree<T> tree,List<T> tab) {
        tab.addLast(tree.getVal());
        post_fix(tree.sub_tree_left(),tab);
        post_fix(tree.sub_tree_right(),tab);

        return tab;
    }
    private List<T> infix(BinaryTree<T> tree,List<T> tab) {
        post_fix(tree.sub_tree_left(),tab);
        tab.addLast(tree.getVal());
        post_fix(tree.sub_tree_right(),tab);

        return tab;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(!(o instanceof BinaryTree)) return false;
        BinaryTree<T> t=(BinaryTree<T>) o;


        return val.equals(t.val) && left.equals(t.left) && right.equals(t.right);
    }

    @Override
    public String toString() {
        return "";
    }
}
