package Linkedlist;

import java.security.PrivateKey;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next= node;
        tail = node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }

        Node temp= head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next= node;
        size++;
    }


     public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail= secondLast;
        tail.next= null;
        return val;
     }

     public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index== size-1){
            return deleteLast();
        }
        Node prev= get(index-1);
        int val = prev.value;

        prev.next= prev.next.next;
        return val;
     }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;

        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head= head.next;
        if(head== null){
            tail= null;
        }
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }
    private class Node{
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    // questions
    public void duplicates(){
        Node node = head;

        while (node.next != null){
            if(node.value ==  node.next.value){
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    // merge to sorted array
    public static LL merge (LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans= LL.merge(first,second);
        ans.display();
    }

//    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.display();
//        list.duplicates();
//        list.display();
//
//    }


}
