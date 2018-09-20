import java.util.LinkedList;
import java.util.Queue;

public class stack implements List
{
    Queue<Integer> q = new LinkedList<Integer>();

    // Push
    void push(int val)
    {

        int size = q.size();                                                     // getting previous size of queue


        q.add(val);        // Add element

                                                     // Pop (or Dequeue) all previous
                                                       // elements and put them after current
        for (int i = 0; i < size; i++)
        {
             //                                   this will add front element into
            //                                     rear of queue
            int x = q.remove();
            q.add(x);
        }
    }

                                                                                      // Removes the top element
    int pop()
    {
        if (q.isEmpty())
        {
            System.out.println("No elements");
            return -1;
        }
        int x = q.remove();
        return x;
    }

                                                                                       // Returns top of stack
    int top()
    {
        if (q.isEmpty())
            return -1;
        return q.peek();
    }

                                                                                    // Returns true if Stack is empty else false
    boolean isEmpty()
    {
        return q.isEmpty();
    }

                               // Driver program to test above methods
    public static void main(String[] args)
    {

    }

    @Override
    public void add(Object item) {

    }

    @Override
    public void addAt(Object item, int position) {

    }

    @Override
    public int remove(Object item) {
        return 0;
    }

    @Override
    public int removeAt(int position) {
        return 0;
    }

    @Override
    public int contains(Object item) {
        return 0;
    }

    @Override
    public int addAtTail(Object item) {
        return 0;
    }

    @Override
    public int push(Object item) {
        return 0;
    }

    @Override
    public int pop(Object item) {
        return 0;
    }

    @Override
    public int delete(Object item) {
        return 0;
    }

    @Override
    public void addLast(Object item) {

    }

    @Override
    public void addFirst(Object item) {

    }

    @Override
    public int getData(Object item) {
        return 0;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public Object grabAt(int position) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void print() {

    }

    @Override
    public boolean clear() {
        return false;
    }
}