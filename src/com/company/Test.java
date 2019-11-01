package com.company;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) throws Exception {
        Stack<Integer> stack = new Stack();
        stack.push(16);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(12);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(5));
        System.out.println(stack.remove(5));
        System.out.println(stack.contains(5));
        System.out.println(stack.contains(19));
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        stack.addAll(stack2);

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);

//        stack.remove(1);
        stack.removeAll(arr);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
