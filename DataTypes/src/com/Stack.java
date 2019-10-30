package com;

public class Stack {
    Element last;
    Element beforeLast;

    public void push(String str){
        Element temp = last;
        last = new Element(str, temp);
        beforeLast = temp;
    }

    public int size(){
        int i;
        Element temp = last.prev;

        for(i = 1; temp != null; i++){
            temp = temp.prev;
        }
        return i;
    }

    public String pick() throws Exception{
        if(last.s != null) {
            return last.s;
        } else {
            throw new Exception("Stack is empty");
        }
    }

    public String pop() throws Exception {
        if(last == null) throw new Exception("Stack is full!");
        String s = last.s;
        last = beforeLast;
        if(beforeLast != null) {
            beforeLast = beforeLast.prev;
        } else {
            beforeLast = null;
        }
        return s;
    }
}
