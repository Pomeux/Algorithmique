package com.algo;

import com.algo.list.ListChain;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListChain<Integer> s=new ListChain<Integer>(true);
    s.add(1,0);

    s.add(2,1);
    s.add(3,2);
    s.add(4,0);
    s.add(5,4);
    s.add(6,2);
    s.add(7,5);

        System.out.println(s);
    s.delete(7);

        //s.add(2);
    //s.add(3);

    System.out.println(s);
    }
}