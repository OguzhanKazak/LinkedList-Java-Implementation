package com.company;

public class LinkedList {

    private Node header; //initial node.
    private Node lastNode;

    public int size; //Size of linkedlist data structure it'll updated in every modify

    public LinkedList(){
        header=new Node(null);
        lastNode = header;
        size = 0;
    }

    public void prepend(Object data){
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
            size++;
        }
        else{
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    }
    public void append(Object data){
        Node n = new Node(data);
        if(size ==0) {
            header.next = n;
            lastNode = n;
            size++;
        }
        else{
            lastNode.next = n;
            lastNode = n;
            size++;

        }
    }

    public void removeFirst() {

        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            header.next = header.next.next;
            size--;
        }
    }

    public void removeLast(){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        else if(size == 1){
            header.next = null;
            lastNode = header;
            size--;
        }
        else{
            Node n = header.next;
            int count = 1;
            while(count != size-1){
                n = n.next;
                count++;
            }
            lastNode = n;
            lastNode.next = null;
            size--;

        }
    }
    public void insertAt(int index,Object data){

        if(size<index) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else if(index == 0 ){
            prepend(data);

        }
        else if (index == size){
            append(data);

        }
        else{
            size++;
            Node n = new Node(data);
            Node x =header.next;
            int count = 1;
            while(count == index-1){
                x=x.next;
                count++;
            }
            Node temp = x.next;
            x.next=n;
            n.next = temp;


        }
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        Node n =header.next;
        String temp = "";
        while(n != null){
            temp=temp + n.data.toString()+",";
            n = n.next;
        }
        return temp;
    }

}
