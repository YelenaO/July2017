package linearyLinkedList;

/**
 * Created by Lena on 22.07.2017.
 */
public class DoublyLinkedList {
    private LeLinked firstElement;
    private LeLinked lastElement;


    public void addFront(int data){
        LeLinked a = new LeLinked();
        a.data = data;

        if (firstElement == null){
            lastElement = a;
            firstElement = a;

        } else{
            firstElement.previous = a;
            a.next = firstElement;
            firstElement = a;

        }
    }

    public void addBack(int data){
        LeLinked a = new LeLinked();
        a.data = data;
        if (lastElement == null){
            lastElement = a;
            firstElement = a;

        } else{
            lastElement.next = a;
            a.previous = lastElement;
            lastElement = a;
        }

    }

    public void addAnywhere(int index, int data){
        LeLinked a = new LeLinked();
        a.data = data;
        LeLinked b = firstElement;
        LeLinked k = new LeLinked();
        int n = 0;
        try{
            while(n < index){
                k = b;
                b = b.next;
                n++;
            }
            k.next.previous = a;
            a.next = k.next;
            k.next = a;
            a.previous = k;
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public void printList(){
        LeLinked p = firstElement;
        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public void delEl(int index){
        LeLinked k = firstElement;
        LeLinked a = new LeLinked();

        if (index == 0){
            firstElement = k.next;
        }

        int n = 0;
        try {
            while (n < index) {
                a = k;
                k = k.next;
                n++;
            }
            a.next = k.next;
            a.previous = k;


        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public void delEl(){
        delEl(0);
    }
}
