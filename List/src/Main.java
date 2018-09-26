import java.util.*;

public class Main {

    public static <S> void main(String[] args) {


        //Implementing Linked List Method


        LinkedList<String> list=new LinkedList<String>();
        int size = list.size();
        list.insert(new LinkedListNode<String>("Manish"));
        list.insert(new LinkedListNode<String>("Pandit"));
        list.insert(new LinkedListNode<String>("Tanvi"));
        list.insert(new LinkedListNode<String>("Monika"));
        list.print();
        list.remove();


        System.out.println("length of ArrayList after adding elements: " + size);

        System.out.println("After removing the head..");
        list.print();

        //implementing set methode

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);

        // Set demonstration using TreeSet


        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);

        //Implementing Deque method

        Deque<String> dq = new ArrayDeque<String>();

        dq.add("Montu");
        dq.add("Patel");
        dq.addLast("Bhushan");
        dq.addFirst("Black Mamba");
        dq.add("Kadiya");

        System.out.println("Elements in Deque:"+dq);

        System.out.println("Removed element: "+dq.removeLast());

        System.out.println("Head: "+dq.element());

        System.out.println("poll(): "+dq.pollLast());

        System.out.println("peek(): "+dq.peek());

        System.out.println("Elements in Deque:"+dq);


        //Implementing Stack

        stack s = new stack();
        s.push(10);
        s.push(20);
        System.out.println("Top element :" + s.top());
        s.pop();
        s.push(30);
        s.pop();
        System.out.println("Top element :" + s.top());

        //Implemnting Queue Method


        Scanner scan = new Scanner(System.in);


        System.out.println("Array Queue Test\n");

        System.out.println("Enter Size of Integer Queue ");

        int n = scan.nextInt();

        //                                                                    creating object of class arrayQueue

        arrayQueue q = new arrayQueue(n);

        //                                                                Perform Queue Operations

        char ch;

        do {

            System.out.println("\nQueue Operations");

            System.out.println("1. insert");

            System.out.println("2. remove");

            System.out.println("3. peek");

            System.out.println("4. check empty");

            System.out.println("5. check full");

            System.out.println("6. size");

            int choice = scan.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter integer element to insert");

                    try {

                        q.insert(scan.nextInt());

                    } catch (Exception e) {

                        System.out.println("Error : " + e.getMessage());

                    }

                    break;

                case 2:

                    try {

                        System.out.println("Removed Element = " + q.remove());

                    } catch (Exception e) {

                        System.out.println("Error : " + e.getMessage());

                    }

                    break;

                case 3:

                    try {

                        System.out.println("Peek Element = " + q.peek());

                    } catch (Exception e) {

                        System.out.println("Error : " + e.getMessage());

                    }

                    break;

                case 4:

                    System.out.println("Empty status = " + q.isEmpty());

                    break;

                case 5:

                    System.out.println("Full status = " + q.isFull());

                    break;

                case 6:

                    System.out.println("Size = " + q.getSize());

                    break;

                default:
                    System.out.println("Wrong Entry \n ");

                    break;

            }

            /* display Queue */

            q.display();

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);


        } while (ch == 'Y' || ch == 'y');

    }
}