package com.algo;

import com.algo.list.ListChain;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListChain<Integer> s=new ListChain<Integer>(true);
    s.addFin(1);
    s.addFin(2);
    s.addFin(3);
    System.out.println(s);
    }
}