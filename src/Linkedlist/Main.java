package Linkedlist;

public class Main {
    public static void main(String[] args) {
//       LL list= new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(66);
//        list.insert(100,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();


//     DLL list= new DLL();
//     list.insertFirst(3);
//     list.insertFirst(2);
//     list.insertFirst(8);
//     list.insertFirst(17);
//     list.insertLast(89);
//     list.insert(2,45);
//     list.diplay();

        CLL list = new CLL();
        list.insert(33);
        list.insert(23);
        list.insert(13);
        list.insert(76);
        list.display();
        list.delete(23);
        list.display();
    }
}
