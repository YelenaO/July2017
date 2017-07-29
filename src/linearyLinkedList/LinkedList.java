package linearyLinkedList;

public class LinkedList {
    private LeLinked firstElement;


    public void addFront(int data){
        LeLinked a = new LeLinked();
        a.data = data;

        //IndexOutOfBoundsException
        if (firstElement == null){
            firstElement = a;

        } else{
            a.next = firstElement;
            firstElement = a;
        }
    }

    public void addBack(int data){
        LeLinked a = new LeLinked();
        LeLinked b = firstElement;
        a.data = data;
        while (b.next != null){
            b = b.next;
        }
        b.next = a;

    }

    public void addAnywhere(int index, int data){
        LeLinked a = new LeLinked();
        a.data = data;
        LeLinked b = firstElement;
        LeLinked k = new LeLinked();
        int n = 0;
        try {
            while (n < index) {
                k = b;
                b = b.next;
                n++;
            }
            k.next = a;
            a.next = b;
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
        int n = 0;
        try {
            while (n < index) {
                a = k;
                k = k.next;
                n++;
            }
            a.next = k.next;
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
