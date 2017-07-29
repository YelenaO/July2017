package linearyLinkedList;

/**
 * Created by Lena on 14.07.2017.
 */
public class Main {
    public static void main(String[] args) throws NullPointerException{
        LinkedList m = new LinkedList();
        DoublyLinkedList d = new DoublyLinkedList();
        m.addFront(1);
        m.addFront(0);
        m.addBack(1);
        m.addBack(2);
        m.addAnywhere(2, 733);
        m.addAnywhere(70, 855);//nullPEx

        m.printList();
        System.out.println();
        m.delEl(2);
        m.delEl(55);//nullPEx
        m.printList();
        System.out.println();
        System.out.println();
        d.addFront(20);
        d.addFront(10);
        d.addBack(40);
        d.addBack(60);
        d.addAnywhere(3, 33);
        d.addAnywhere(8, 63);////nullPEx
        d.printList();
        System.out.println();
        d.delEl(1);
        d.delEl(70);//nullPEx
        d.printList();
        System.out.println();
        System.out.println();
        d.delEl();
        d.printList();
    }
}
