class LinkedList<S> implements List
{

    private static Node head;
    private static int numNodes;



    public LinkedList(Object dat)
    {
        head = new Node(dat);
    }

    public LinkedList() {

    }

    public void addAtHead(Object dat)
    {
        Node temp = head;
        head = new Node(dat);
        head.next = temp;
        numNodes++;
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

    public int addAtTail(Object dat)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new Node(dat);
        numNodes++;
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

    public void addAtIndex(int index, Object dat)
    {
        Node temp = head;
        Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(dat);
        temp.next.next = holder;
        numNodes++;
    }

    public void deleteAtIndex(int index)
    {
        Node temp = head;
        for(int i=0; i< index - 1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public static int find(Node n)
    {
        Node t = head;
        int index = 0;
        while(t != n)
        {
            index++;
            t = t.next;
        }
        return index;
    }

    public static Node find(int index)
    {
        Node temp=head;
        for(int i=0; i<index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public static void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int getSize()
    {
        return numNodes;
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

    static class Node
    {
        //Declare class variables
        private Node next;
        private Object data;

        public Node(Object dat)
        {
            data = dat;
        }

        public Object getData()
        {
            return data;
        }
    }
}