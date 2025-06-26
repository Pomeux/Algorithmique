package com.algo.tree;

public class BinaryTree<T> {
    private BinaryTree<T> left;
    private BinaryTree<T> right;
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
