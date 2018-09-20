import java.util.*;

class arrayQueue implements List

{

    protected int Queue[] ;

    protected int front, rear, size, len;



    //                                              constructor

    public arrayQueue(int n)

    {

        size = n;

        len = 0;

        Queue = new int[size];

        front = -1;

        rear = -1;

    }

    //                             empty check
    public boolean isEmpty()

    {

        return front == -1;

    }

    //                                   Function to find if queue is full

    public boolean isFull()

    {

        return front==0 && rear == size -1 ;

    }

    /*  Function to get the size of the queue */

    public int getSize()

    {

        return len ;

    }

    //                                         Function to check front element of queue

    public int peek()

    {

        if (isEmpty())

            throw new NoSuchElementException("Underflow Exception");

        return Queue[front];

    }

    //                                           Function to insert element in queue

    public void insert(int i)

    {

        if (rear == -1)

        {

            front = 0;

            rear = 0;

            Queue[rear] = i;

        }

        else if (rear + 1 >= size)

            throw new IndexOutOfBoundsException("Overflow Exception");

        else if ( rear + 1 < size)

            Queue[++rear] = i;

        len++ ;

    }

    //                                     Function remove the front element from a queue

    public int remove()

    {

        if (isEmpty())

            throw new NoSuchElementException("Underflow Exception");

        else

        {

            len-- ;

            int ele = Queue[front];

            if ( front == rear)

            {

                front = -1;

                rear = -1;

            }

            else

                front++;

            return ele;

        }

    }

    //                                       display status of a queue

    public void display()

    {

        System.out.print("\nQueue = ");

        if (len == 0)

        {

            System.out.print("Empty\n");

            return ;

        }

        for (int i = front; i <= rear; i++)

            System.out.print(Queue[i]+" ");

        System.out.println();

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



/* Class QueueImplement  */

class QueueImplement implements List

{


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