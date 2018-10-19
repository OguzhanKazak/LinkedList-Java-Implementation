package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.append(0);
        linkedList.append(1);
        linkedList.append(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.insertAt(0,"First Object");
        System.out.println(linkedList);
        linkedList.removeLast();
        linkedList.append("LastObject");
        System.out.println(linkedList);
    }
}
